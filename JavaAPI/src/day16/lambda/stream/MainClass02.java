package day16.lambda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass02 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 100; i++) {
			list.add(new Random().nextInt(100) + 1);
		}

		System.out.println("원본:" + list.toString());

		// distinct() 중복 제거
		// 지금 타입을 잘 알고서 .
		list.stream().distinct().forEach(a -> System.out.print(a));

		System.out.println();

		// 컬렉트 -> 다시 컬렉션으로 반환
		List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
		System.out.println(newList.toString());

		// filter() 걸러내기, true인 값만 리턴
		list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
		;

//		Predicate<T>;

		// sorted() 정렬하기

		list.stream().filter(t -> t % 2 == 0).sorted().forEach(t -> System.out.print(t + " "));

		System.out.println();
		System.out.println("---");

		// map() 리턴에 담긴 값으로 새로운 Stream 생성
		List<String> list2 = list.stream().map(a -> {
			return a % 2 == 0 ? "짝" : "홀";
		}).collect(Collectors.toList());
		System.out.println(list2.toString());

		System.out.println("-----");

		//
		//
		// 원본 list를 가지고
		// 중복을 제거하고, 65보다 큰수만 정렬해서 아스키코드로 변환 후 리스트로 생성

//		Stream<Integer> list123 = list.stream().map(b -> b > 65 ? b: 1).distinct().sorted().collect(Collectors.toList());

		List<Character> list123 = list.stream().distinct().sorted().filter(b -> b > 65).map((Integer c) -> (char) c.intValue()).collect(Collectors.toList());
		System.out.println(list123.toString());
		
		
		
	}

	public static int solution(int num1, int num2) {
		int answer = 0;

		answer = (int) ((num1 / num2) * 1000);

		return answer;
	}
}
