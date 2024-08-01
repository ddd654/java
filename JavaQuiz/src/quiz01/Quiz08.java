package quiz01;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
//		int a = scan.nextInt();
//		System.out.println(a);
//		
//		if(a == 5) {
//			System.out.println("홀수");
//		} else if (a == 6) {
//			System.out.println("짝수");
//		} else if (a < 0) {
//			System.out.println("음수"); 
//		} else {
//			System.out.println("제로"); 
//		}

		
		int b = scan.nextInt();
		
		if(b % 2 == 1) {
			System.out.println("홀수");
		} else if (b == 0) {
			System.out.println("제로");
		} else if (b %2 == 0 & b < 0) {
			System.out.println("음수");
		} else {
			System.out.println("제로");
		} 
		
		
		
		
	}
}
