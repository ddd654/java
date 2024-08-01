package quiz17;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Quiz_set {
	public static void main(String[] args) {

		// 1~45 중복없는 로또번호 만들기

		// 1. 랜덤객체를 사용해서 1~45 랜덤수 생성
		// 2. List 나 set을 사용해 랜덤번호 6개 생성

		//
		Random random1 = new Random();
		Set<Integer> set1 = new HashSet<>();

		

		while(set1.size() < 6) {
			int num1 = random1.nextInt(45) +1;
			set1.add(num1);
		}
		
		System.out.println(set1);
	}

}


