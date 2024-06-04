package day15.map;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap01 {
	public static void main(String[] args) {

		// 맵의 특징 + 키의 정렬
		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();

		map1.put(22, "홍길동");
		map1.put(12, "사과");
		map1.put(33, "바나나");
		map1.put(44, "키위");

		System.out.println(map1.toString()); // 정렬된다

		//
		System.out.println("33번 키에 해당하는 값: " + map1.get(33));

		Set<Entry<Integer, String>> set1 = map1.entrySet();

		for (Entry<Integer, String> entry : set1) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

	}
}
