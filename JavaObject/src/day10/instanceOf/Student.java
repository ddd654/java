package day10.instanceOf;

// 상속받고 싶은 클래스 에 extends 붙여서
public class Student extends Person_this {

	String studentId;

	Student(String name, int age, String studentId) {
		super(name);
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}

	String info() {
		return "이름:" + name + ", 나이:" + age + ", 학생:" + studentId;

	}
}
