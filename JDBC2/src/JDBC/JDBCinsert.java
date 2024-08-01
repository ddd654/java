package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCinsert {
	public static void main(String[] args) {
		// JDBC
		/*
		 * 1. 프로그램과 database 연결 2. 오라클에서 제공해주는 데이터베이스 연결 API가 필요 3. lib 폴더에 ojdbc.jar파일을
		 * 넣고, 이클립스에서 우클릭 > build path > module에 ojdbc 추가 4. 자바 11버전 이휴, module-info에
		 * java.sql 패키지를 추가
		 */

		// 1. sql 접속 정보를 선언 ,
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "HR"; // 계정명
		String upw = "HR"; // 비번

		// 2. JDBC 드라이버 호출
		// java.sql 패키지를 사용하는데, 내부 클래스들이 전부 throws로 처리되어,
		// try-catch문 안에서 시작

		Scanner scan = new Scanner(System.in);

		System.out.println("아이디>");
		String id = scan.next();
		System.out.println("비밀번호>");
		String pw = scan.next();
		System.out.println("나이>");
		int age = scan.nextInt();
		System.out.println("이메일>");
		String email = scan.next();

		// INSERT INTO 테이블
		// 실행시킬 SQL
		String sql = "INSERT INTO MEMBER(ID, FW, AGE, EMAIL) VALUES(?, ?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("oracle.jdbc.OracleDriver");

			// 3. SQL연결을 위한 Connetion객체 생성 DriverManager.

			conn = DriverManager.getConnection(url, uid, upw); // 주소, 아이디, 비번

			// 4. sql 쿼리구문 실행을 위한 Statement 객체 생성
			// sql의 ?는 1부터 순서대로 채워줍니다(setString(), setInt(), setDate(), setTimestamp() )
			pstmt = conn.prepareStatement(sql); // 실행시킬 sql 문
			
			pstmt.setString(1, id); // sql 실행문에서 첫번쨰 물음표에 들어간다
			pstmt.setString(2, pw);
			pstmt.setInt(3, age);
			pstmt.setString(4, email);

			// 5. sql 실행 - inset. update, delete는 executeUpdate() 로 실행
			
			int result = pstmt.executeUpdate(); // 적용된 로우행의 개수를 반환

			if (result == 1) {
				System.out.println("insert 성공");
			} else {
				System.out.println("insert 실패");

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			 try {

				 conn.close();
				 pstmt.close();
			} catch (Exception e2) {
		
			
			}
		}

	}
}
