package day12.exception.tryCatch;

public class Trycatch {
	public static void main(String[] args) {

		//예외처리하기 
		try {
			String[] arr = { "사과", "바나나" };
			int x = 1;
			int y = 0;

			System.out.println(x + y);
			System.out.println(x - y);
			System.out.println(x / y);
			System.out.println(x % y);
		} catch (/* 예외의 종류 */ ArithmeticException e) {
			System.out.println("0으로 나누지 마세요");

		}
		
		System.out.println("종료");

	}
}
