package day05;

import java.util.Scanner;

public class ForEx02 {
	public static void main(String[] args) {

		/*
		 * 소수판별하기 소수 - 약수가 1과 자가자긴인 수 2, 3, 5, 7...
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("입력 > ");

		int num = scan.nextInt();
		int cnt = 0; //카운트 변수
		
		for (int i = 1; i <= num; i++) {
			if(num % i == 0) {
				cnt++;
				
			}
			
		}
		
		if(cnt == 2) {
			System.out.println(num + "는 소수 입니다.");
			
		} else {
			System.out.println(num + "는 소수가 아닙니다.");
		}

	}
}
