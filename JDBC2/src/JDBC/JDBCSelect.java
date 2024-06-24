package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCSelect {
	public static void main(String[] args) {

		
		// 나이가 10 이상인 데이터 조회

		// 1. sql 접속 정보를 선언
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "HR"; // 계정명
		String upw = "HR"; // 비번

		Scanner scan = new Scanner(System.in);

		System.out.println("조회할나이");
		int age = scan.nextInt();

		String sql = "SELECT * FROM MEMBER WHERE AGE >= ?";

		Connection conn =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select는 결과를 조회해서 처리할 resultset객체가 필요

		try {

			Class.forName("oracle.jdbc.OracleDriver");
			
			
			conn = DriverManager.getConnection(url, uid, upw); // conn 객체

			pstmt = conn.prepareStatement(sql); // pstmt 객체, 실행시킬 sql문
			pstmt.setInt(1, age);

			rs = pstmt.executeQuery(); // select는 executeQuery() 문으로 실행함

			// rs에 저장된 데이터를 1행씩 처리하는 구문

			while (rs.next()) {// 다음행이 있는지 확인해서, 다음이 있으면 전진 true 반환
				// 1행에 대한 프로그램 처리
				// getString(). getInt(), getDate(), getTimestamp() 등을 이용해서
				// 데이터를 읽어들임

				//
				String id = rs.getString("id"); // 읽을 컬럼 명칭
				int ages = rs.getInt("age");
				String pw = rs.getString("fw");
				String email = rs.getString("email"); //읽을 컬럼명이 적힌다
				
				System.out.println(id);
				System.out.println(pw);
				System.out.println(ages);
				System.out.println(email);
				System.out.println("--------");

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
