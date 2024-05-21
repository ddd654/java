package day08;

//Variable 객체
public class Variable {
	// 멤버변수 - 파란색
	// int a =1; 같이 안해도 기본값으로 자동 초기화
	int a;

	// 지역변수 - 갈색
	// 초기화 필요
	void printNum(int c) {
		int b = 1;

		System.out.println("멤버변수" + a);
		System.out.println("지역변수" + b);
		System.out.println("매개변수" + c);
	}

}
