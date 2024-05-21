package day09.this_;

public class Person_this {
	
	//부모 클래스 
	//정보 기능
	String name;
	int age;
	
	// this는 자신의 객체에 접근할때 사용, 멤버변수와 헷갈릴때
	// 생성자의 연결 - 첫번째 줄에서 this()를 생성자간 연결이 가능
	Person_this(String name, int age){
<<<<<<< HEAD
		
=======
>>>>>>> refs/remotes/origin/JavaObject
		this.name = name;
		this.age = age;
//		System.out.println("두개짜리 생성자로 호출");
	}
	
	// 위 코드와 연결
	Person_this(String name){
		this(name, 1);
	}
	
	// 첫번쨰 위 코드와 연결
	Person_this(){
		this("이름없음", 1); 
	}

}
