package day14.CollectionFramework;

import java.util.Stack;

public class Stack01 {

	public static void main(String[] args) {
		
		//모든 컬렉션은 동적인 크기를 가진다
		Stack<Integer> stack = new Stack<>();
		
		//스택에 값 넣기
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		//스택에 값 삭제
		int a = stack.pop();// 팝은 삭제 하면서 값이 리턴된다
		System.out.println(a);
		
		//스택에 들어있는 값을 문자열로 확인
		System.out.println(stack.toString());
		
		System.out.println("스택의 크기" + stack.size());
		
		//스택에서 값을 얻음, peek()
		int b = stack.peek();
		
		System.out.println(b);
		System.out.println(stack.toString());
		
		//스택이 비어있는지 확인
		System.out.println(stack.isEmpty()); 
		



	}
}
