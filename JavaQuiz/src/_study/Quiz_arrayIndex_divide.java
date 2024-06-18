package _study;

import java.util.Arrays;

public class Quiz_arrayIndex_divide {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(3000)));
		;
		System.out.println(5000 / 5500);
	}

	public static int[] solution(int money) {

		// 길이가 2개짜리 배열, 초기화
		// 잔수, 남은돈
		int[] answer = new int[2];

		answer[0] = money / 5500;
		answer[1] = money % 5500;
		

		return answer;
	}
}
