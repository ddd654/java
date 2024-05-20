package quiz01;

import java.util.Scanner; //문제 제출할때, import도 필요

public class Main { // 클래스명 반드시 Main

	// Lv.0 간단
	// Lv.1 배열
	// Lv.2 자료구조
	// Lv.3 부터 알고리즘 필요 - ex 경우의 수

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String a = scan.next();
		int b = scan.nextInt();
		
		String arr = a;
		

		for (int i = 1; i < arr.length(); i++) {
			String c = a.charAt(b - 1);

			System.out.println(c);

		}

		System.out.println(111 * 222);
		


	}
}
