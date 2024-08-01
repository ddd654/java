package day15.write_read;

import java.io.File;
import java.util.Scanner;

public class CreateDirectory {
	public static void main(String[] args) {

		// 외부용도로 폴더를 만들때 File클래스를 사용

		Scanner sc = new Scanner(System.in);

		System.err.println("만들 폴더 이름");
		String a = sc.next();

		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\" + a;

		try {
			File file123 = new File(/* 경로 */path);

			// 폴더가 있는지 확인
			if (file123.exists()) {
				file123.mkdir();  // 폴더가 없으면 생성
			} else {
				System.out.println("폴더 있음");
			}
			
			//
			if(file123.exists()) {
				file123.delete(); //빈폴더일때만 삭제
				
				System.out.println("삭제됨");
			} else {
				System.out.println("폴더 삭제 안됨");
			}
			

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
