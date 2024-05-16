package method;

public class Method02 {
	public static void main(String[] args) {

		// 매개변수 - Parameter
		// 1. 매개변수는 메서드 호출시 전달하는 매개체
		// 2. 매개변수가 없으면 () 빈칸으로, 여러개있으면 콤마로 잇는다

		calSum(10);// 메서드에 전달할 값을 넣기
		int result = calSum(10);
		System.out.println("1~10까지의 합:" + result);
		System.out.println("1~100까지의 합:" + calSum(100));

		System.out.println("결과:" + calSum2(1, 3, "k"));

	}

	// 여러개의 매개변수로 받아서, 매개변수 까지의 합계

	static int calSum(int end) {

		int sum = 0;
		for (int i = 0; i <= end; i++) {
			sum += i;
		}

		return 0;
	}

	static String calSum2(int a, int b, String c) {

		String str = "";

		for (int i = a; i <= b; i++) {
			str += c;

		}
		return str;
	}

}
