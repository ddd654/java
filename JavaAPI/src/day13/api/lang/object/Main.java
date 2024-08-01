package day13.api.lang.object;


public class Main {
	public static void main(String[] args) {
		// 1. equls() 메서드 - 동일객체인지 확인하기

		Person a = new Person("사과");
		Person b = new Person("바나나");

		// 오버라이딩 하기
		boolean result = a.equals(b);
		System.out.println("객체?" + result);

		// 2. toString() 메서드 - 객체주소를 문자열로 반환하기

		System.out.println(b.toString());

		// 3. hashCode() - 고유한 숫자값 반환
		System.out.println("중복없는 고유 숫자값" + a.hashCode());
		System.out.println("객체마다 중복없는 고유 숫자값" + b.hashCode());

		// 4. clone() - 같은 패키지에서만 사용되는 protected

		try {
			Object clone = a.clone();
			System.out.println("복제" + clone.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 5. finallize() - 객체가 소멸되기전에 실행, deprecated된다
		// 사용을 자제해달라는 뜻

		a = null;
		b = null;
		System.gc(); // garbege collector
	}
}
