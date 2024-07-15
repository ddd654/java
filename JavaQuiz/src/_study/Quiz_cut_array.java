package _study;

import java.util.Arrays;

public class Quiz_cut_array {
	public static void main(String[] args) {

		int[] numbers = new int[] { 1, 2, 3 };
		System.out.println(Arrays.toString(solution(numbers, 1, 2)));
	}

	public static int[] solution(int[] numbers, int num1, int num2) {
		int[] answer = new int[num2 - num1 +1]; // num2 - num1 만큼 길이의 배열에서 +1

		// num1이 시작점, num2가 끝나는곳
		for (int i = 0; num1 <= num2; num1++) {
			if (num1 <= num2) { // num1이 num2까지
				answer[i] = numbers[num1];
				i++; // i번째에 넣고 자릿수 하나씩 증가
			}
		}
		return answer;
	}
}
