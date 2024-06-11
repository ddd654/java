package _study;

import java.util.Arrays;

public class study {
	public static void main(String[] args) {

		System.out.println(Arrays.toString(solution(5)));

	}

	public static int[] solution(int n) {
		int[] answer = new int[n];

		for (int i = 0; i < answer.length; i++) {
			
			answer[i] = i;
			
		}

		return answer;
	}

}
