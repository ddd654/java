package day03;

import java.util.Scanner;

public class Switch02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수입력");
		int point = scan.nextInt();
		
		
		switch (point / 10) {// switch 에 연산식을 넣기
		case 10:
		case 9:
			if(point >= 95) {
				System.out.println("A+학점");
			} else {
				System.out.println("A학점");
			}
			
			break;
		case 8:
			break;
		case 7:
			break;

		default:
			break;
		}
		
	}
}
