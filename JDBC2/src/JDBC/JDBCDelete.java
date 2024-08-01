package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCDelete {
	public static void main(String[] args) {

		// delete도 같음- id를 입력받아서, 아이디에 해당하는 데이터를 delete하는 jdbc코드를 작성

		// 1. sql 접속 정보를 선언 ,
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "HR"; // 계정명
		String upw = "HR"; // 비번

		Scanner scan = new Scanner(System.in);

		System.out.println("아이디>");
		String id = scan.next();
		System.out.println("비밀번호>");
		String pw = scan.next();
		System.out.println("나이>");
		int age = scan.nextInt();
		System.out.println("이메일>");
		String email = scan.next();

		// Delete

		String sql = "DELETE FROM MEMBER WHERE ID = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("oracle.jdbc.OracleDriver");

			conn = DriverManager.getConnection(url, uid, upw);

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, id);

			// 성공했나 안됐나 표시
			int result = pstmt.executeUpdate();

			if (result == 1) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}

		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();

		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		
		
	}
}
