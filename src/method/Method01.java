package method;

public class Method01 {
	public static void main(String[] args) { // 메인은 메서드

		// 메서드는 다른 메서드안에서 선언할 수 없음
		// type name(parameter)
		// 메인 밖에 클래스 안에 선언한다

		//함수의 호출
		calSum();
		int result = calSum();
		System.out.println("1~10까지의 합:" + result);
		
	}

	// 반환 유형 메서드이름
	static int calSum() {
		
		System.out.println("calsum 호출됨");
		
		// 1~10 합계
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += 1;
		}

		return sum;

	}
}
