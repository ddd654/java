package quiz02;

public class Quiz01_object {

	public static void main(String[] args) {
		
		Person p1 = new Person("사과", 20, 100);
		p1.info();
		
		
		//기본 생성자
		Person p2 = new Person();
		p2.name = "키위";
		p2.age = 12;
		p2.tall = 120;
		
		p2.info();
		
	}
}
