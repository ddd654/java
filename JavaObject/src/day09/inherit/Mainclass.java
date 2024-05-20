package day09.inherit;

public class Mainclass {
	public static void main(String[] args) {
		
		Person p = new Person(); //부모
		p.age = 20;
		p.name = "사과";
		
		System.out.println(p.info());
		
		Student s = new Student();
		s.age = 12;
		s.name = "바나나";
		s.studentId = "학생아이디";
		
		System.out.println(s.info());;
		
		
		Employee e = new Employee();
		e.age = 39;
		e.name = "코코";
		e.department = "미술부";
		
		System.out.println(e.info());
		
	}
}
