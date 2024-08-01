package day15.List_queue_set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet01 {
	public static void main(String[] args) {
		
		//set + 정렬
		
		Set<String> set = new TreeSet<>();

		set.add("강아지");
		set.add("망아지");
		set.add("고양이");
		set.add("기린");
		set.add("코끼리");
		
		
		for(String s : set) {
			System.out.println(s);
		}
	}
}
