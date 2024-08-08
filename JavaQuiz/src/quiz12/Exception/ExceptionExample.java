package quiz12.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("정수1");
				int a = scan.nextInt();
				System.out.println("정수2");
				int b = scan.nextInt();

				int result = divide(a, b);
				System.out.println("결과: " + result);

				break; // 정상적으로 나누기 완료 후 루프 종료

			} catch (InputMismatchException e) {
				System.out.println("정수를 입력해주세요.");
				scan.nextLine(); // 잘못된 입력 처리 후 입력 버퍼 비우기

			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
				scan.nextLine(); // 입력 버퍼 비우기
			}
		}
		System.out.println("종료");
		scan.close(); // Scanner 자원 해제
	}

	// 두 정수를 받아서 나누는 메서드
	public static int divide(int a, int b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException(); // 0으로 나눌 수 없음
		}
		return a / b;
	}
}
