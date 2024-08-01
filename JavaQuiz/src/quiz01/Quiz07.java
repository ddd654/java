package quiz01;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1);
		} else if(num2 > num1) {
			System.out.println(num2);
		} else {
			System.out.println(0);
		}
		
		scan.close();
		
	}
}
