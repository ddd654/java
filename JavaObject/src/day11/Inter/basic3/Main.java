package day11.Inter.basic3;

public class Main {
	public static void main(String[] args) {

		// 구현체에 따라 다른 클래스 호출
		// Print p = new Lg();

		Print p = new Samsung();

//		Samsung print = new Samsung(); // 이렇게 쓰면 다이랙트 호출
		p.print("Hello");
		p.colorPrint("good", "man");
		p.copy(5);
		
		
	}
}
