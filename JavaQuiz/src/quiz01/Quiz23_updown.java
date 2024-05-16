package quiz01;

import java.util.Scanner;

public class Quiz23_updown {
	public static void main(String[] args) {

		/*
		 * 1 ~ 100까지 임의의 숫자를 하나 생성합니다.
		 * 
		 * 스캐너를 통해서 값을 입력받고, 랜덤수가 입력받은 값보다 작으면 " 더 작은수를 입력하세요" 크면 " 더 큰수를 입력하세요"
		 * 
		 * 정답을 맞추면 시도 횟수를 출력하고, 종료
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		int ran = (int) (Math.random() * 100) + 1; // 0 ~ 99 +1
		System.out.println(ran);
		int cnt = 0;

		while (true) {

			System.out.print("정답입력>");
			int a = scan.nextInt();
			cnt++; // 시도횟수 증가

			if (a < ran) {
				System.out.println("더 큰수를 입력하세요");

			} else if (a > ran) {
				System.out.println("더 작은수를 입력하세요");

			} else {
				System.out.println("정답");
				break;
			}

		}

		System.out.println("정답횟수:" + cnt);

	}
}
