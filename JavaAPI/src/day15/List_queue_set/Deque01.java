package day15.List_queue_set;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque01 {
	public static void main(String[] args) {
		
		//Deque

//		ArrayDeque<Integer> queue = new ArrayDeque<>();
		Deque<Integer> queue123 = new ArrayDeque<>();
		
		//뒤에서추가
		queue123.offer(1);
		queue123.offerLast(2);
		queue123.offerLast(3);
		queue123.offerLast(4);
		
		//앞에서 추가

		queue123.offerFirst(10);
		queue123.offerFirst(20);
		queue123.offerFirst(30);
		
		System.out.println(queue123.toString());
		
		//뒤에서 삭제
		System.out.println(queue123.pollLast());
		System.out.println(queue123.pollLast());
		
		//앞에서 삭제
		System.out.println(queue123.pollFirst());
		System.out.println(queue123.pollFirst());

		System.out.println(queue123.toString());
		
		//값 확인하기
		System.out.println(queue123.peekLast());
		System.out.println(queue123.peekFirst());
		
	}
}
