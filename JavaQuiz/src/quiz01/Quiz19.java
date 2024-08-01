package quiz01;

import java.util.Scanner;

public class Quiz19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		int sum = 0;
		int big = 0;
		int sma = 0;

		if (num1 < num2) {
			big = num2;
			sma = num1;
		} else  {
			big = num1;
			sma = num2;
		} 

		for (int i = sma; i <= big; i++) {
			sum += i; 
		}

		System.out.println(big == sma ? 0 : sum);

//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//
//		int max = 0;
//		int min = 0;
//		int sum = 0;
//
//		if (num1 < num2) {
//			max = num1;
//			min = num2;
//		} else {
//			max = num2;
//			min = num1;
//		}
//
//		for (int i = min; i <= max; i++) {
//			sum += i;
//		}
//
//		System.out.println(max == min ? 0 : sum);

	}
}
