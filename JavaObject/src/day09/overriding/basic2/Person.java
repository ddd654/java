package day09.overriding.basic2;

public class Person {
	
	//부모 클래스 
	//정보 기능
	String name;
	int age;

	String info() {
		return "이름:" + name + ", 나이:" + age;

	}
}
