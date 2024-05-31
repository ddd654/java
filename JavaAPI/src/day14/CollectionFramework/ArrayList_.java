package day14.CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_ {

	public static void main(String[] args) {

//		ArrayList<String> list = new ArrauList<>();
		
		
		
		List<String> list = new ArrayList<>();

		// list에 값 추가
		list.add("java");
		list.add("jsp");
		list.add("git");
		list.add("database");
		list.add("java");
		list.add("python");

		// 리스트 크기
		System.out.println("크기: " + list.size());

		// 리스트를 문자열로
		System.out.println(list.toString());

		// list 중간에 추가
		list.add(2, "사과");
		System.out.println(list.toString());

		// list 값 수정
		list.set(2, "바나나");
		System.out.println(list.toString());

		// 각 list 값 얻기
		String s = list.get(0);
		list.get(0);
		System.out.println(list.get(0));

		// list 값 삭제
		list.remove(2);
		System.out.println(list.toString());

		//
		// 배열로 리스트 빨리 만들기

//		List<String> newList = Arrays.asList("사과", "바나나", "유자");

		String[] arr = { "과자", "무지개", "우주" };

		List<String> newList = Arrays.asList(arr);
		System.out.println(newList.toString());

		
		// 리스트 병합
		list.addAll(newList);
		System.out.println(list.toString());

		// 리스트의 값 확인
		if (list.contains("과자")) {
			System.out.println("과자있으면  true");
		}
	}
}
