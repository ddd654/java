package day09.overriding.basic2;

public class Mainclass {
	public static void main(String[] args) {
		// 부모
		Person p = new Person();
		p.age = 20;
		p.name = "사과";

		System.out.println(p.info());

		Student s = new Student();
		s.age = 12;
		s.name = "바나나";
		s.studentId = "학생아이디";

		System.out.println(s.info());
		

		Employee e = new Employee();
		e.age = 39;
		e.name = "코코";
		e.department = "미술부";

		System.out.println(e.info());

		Teacher t = new Teacher();
		t.age = 33;
		t.name = "키위";
		t.subject = "미술";

		System.out.println(t.info());

	}
}
