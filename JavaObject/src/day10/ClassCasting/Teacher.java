package day10.ClassCasting;

public class Teacher extends Person_this {
	String subject;

	Teacher(String name, int age, String subject) {
		super(name);
//		this.name = name;
		this.age = age;
		this.subject = subject;
	}

	String info() {
		return "이름:" + name + ", 나이" + age + ", 과목" + subject;

	}
}
