package quiz01;

import java.util.Scanner;

//문제 제출할때, import도 필요

public class Main { // 클래스명 반드시 Main

	// Lv.0 간단
	// Lv.1 배열
	// Lv.2 자료구조
	// Lv.3 부터 알고리즘 필요 - ex 경우의 수

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		int a1 = num1 % 10; // 2
		int a2 = num1 % 100 - a1; // 70
		int a3 = num1 % 1000 - a1 - a2; // 400

		int b1 = num2 % 10; // 5
		int b2 = num2 % 100 - b1; // 80
		int b3 = num2 % 1000 - b1 - b2; // 300

		int c1 = (a1 * b1) + (a2 * b1) + (a3 * b1);
		int c2 = (a1 * b2) + (a2 * b2) + (a3 * b2);
		int c3 = (a1 * b3) + (a2 * b3) + (a3 * b3);

		System.out.println(c1); 
		System.out.println(c2 /10);
		System.out.println(c3 / 100);
		
		System.out.println(c1+ c2+ c3);

	}
}
