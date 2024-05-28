package day10.Static.method;

public class StaticMethod {
	// static_method

	public int a;
	public static int b;

	// 일반 메서드에서는 일반변수, 정적변수 모두 사용가능
	public int method01() {
		a = 10;
		b++;
		return b;
	}

	// 정적메서드 - static 멤버만 사용가능
	public static int method02() {
		
		//객체생성에서는 접근할 수 있음
		StaticMethod c= new StaticMethod();
		c.a = 123;
		
		int a = 10; //static method02에서 접근 불가
		b++; //static 붙은 변수에만 접근
		return b;
	}
}
