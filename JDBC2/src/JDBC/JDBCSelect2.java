package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCSelect2 {
	public static void main(String[] args) {

		// 직원테이블과 부서테이블을 left join 하고
		// 직원아이디, 직무아이디, 부서명, 이름만 출력합니다

		// 조건은 직원아이디를 입력받아서, 이 아이디에 해당하는 데이터만 출력한다

		// 1. sql 접속 정보를 선언
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "HR"; // 계정명
		String upw = "HR"; // 비번

		Scanner scan = new Scanner(System.in);

		System.out.println("직원아이디 입력하기");

		String id = scan.next();

		String sql = "SELECT E.EMPLOYEE_ID,\r\n"
				+ "    E.FIRST_NAME,\r\n"
				+ "    E.JOB_ID,\r\n"
				+ "    D.DEPARTMENT_NAME\r\n"
				+ "FROM EMPLOYEES E\r\n"
				+ "LEFT JOIN DEPARTMENTS D\r\n"
				+ "ON E.DEPARTMENT_ID =D.DEPARTMENT_ID\r\n"
				+ "WHERE E.EMPLOYEE_ID = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select 문에서

		try {
			Class.forName("oracle.jdbc.OracleDriver");

			conn = DriverManager.getConnection(url, uid, upw);

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);

			//
			// rs 는 select에서
			rs = pstmt.executeQuery();

			// 1행 2행... 100행 ...계속 반복
			while (rs.next()) {
				//
				int employeeId = rs.getInt("employee_id");
				String firstName = rs.getString("first_name");
				String jobId = rs.getString("job_id");
				String departmentId = rs.getString("department_name");

				System.out.println(employeeId);
				System.out.println(firstName);
				System.out.println(jobId);
				System.out.println(departmentId);
				System.out.println("----------");

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
				rs.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}
}
