package day16.lambda.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainClass03 {
	public static void main(String[] args) {

		// 스트림

		// Stream
		// IntStream
		// DoubleStream
		// LongStream

		// 스트림타입 변환
		// mapToXXX...()

		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 100; i++) {
			list.add(new Random().nextInt(100) + 1);
		}

		// 정수형 스트립으로 형변환
		long r1 = list.stream().mapToInt(t -> t).count();

		System.out.println("count" + r1);

		// count(), sum() 메서드 등등
		long r2 = list.stream().mapToInt(t -> t).sum();

		System.out.println("sum" + r2);

		double r3 = list.stream().mapToInt(t -> t).average().getAsDouble();
		System.out.println(r3);

		int r4 = list.stream().mapToInt(t -> t).max().getAsInt();
		System.out.println(r4);

		//
		int[] arr = { 1, 25, 23, 656, 34, 454 };
		int r7 = list.stream().mapToInt(t -> t).sum();
		System.out.println(r7);
		
		
		// 배열을 스트림 해서 최소값 얻기
		int r5 = Arrays.stream(arr).min().getAsInt();
		System.out.println(r5);


		


		
		//
		// boxed() 으로 원본 스트림으로 형변환
		List<Integer> list2 = IntStream.range(1, 6).boxed().collect(Collectors.toList());
		System.out.println(list2.toString());

		List<Integer> list3 = IntStream.rangeClosed(1, 6).boxed().collect(Collectors.toList());
		System.out.println(list3.toString());

//		IntStream.rangeClosed(1, 3).boxed().collect(Collectors.toList());

		// 없는 숫자 더하기

	}
}
