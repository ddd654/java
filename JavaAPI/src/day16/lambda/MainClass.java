package day16.lambda;

public class MainClass {
	public static void main(String[] args) {

		Person p = new Person();

//		p.greeting(new Say01){
//
//			@Override
//			public void talking() {
//				// TODO Auto-generated method stub
//				System.out.println("가나다");
//			}
//			
//		};

		// 위와 같음
		// (매개변수자리) -> { 실행문}
		p.greeting(() -> {
			System.out.println("위와 같은 표현");
		});

//
//		p.greeting(new Say02() {
//
//			@Override
//			public String talking(String word) {
//				return word + " 하시오";
//			}
//		});

		p.greeting((String word) -> {
			return word + "hello";
		});

		// 매개변수의 타입은 생략 가능
		p.greeting((word) -> {
			return word + "bye";

		});

		// 매개변후가 1개일때 () 생략가능
		// 1줄이면 {} 생략가능
		// 연결구문으로 생략가능
//		p.greeting(word -> return word + "123");
		p.greeting(word -> word + "123");

		// 람다식으로 호출하기
		// int의 개수만큼 word 문자열 합 구하고 반환
		p.calculationg((i, word) -> {

			String result = "";
			for (int j = 0; j < i; j++) {
				result += word;
			}

			return result;
		});

		//
		p.calculationg((i, word) -> {
			String sum = "";
			for (int k = 1; k <= i; k++) {
				sum += word;
			}

			return sum;

		});

	}
}
