package day05;

import java.util.Scanner;

import day01.SystemOut;

public class MultiFor02 {
	public static void main(String[] args) {
		
		/*
		 * 사각형
		 */
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(); //가로
		int b = scan.nextInt(); //세로
		
		for(int i = 1; i <=b; i++) {//행
			for(int j = i; j <=b; j++) {//가로
				
				System.out.print("*");
				
			}
			System.out.println(); //줄바꿈
		}
		
		
		
	}
}
