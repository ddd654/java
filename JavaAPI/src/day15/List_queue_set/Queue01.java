package day15.List_queue_set;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {
	public static void main(String[] args) {

		// 자바에서 기본 queue는 LinkedList로 대신해서 사용한다

		Queue<String> queue = new LinkedList<>();

		// 큐에서 추가
		queue.add("사과"); // 뒤에서 추가
		queue.offer("복숭아");
		queue.offer("멜론");
		
		System.out.println(queue);
		
		//큐의 삭제
		String n = queue.poll();
		System.out.println(n); //큐에서 삭제하기
		System.out.println(queue.poll());
		
		System.out.println(queue.toString());
		
		
		//큐 조회하기
		
		String n2 = queue.peek();
		System.out.println(queue.toString());
		
		//
		//LinkedList를 
		LinkedList<String> list01 = new LinkedList<>();
		
		list01.add("a");
		list01.offer("b");
		list01.offer("c");
		list01.offer("앞에서");
		list01.offer("뒤에서");
		
		
		//삭제
		System.out.println(list01.poll());
		System.out.println(list01.remove(2));
		
		System.out.println(list01.toString());
		
		//
		
		
	}
}
