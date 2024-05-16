package method;

import java.util.Scanner;

public class MethodEx {
	public static void main(String[] args) {

		System.out.println(calSum(1, 2, 3.5));

		System.out.println(strA(2));

		strB("abc", 3);

		System.out.println(big(2, 5));

		abs(-5);
	}

	static double calSum(int a, int b, double c) {

		return a + b + c;

	}

	static String strA(int a) {

//		String str = "";

		if (a % 2 == 0) {
//			str = 
			return "짝수";
		} else {
//			str = 
			return "홀수";
		}

	}

	static void strB(String str, int a) {
		for (int i = 0; i < a; i++) {
			System.out.println(str);
		}

	}

	static int big(int a, int b) {
		if (a < b) {
			return b;
		} else {
			return a;
		}

//		return a > b ? a : b; 삼항연산자 쓸 수 있음
	}

	static int abs(int a) {
		if (a < 0) {
			return a * -1;
		} else {
			return a;
		}

//		return a < 0 ? -a : a;
	}

}
