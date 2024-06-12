package _study;

import java.util.Arrays;

public class Quiz_odd {
	public static void main(String[] args) {

		int n = 11;
		int[] answer = new int[(n+1)/2];

		for (int i = 0; i < answer.length; i = i + 1) {
			answer[i] = 2 * i + 1;
		}

		System.out.println(Arrays.toString(answer));

	}
//1
//	public static int[] solution(int n) {
////		int[] answer = {};
//		int[] answer = new int[n];
//
//		answer[0] =1;
//		
//		return answer;
//	}

}
