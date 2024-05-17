package quiz01;

public class Quiz30_method {
	public static void main(String[] args) {

		System.out.println(java(3));

		System.out.println(sum(4));

		System.out.println(primeNum(1, 5));

	}
	// 1.java()

//	 매개변수 1 로 "자"를 return 
//	 매개변수 2 로 "자바"를 return 
//	 매개변수 3 로 "자바자"를 return 
//	 매개변수 4 로 "자바자바"를 return

	static String java(int a) {
		String str = "";

		for (int i = 1; i <= a; i++) {
			if (i % 2 == 0) {
				str += "바";
			} else {
				str += "자";
			}
		}
		return str;

	}

	// 2.sum()

	// 매개변수로 정수를 1개 밥습니다.
	// 매개변수 약수의 합계 리턴
	// 5 >> return 1 + 5
	// 6 >> return 1 + 2 + 3+ 6

	static int sum(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

	// primeNum() 매개변수 두개 받아서,
	// 순서 상관없이
	// 두 수 사이의 합계 리턴
	// 1, 2 >> return 1+2;
	// 2, 1 >> return 1+2;
	// 1>> 0

//	static int primeNum(int num1, int num2) {
//		int sum = 0;
//
//		if (num1 < num2) {
//			for (int i = num1; i <= num2; i++) {
//				sum += i;
//			}
//		} else {
//			for (int i = num2; i <= num1; i++) {
//				sum += i;
//			}
//		}
//
//		return sum;
//	}

	static int primeNum(int a, int b) {
		
		if( a== b) return 0;

		int max = a > b ? a : b;
		int min = a < b ? b : a;
		int sum = 0;

		for(int i = min; i <= max; i++) {
			sum += i;
		}
		
		return sum;
	}

}
