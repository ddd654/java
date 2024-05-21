package day09.overloading.basic;

public class Basic {
	// 메서드 중복
	// 메서드나 생성자의 중복 선언하는것
	
	void input(int a) {
		System.out.println("정수 한개 입력");
		
	}
	
//	int input(int a) {
//		
//	}
	
<<<<<<< HEAD
	//동일한 input인데 중복으로 선언 후 매개변수를 바꿔서 넣기
	
	void input(String s) {
		System.out.println("문자열 1개 입력");
	}
	
	void input(int a, double b) {
		System.out.println("정수, 실수 1개 입력");
	}
	
	//매개변수 바꿔 넣기
=======
	void input(String s) {
		System.out.println("문자열 1개 입력");
	}
	
	void input(int a, double b) {
		System.out.println("정수, 실수 1개 입력");
	}
	
>>>>>>> refs/remotes/origin/JavaObject
	void input(double b, int a) {
		System.out.println("실수, 정수 1개 입력");

	}
	
	
	
}
