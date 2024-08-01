package day15.Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStram01 {
	public static void main(String[] args) {

		// Output이 붙은 클래스는 1바이트 기반 출력 스트림이다
		// 1. 파일을 쓸 때 사용하는 클래스는 FileOutputStream
		// 2. io 패키지에 모든 클래스는 throws가 있어서, try-catch와 함께 사용한다

		// try catch 필요

		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\Hello.txt"; // 파일명을 포함

		OutputStream a = null;
		
		try {
			a = new FileOutputStream(path); //파일 경로

			//출력할 문자
			String str = "안녕하세요 \n 즐거운 화요일이에요";

			a.write(str.getBytes());
			
//			a.close(); // 스트림 자원 해제
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				a.close(); //a 변수를 밖에서 선언
			} catch (IOException e2) {
				
			} 
		}

	}
}
