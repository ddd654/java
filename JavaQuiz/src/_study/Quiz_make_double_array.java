package _study;

import java.util.Arrays;

public class Quiz_make_double_array {
	public static void main(String[] args) {
		// 정수 배열 numbers가 매개변수로 주어집니다.
		// numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
		int[] numbers = { 1, 2, 3 };
		System.out.println(Arrays.toString(solution(numbers)));
	}

	public static int[] solution(int[] numbers) {

		int[] answer = new int[numbers.length];

		// 배열 하나하나 두배
		for (int i = 0; i < numbers.length; i++) {
			answer[i] = numbers[i] * 2;

		}

		return answer;
	}
}
