package day10.instanceOf;

public class MainClass {
	public static void main(String[] args) {

		// 배열의 다형성 - 타입을 통일할 수 있음
		Person_this s1 = new Student("사과", 12, "123");

		Person_this t1 = new Teacher("역사선생님", 30, "역사");

		Person_this e1 = new Employee("달리기", 55, "현장");

		personInfo(s1); // static으로 호출
		personInfo(t1);
		personInfo(e1);

	}

	// 메서드 - 매개변수로 Person타입을 받는
	public static void personInfo(Person_this p) {

		// 캐스팅
		if (p instanceof Employee) { // p 가 Employee 타입이면 true
			Employee e = (Employee) p;
			System.out.println("emp캐스팅 완료");
			System.out.println(e.info());
			
		} else if (p instanceof Student) {
			
			Student s = (Student) p;
			System.out.println(s.info());

		} else if (p instanceof Teacher) {
			
			Teacher t = (Teacher)p;
			System.out.println(t.info());
		}
		
	}
}
