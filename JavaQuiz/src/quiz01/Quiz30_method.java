package quiz01;

public class Quiz30_method {
	public static void main(String[] args) {

		System.out.println(java(1));

		sum(1);

	}
	// 1.java()

//	 매개변수 1 로 "자"를 return 
//	 매개변수 2 로 "자바"를 return 
//	 매개변수 3 로 "자바자"를 return 
//	 매개변수 4 로 "자바자바"를 return

	static String java(int a) {
		for (int i = 1; i <= a; i++) {
			String str = "";
			if (i % 2 == 0) {
				str = "바";
			} else {
				str = "자";
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

	}

	// primeNum() 매개변수 두개 받아서,
	// 순서 상관없이
	// 두 수 사이의 합계 리턴
	// 1, 2 >> return 1+2;
	// 2, 1 >> return 1+2;
	// 1>> 0

}
