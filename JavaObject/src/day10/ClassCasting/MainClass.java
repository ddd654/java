package day10.ClassCasting;

public class MainClass {
	public static void main(String[] args) {

		// 배열의 다형성 - 타입을 통일할 수 있음
//		Student s1 = new Student("사과", 12, "123");
//		Student s2 = new Student("바나나", 22, "321");
//		Student s3 = new Student("키위", 33, "213");
//		
//		Teacher t1 = new Teacher("역사선생님", 30, "역사");
//		Teacher t2 = new Teacher("과학선생님", 44, "과학");
//		
//		Employee e1 = new Employee("달리기", 55, "현장");

//		Student[] students = { s1, s2, s3 };
//		Teacher[] teachers = { t1, t2 };
//		Employee[] em = { e1 };

		// 배열의 다형성 - 타입을 통일할 수 있음
		Person_this s1 = new Student("사과", 12, "123");
		Person_this s2 = new Student("바나나", 22, "321");
		Person_this s3 = new Student("키위", 33, "213");

		Person_this t1 = new Teacher("역사선생님", 30, "역사");
		Person_this t2 = new Teacher("과학선생님", 44, "과학");

		Person_this e1 = new Employee("달리기", 55, "현장");

		Person_this[] persons = { s1, s2, s3, t1, t2, e1 };

		for (Person_this p : persons) {
			System.out.println(p.info());

		}

		// ----------------

		// 매개변수에서 다형성 적용
		System.out.println("---------");
		House h = new House();
		
		h.checkIn(s1);
		h.checkIn(s2);
		h.checkIn(s3);
		h.checkIn(t1);
		h.checkIn(t2);
		h.checkIn(e1);
		
		//메서드 호출
		h.confirm();
		
		
		
	}
}
