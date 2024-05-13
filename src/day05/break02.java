package day05;

import java.util.Scanner;

public class break02 {
	public static void main(String[] args) {
		
		//특정조건까지 무한입력
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("5 X 3 =");
			System.out.println(">");
			int num = scan.nextInt();
			
			//입력받은 값이 조건에 만족하면 탈출
			if(num == 5 * 3) {
				System.out.println("정답입니다!");
				break;
			} else {
				System.out.println("틀렸는데요?");
			}
			
		}
		
		
		
		
		
		
	}
}
