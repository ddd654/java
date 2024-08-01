package quiz13.String;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz01_string {
	public static void main(String[] args) {

		// 1. 스캐너로 공백 + id 입력
		// 2. 공백이 제거된 아이디가 5글자 미만이면, 다시 입력 받기
		// 3. 아이디는 소문자

		// 5글자 이상이면 "아이디가 등록되었습니다" 출력 후 종료

		Scanner scan = new Scanner(System.in);

		while (true) {
			String str = scan.nextLine();
			String id = str.replace(" ", "").toLowerCase();
			
//			id = id.replace(" ", "");
//			id = id.toLowerCase();
			
			if (id.length() < 5) {
				System.out.println("5글자 미만");
				
			} else {
				System.out.println(id.toLowerCase());

				System.out.println("아이디가 등록되었습니다");
				break;
			}
			
		}

//		String str = scan.next();
//		System.out.println(Arrays.toString(id));


	}
}
