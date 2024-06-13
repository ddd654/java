package _study;

import java.util.Arrays;

public class Quiz_make_max {
	public static void main(String[] args) {
		// 최대값 두개 곱
	    int[] numbers = {1, 2, 3, 4};
		System.out.println(solution(numbers));

	}

	public static int solution(int[] numbers) {
		int answer = 0;
		int[] answerArr = new int[numbers.length];

		for (int i = 0; i < answerArr.length; i++) {
			answerArr[i] = i;
		}
		Arrays.sort(numbers);

		answer = numbers[numbers.length -1] * numbers[numbers.length - 2];

		return answer;
	}

}
