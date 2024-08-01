package day15.List_queue_set;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue01 {
	public static void main(String[] args) {

		PriorityQueue<Integer> priQueue = new PriorityQueue<>();

		// 값 넣기
		priQueue.offer(5);
		priQueue.offer(2);
		priQueue.offer(3);
		priQueue.offer(16);
		priQueue.offer(7);

		System.out.println(priQueue.toString());

		// 값 꺼내기, 삭제
		// 결과값이 정렬되있음
		System.out.println(priQueue.poll());
		System.out.println(priQueue.poll());
		System.out.println(priQueue.poll());
		System.out.println(priQueue.poll());
		System.out.println(priQueue.poll());
		System.out.println(priQueue.poll());

		// Queue가 비어있는지 확인
		if (priQueue.isEmpty() == false) {
			// 큐가 비어있는지 아닌지 확인

			System.out.println("큐가 비어있지 않음");

		}
		System.out.println("사과".compareTo("사"));
		System.out.println("사".compareTo("사과"));

		System.out.println("----------");
		
		//UserVO를 담을 수 있는 queue
		Queue<UserVO> que = new PriorityQueue<UserVO>();

		que.offer(new UserVO("사과", 22));
		que.offer(new UserVO("복숭아", 33));
		que.offer(new UserVO("바나나", 56));
		que.offer(new UserVO("망고", 12));
		
		
		//큐가 순서를 확인할 때 compareTo 메서드를 사용
		//comparable 인터페이스를 구현해서 compareTo 메서드를 오버라이딩한다
		
		System.out.println(que.toString());

		
		boolean flag = false;
		
		while(que.isEmpty() == flag) {
			System.out.println(que.poll());
		}
		
	}

}
