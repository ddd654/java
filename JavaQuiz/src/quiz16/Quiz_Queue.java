package quiz16;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Quiz_Queue {
	public static void main(String[] args) {

		Customer[] arr = { 
				new Customer("hong", 5), 
				new Customer("lee", 4), 
				new Customer("jhon", 1),
				new Customer("홍", 7), 
				new Customer("alen", 2) 
				};

		// 은행에 번호표를 뽑아 갖고 있는 핸덤한 Customer 배열이다
		// 번호표 순대로 객체 출력
		
		Queue<Customer> queue = new PriorityQueue<Customer>();
		queue.addAll(Arrays.asList(arr));
		
		while(queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		System.out.println(queue);


		
		/////////////
//		System.out.println(Arrays.toString(arr));

//		
//		Queue<Customer> que1 = new PriorityQueue<Customer>();
//		System.out.println(que1);
//
//
//		for(int i = 0; i <= arr.length; i++) {
//			que1.add(arr[i]);
//
//		}
//
//		System.out.println(que.poll());
//
//		System.out.println(que1);


	}
}
