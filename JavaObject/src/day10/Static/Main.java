package day10.Static;

public class Main {
	public static void main(String[] args) {
		
		Static c = new Static();

		c.a++;
		c.b++;
		
		System.out.println(c.a);
		System.out.println(c.b);
		
		Static c2 = new Static();

		c2.a++;
		c2.b++;
		
		System.out.println(c2.a);
		System.out.println(c2.b);
		
		Static c3 = new Static();

		c3.a++;
		c3.b++;
		
		System.out.println(c3.a);
		System.out.println(c3.b);
		
		//
		System.out.println("-----------------");
		c3.b = 100;
		c2.b++;
		System.out.println(c.b);
		System.out.println(c2.b);
		System.out.println(c3.b);
		
		//static 멤버는 클래스 밖에서 생성
		// (클래스명.변수명)으로 접근
		
		Static.b = 122;
		System.out.println(Static.b);
		
		
	}
}
