package day15.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map01 {

	public static void main(String[] args) {

		// 4. map 계열
		// key와 value를 한번에 저장하는 형태의 자료구조 > entry라고 부름
		// 객체 생성시, 제레릭을 이용해 <key, value> 로 저장합니다
		// 탐색이 빠름
		// key는 고유, value는 중복 있음

		// HashMap
		// TreeMap

		//
		//
		Map<Integer, String> map1 = new HashMap<>();

		// map에서 값 넣기
		map1.put(1, "사과");
		map1.put(2, "사과");
		map1.put(3, "바나나");
		map1.put(4, "코코넛");
		map1.put(5, "사과");

		System.out.println(map1.toString());

		//
		map1.put(5, "수정과");
		System.out.println(map1.toString());

		// 값 얻기
		String value = map1.get(2);
		System.out.println(value);

		// 키의 포함여부
		if (map1.containsValue("바나나")) {
			System.out.println("바나나 있음");
		}

		// 값의 삭제
		map1.remove(3);
		System.out.println(map1.toString());

		// map의 반복
		Set<Entry<Integer, String>> set = map1.entrySet();

		// Entry<Integer, String>
		for (Entry<Integer, String> entry123 : set) {
			System.out.println(entry123.getKey() + " " + entry123.getValue());
		}

	}
}
