package day08;

public class PenMain {

	public static void main(String[] args) {

		// 이제 객체를 만들어줘야 한다
		// 클래스명 변수병 = new 클래스명();
		Pen black = new Pen();
		black.ink = "검정색";
		black.price = 2000;
		black.company = "모나미";
		
		black.write();
		
		//빨간색 펜
		// new pen() 객체는 완전 다른 새로운 객체
		Pen red = new Pen();
		red.ink = "빨간색";
		red.price = 1000;
		red.company = "하이테크";
		
		red.write();
		
		black.info();
		red.info();
		
		//
		Variable v = new Variable();
		v.printNum(10);
	}
}
