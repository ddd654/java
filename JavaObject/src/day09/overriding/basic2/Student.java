package day09.overriding.basic2;


// 상속받고 싶은 클래스 에 extends 붙여서
public class Student extends Person{

	String studentId;

	String info() {
		return "이름:"+name+", 나이" + age+ ", 학생"+ studentId;
		
	}
}
