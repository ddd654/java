package quiz01;

import java.util.Scanner; //문제 제출할때, import도 필요

public class Main { // 클래스명 반드시 Main

	// Lv.0 간단
	// Lv.1 배열
	// Lv.2 자료구조
	// Lv.3 부터 알고리즘 - ex 경우의 수

//	public static void main(String[] args) {
//
//		Scanner scan = new Scanner(System.in);
//
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int c = scan.nextInt();
//
//		System.out.println((a + b) % c);
//
//	}

	// 문자열을 다루는 다양한 방법

	public static void main2(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 문자열.메서드명() 류

		"1123".compareTo(null);

		String str = "안녕~";

		// 문자열에서 인덱스번호인거 가져오기
		char c = str.charAt(0);
		System.out.println("0번째 인덱스:" + c);
		System.out.println("마지막번째:" + c);

		// 문자열 길이
		str.length();
		System.out.println(str.length());

		// 문자 찾기 - 문자의 위치 알려줌
		System.out.println("녕 위치 찾기" + str.indexOf("녕"));

		// 없는 문자면 -1반환
		System.out.println(str.indexOf("오"));

		// 문자 변경하기 - 대상문자, 변경할 문자
		String str1 = str.replace("안녕", "hello");
		System.out.println(str1);
		
		//원본 문자열의 공백이 사라진다
		String str2 = "사과 먹고 싶다~";
		str2 = str2.replace(" ", "");
		
		
		
	}

}
