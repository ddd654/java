package day16.lambda.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {

		// 람다 스트림
		// 컬렉션 요소에는, 컬렉션처리를 효율적으로 하기 위한 다양한 스트림 함수를 제공함

		// 기존의 방식

		List<String> list1 = Arrays.asList("apple", "banana", "kiwi");

		Iterator<String> iter = list1.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		// 람다스트림으로
		Stream<String> stream1 = list1.stream();

//		stream1.forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//				
//				//실행 시킬 코드를 적는곳
//				
//				
//				
//			}
//		});

		stream1.forEach(t -> System.out.println(t));
		
		stream1.collect(null);

	}

}
