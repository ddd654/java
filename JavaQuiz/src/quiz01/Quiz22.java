package quiz01;

import java.util.Scanner;

public class Quiz22 {
	public static void main(String[] args) {

		// 랜덤한 덧셈문제를 출력해줍니다.
		// 범위는 1 ~ 100
		// 사용자가 답란을 입력할 때마다, 정답 또는 오답 카운트 증가

//		Scanner scan = new Scanner(System.in);
//		int sum1 = 0;
//		int sum2 = 0;
//
//		while (true) {
//
//			int a = (int) (Math.random() * 100);
//			int b = (int) (Math.random() * 100);
//
//			System.out.println(a + " + " + b + " = " + "?");
//			System.out.print("[문제를 그만 푸시려면, 0을 입력하세요.]");
//			System.out.println(">");
//
//			int num = scan.nextInt();
//			
//			// 입력받은 값이 조건에 만족하면 탈출
//			int cnt = 0;
//
//			if (num == a + b) {
//				System.out.println("정답입니다!");
//				sum1 += 1;
//			} else if (num == 0){
//				System.out.println("프로그램 종료");
//				break;
//			} else {
//				System.out.println("틀렸는데요?");
//				sum2 += 1;
//			}
//		}
//
//		System.out.println("정답:	" + sum1);
//		System.out.println("오답:	" + sum2);

		Scanner scan = new Scanner(System.in);

		int goodcnt = 0;
		int badcnt = 0;

		while (true) {

			int a = (int) (Math.random() * 100) + 1;
			int b = (int) (Math.random() * 100) + 1;

			// 랜덤한 문제 생성
			System.out.println("------------");
			System.out.println(a + " + " + b + " = ?");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요");
			System.out.println(">");

			// 입력
			int answer = scan.nextInt();

			if(answer ==0) {
				System.out.println("프로그램 종료");
				break; 
			}
			// 비교
			if (a + b == answer) { // 정답인 경우
				goodcnt++;
				System.out.println("정답입니다");
			} else {
				badcnt++;
				System.out.println("틀렸습니다");
			}

		}

		System.out.println("정답: " + goodcnt);
		System.out.println("정답: " + badcnt);
		

	}
}
