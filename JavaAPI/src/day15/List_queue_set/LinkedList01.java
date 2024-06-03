package day15.List_queue_set;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>();
		
		//ArrayList와 사용방법이 동일
		//값 추가

		list.add("사과");
		list.add("바나나");
		list.add("수박");
		
		System.out.println(list.toString());
		
		//값 얻기
		String n = list.get(1);
		
		
		//값 수정
		list.set(1, "수정");
		
		System.out.println(list.toString());
		
		//값 삭제
		list.remove(0);
	}
}
