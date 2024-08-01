package day11.Abstract.good;

public class Main {
	public static void main(String[] args) {

		// 추상 클래스는 s객체 생성이 안됨
		// Store s = new Store();
		
		
		
//		SeoulStore s = new SeoulStore();
		
		// 자식으로 생성 후 부모에 저장하는 객체 추상화
		Store s = new BusanStore(); //다형성

		s.apple();
		s.melon();
		s.orange();

		// 상속된거 쓰기
		s.mango();

		//getter 쓰기
		String name = s.getName();
		System.out.println(name);
	}
}
