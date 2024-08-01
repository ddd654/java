package day12.exception.tryCatch;

public class Trycatch02 {
	public static void main(String[] args) {

		String[] arr = { "사과", "키위", "복숭아" };

		int i = 0;

		while (i < 4) {

			try {
				System.out.println(arr[i]);

			} catch (Exception e) {
				System.out.println("배열 참조 벗어남");
			} finally	{
				System.out.println("예외 상관없이 실행");
			}

			i++;
		}
		System.out.println("프로그램 종료");

	}
}
