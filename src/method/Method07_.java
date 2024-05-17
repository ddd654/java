package method;

public class Method07_ {
	public static void main(String[] args) {

		method01();

		// 재귀적인 호출 - 다시 돌아오는 호출, 메서드 안에서 자신을 호출시킴
		recursive(5);
		
		System.out.println(factorial(4));
	}

	static void method01() {
		System.out.println("method01 start ");

		method02();

		System.out.println("method01 end");

	}

	static void method02() {
		System.out.println("method02 start");

		System.out.println("method02 end");
	}

	static void recursive(int a) {

		if (a == 10) {
			return; // 함수종료
		}

		System.out.println(a + "호출");
		a++;

		recursive(a);
	}

	static int factorial(int a) {

		if (a == 1) {
			return 1;
		}

		return a * factorial(a - 1);
	}

}
