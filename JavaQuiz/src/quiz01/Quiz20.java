package quiz01;

import java.util.Scanner;

public class Quiz20 {
	public static void main(String[] args) {

		/*
		 * 가로 세로 사작형
		 * 
		 * 윤곽만 출력하기
		 */
		Scanner scan = new Scanner(System.in);

		int a = 5;
		int b = 5;

		for (int i = 1; i <= b; i++) { //세로

			for (int j = 1; j <= a; j++) { //가로1

				if (j == 1 || j == a) { //첫, 마지막
					System.out.print("*");
				} else { //나머지 행
					if( j == 1 || j == b) {
						System.out.print("*"); //첫, 마지막
					}else {
						System.out.print(" ");
					}
				}
				
				
			}
			System.out.println(); // 줄바꿈
		}
		
		
		/*
		 * 
		 *     *
		 *    ***
		 *   *****
		 *  *******
		 * *********
		 * 
		 */
		
		
		
		
		
		
		
		

	}
}
