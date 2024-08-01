package day15.List_queue_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set01 {
	public static void main(String[] args) {

//		HashSet<String> d = new HashSet<String>();
		Set<String> set = new HashSet<>();

		set.add("java");
		set.add("coco");
		set.add("tree");
		set.add("maguc");
		set.add("java"); // 중복 없어짐
		set.add("apple");
		set.add("banma");

		System.out.println("크기: " + set.size());
		System.out.println(set.toString());

		// set 속 값 확인하려면 반복자 필요

		Iterator<String> iter = set.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		for (String s : set) {
			System.out.println(s);
		}
		System.out.println("---------");

		
		
		set.remove("java");
				
		
			
	}
}
