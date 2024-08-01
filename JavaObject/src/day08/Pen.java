package day08;

//설계도 클래스는 메인 메서드가 없다

public class Pen {

	//클래스 속성을 나타내는 멤버변수 - 필드
	String ink;
	int price;
	String company;
	
	//클래스 기능을 표현하는 메서드
	void write() {
		System.out.println(ink + " 색상 글씨를 씁니다");
	}
	
	void info() {
		System.out.println("---펜의 정보---");
		System.out.println("색상:" + ink);
		System.out.println("가격:"+ price);
		System.out.println("회사:" + company);
		
	}
}
