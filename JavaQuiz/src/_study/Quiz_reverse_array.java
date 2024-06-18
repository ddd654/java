package _study;

import java.util.Arrays;

public class Quiz_reverse_array {
	public static void main(String[] args) {

		// 넣을 숫자
		int[] num_list = { 1, 2, 3, 4, 5 };
		int[] answer = solution(num_list);
		System.out.println(Arrays.toString(answer));
	}

	public static int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length];

//		// 5 >> 1 ??, 개수가 홀수인경우 짝수인경우??
//		// 마지막자리에서 0번째로, 0번째는 마지막자리로
//		for (int i = 0; i < num_list.length / 2; i++) {
//			int temp = num_list[i];
//			num_list[i] = num_list[num_list.length - i - 1];
//			num_list[num_list.length - i - 1] = temp;
//
//		}
//
//		// 배열을 answer에 넣기
//		// 배열 i에다가 값을 앤서에 넣기
//		for (int i = 0; i < num_list.length; i++) {
//			answer[i] = num_list[i];
//		}

		//배열 뒤집기
		for (int i = 0; i < num_list.length; i++) {
			answer[i] = num_list[num_list.length - i - 1];
		}

		return answer;
	}

}
