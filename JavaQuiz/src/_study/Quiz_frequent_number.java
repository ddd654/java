package _study;

import java.util.Arrays;

public class Quiz_frequent_number {
	public static void main(String[] args) {
		// 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
		// 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록
		// solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.

		int[] array = { 1, 2, 3, 3, 3, 4 };
		System.out.println(solution(array));
	}

	public static int solution(int[] array) {
		int answer = 0;

		// 길이만큼 값을 하나씩 확인, 같은 값을 카운트?
		// 첫번쨰 배열값을 하나하나 비교?

//		for (int i = 0; i < array.length; i++) {
//			// 배열 값 하나를 비교
//			for (int j = 1; j < array.length; j++) {
//				// 배열 값 중복 카운트
//				if (array[i] == array[j]) { // i가 0일때 j는 1,2,3,4...
//					answer += 1;
//				}
//			}
//
//		}

		for (int i = 0; i < array.length; i++) {

			if (array[i]) {

			}

		}

		return answer;
	}
}
