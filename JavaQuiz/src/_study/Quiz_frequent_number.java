package _study;

import java.util.Arrays;

public class Quiz_frequent_number {
	public static void main(String[] args) {
		// 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
		// 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록
		// solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.

		int[] array = { 1, 3, 3, 2, 2, 3, 4 };
		System.out.println(Arrays.toString(solution(array)));

	}

	public static int[] solution(int[] array) {
		int answer = 0;

		// [ 10, 20, 10, 20, 3, 4]
		// 값을 정렬하고서, 앞값과 뒷값이 같은게 많으면 -1
		Arrays.sort(array);

		return array;
	}
}
