package quiz12.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception {
	public static void main(String[] args) {

		// main에서 scanner호 2개의 정수 받음
		// divide를 입력받는 메서드에 전달

		// divide 메서드는 a/b에서 b가 0인 경우 예외를 강제 생성하고 종료

		// main에서 입력받을 떄, 문자이면 예외처리 후 다시 입력받기

		Scanner scan = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("정수1");
				int a = scan.nextInt();
				System.out.println("정수2");
				int b = scan.nextInt();

				int result = divide(a, b);

				break;

			} catch (InputMismatchException e) {
				System.out.println("다시 입력해주세요");
				scan.nextLine();

			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없음");
				scan.nextLine();

			}

		}
		System.out.println("종료");
	}

//	public static void divide(int a, int b) throws Exception {
//
//		if (a / b == 0) {
//			throw new Exception();
//		}
//
//	}
	
	
	public static int divide(int a, int b) throws ArithmeticException {

		if (b == 0) {
			throw new ArithmeticException();
		}

		return a / b;

	}

	public static int divide(int a, int b) throws InputMismatchException {

		if (a / b == 0) {
			throw new InputMismatchException();
		}
		return a / b;

	}

}
