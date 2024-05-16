package quiz01;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		String math = scan.next();
		int num2 = scan.nextInt();

		switch (math) {
		case "+":
			System.out.println(num1 + num2);
			break;
		case "-":
			System.out.println(num1 - num2);
			break;

		default:
			System.out.println("잘못입력");

			break;
		}
		
	}
}
