package quiz11;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		// 1. 스캐너를 통해서 정수 2개를 입력받습니다.
		// 2. 입력받은 값이 정수라면 ,
		// 단순히 정수의 합을 출력하고 반복문을 종료하세요
		// 3. 입력받은 값이 에러를 발생시키는 값이라면
		// "정수로만 입력하세요" 를 출력한 후에 다시 입력받습니다.
		// 4. 반복문을 탈출하면 프로그램 정상 종료 문장을 띄워주세요.

		Scanner scan = new Scanner(System.in);

//		while (true) {

//			System.out.println("정수1");
//			int q = scan.nextInt();
//			System.out.println("정수2");
//			int w = scan.nextInt();

//			try {
//				System.out.println("정수1");
//				int a = scan.nextInt();
//				System.out.println("정수2");
//				int b = scan.nextInt();
//
//				System.out.println(a + b);
//				break;
//			} catch (Exception e) {
//				System.out.println("정수로 입력하세요");
//			}
//
//			System.out.println("종료");
//		}
		
		
		System.out.println("1 ~ 100 값을 입력하세요");
		int b = (int) (Math.random() * 100) + 1;
		int count = 0;

		while (true) {
			int a = scan.nextInt();

			try {
				if (a < b) {
					System.out.println("더 큰수를 입력해주세요");
					count++;
				} else if (a > b) {
					System.out.println("더 작은수를 입력해주세요");
					count++;
				} else {
					System.out.println("정답");
					System.out.println(count);

					break;
				}

			} catch (Exception e) {
				System.out.println("예외");
				scan.nextLine();
				count++;
			}
			//검색할것
		}

	}

}
