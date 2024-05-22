package day10.poly.basic;

public class Main {
	public static void main(String[] args) {

		Child c = new Child();
		Parent p = c; // Parent 타입

		// 다형성이 적용되면
		// 부모님의 메서드만 사용할 수 있고,
		// 오버라이딩된 메서드가 먼저 실행됨

		p.method01(); // 상속받은 메서드
		p.method02(); // 오버라이딩 메서드
//		p.method03(); // 다형성이 적용되면, 자식이 가진 원래 메서즈에 접근x

		System.out.println(c);
		System.out.println(p);
		System.out.println(c == p);
		//자식이 일시적으로 부모로 형변환된것
	
		//--------------
		
		//클래스 캐스팅
		//다형성이 적용된 객체는 다시 클래스 캐스팅을 통해서 자신으로 되돌아올 수 있음
		//다형성이 적용되야 함, 안되면 오류
		
		Parent pp = new Child();
		
		Child cc = (Child)pp; //다시 되돌아가기
		cc.method03();
		
		Parent ppp = new Parent(); // ClassCast 오류
		Child ccc = (Child)ppp;
		
		
		
		
		
	}
}
