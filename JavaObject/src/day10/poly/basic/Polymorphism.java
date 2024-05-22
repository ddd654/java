package day10.poly.basic;

//하나의 클래스 파일에는 여러 클래스 선언이 가능
//파일명과 동일한 클래스여야 하고, public이여야함
class A {
}

class B extends A {
}

class C extends A {
}

class D extends B {
}

class E extends C {
}

public class Polymorphism {

	int x = 1;
	double y = x; // int >> double로 형변환

	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();

	A a1 = b;// 다형성, B >>> A클래스로 형변환됨
	A a2 = new B();
	A a3 = new C();
	A a4 = new D();
	A a5 = new E();
	
	//상속 관계가 있어야함
	B b2 = new E(); <<

	// Object 에는 모든 클래스가 저장된다
	Object o1 = a;
	Object o2 = 3.14;
	Object o3 = "코코";
	Object o4 = new B();
	
	
	
	
}

public class Polymorphism {
	// 객체가 여러 형태를 가진다는 뜻
	// 부모클래스 변수 = new 자식클래스()
	//

	public static void main(String[] args) {

	}

}
