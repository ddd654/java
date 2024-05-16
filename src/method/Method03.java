package method;

import day01.SystemOut;

public class Method03 {
	public static void main(String[] args) {

		/*
		 * return type - 반환 유형
		 * 
		 * 1. 메서드가 돌려주는 값에 대한 타입 
		 * 
		 * 2. 반환 유형이 있는 메서드는 호출문 값, println 안에서 출력
		 *
		 * 3. 반환이 없는 경우 반환 유형자리에 void 넣기
		 */

		System.out.println(add(1, 3));
		System.out.println(add(add(1,2),add(3,4)));

		
		sub(5, 3); //반환이 없는 메서드
		confirm(-100);
	}

	// 매개변수 2개 받아서, 구 매개변수의 합을 리턴
	static int add(int a, int b) {
		return a + b;
	}

	// 반환 유형이 없는 메서드
	
	static void sub(int a, int b) {
		System.out.println(int a, int b);
		return int a, int b;

	}

	static void confirm(int num) {
		if (num < 0) {
			System.out.println(int num);
		}
		return num;
	}

}
