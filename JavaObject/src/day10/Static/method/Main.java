package day10.Static.method;

public class Main {
	public static void main(String[] args) {
		
		StaticMethod c = new StaticMethod();

		c.method01();
		c.method02();
		
		//클래스명.메서드명() << static 메서드 사용하기
		StaticMethod.method02();
		
		//비밀
		Math.random(); //<< static임
		
		
		
		
		
		Main m = new Main();
		m.test(); // <<
		
	}
	
	public void test() {
		//static 이 안붙어도 Main을 객체로 만들면 사용가능
		//
	}
}
