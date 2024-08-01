package day09.modi.member.pac1;

public class A {

	public int var1;
	int var2;
	private int var3;

	public void method01() {
	}

	void method02() {
	}

	private void method03() {
	}

	// 생성자

	public A() {
		var1 = 1;
		var2 = 2;
		var3 = 3;
		method01();
		method02();
		method03();
		
		// 접근 가능
	}

	
	//단, 패키지가 다르더라도, super 키워드를 통해 접근 가능
	protected int var;

	// 생성자
	protected A(int i) {

	}

	// 메소드
	protected void method() {

	}

}
