package quiz02;

public class Person {
	
	String name;
	int age;
	int tall;
	
	void info() {
		System.out.println(name);
		System.out.println(age + "세");
		System.out.println("키: "+ tall);
	}
	
	Person(String pName, int pAge, int pTall){
		name = pName;
		age = pAge;
		tall = pTall;
	}
	
	//생성자를 한번 만들면, 자동으로 만들지 않음
	//기본 생성자를 만들어줘야함
	Person(){
		
	}
	
	
}
