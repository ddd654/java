package day09.modi.construct.pac1;

public class A {
	
	A a = new A(1); //public으로 접근 가능
	A a2 = new A(true); //default 접근 가능
	A a3 = new A("흥"); //private 접근 가능
	
	public A(int a) {}
	A(boolean a){}
	private A(String a){}
	
}
