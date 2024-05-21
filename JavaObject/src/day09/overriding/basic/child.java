package day09.overriding.basic;

public class child extends Parent {

	// 오버라이딩 설명할 수 있어야함
	// 오버라이딩된 코드는 먼저 실행됨 <<

	// 오버라이딩 하기
	// 부모님 메서드를 덮어씌움

	// 왼쪽에 조그만 초록 삼각형이 오버라이딩 표시
	void method02() {
		System.out.println("자식의 오버라이딩된 메서드 2번");
	}

}
