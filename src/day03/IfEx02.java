package day03;

import java.util.Scanner;

import day01.SystemOut;

public class IfEx02 {
	public static void main(String[] args) {
		//점수를 입력받아서 점수에 따른 학점 부여
		
		Scanner scan = new Scanner(System.in);
		int point = scan.nextInt();
		
		if(point >= 90) {
			System.out.println("A학점");
			if(point >= 95) {
				System.out.println("A+학점");
			} else {
				System.out.println("A학점");
			}
			
			
		} else if(point >= 80) {
			System.out.println("B학점");
		} else if(point >= 70) {
			System.out.println("C학점");
		} else {
			System.out.println("재수강");
		}
		
		
	}
}
