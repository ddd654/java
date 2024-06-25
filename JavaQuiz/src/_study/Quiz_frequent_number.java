package _study;

import java.util.Arrays;

public class Quiz_frequent_number {
	public static void main(String[] args) {
		// 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
		// 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록
		// solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.

		int[] array = { 1, 2, 2, 3, 3, 3, 4 };
		System.out.println(solution(array));
		System.out.println(Arrays.toString(solution(array)));

	}

	public static int[] solution(int[] array) {
		int answer = 0;

//		Arrays.sort(array); // 배열 정렬하기
//
//		// 아니면 같은 값만을 새로운 배열에 넣어서 다른값 나오는 순간 result에 -1 넣기
//
//		// 새로운 배열 만들기
//		int[] index = new int[array.length];
//
//		// 같은 값들만 모은 배열 만들기
//		int j = 0;
//		for (int i = 0; i < array.length - 1; i++) {
//
//			if (array[i] == array[i + 1]) { // 1 == 2
//				System.out.println("앞 뒤 같은값");
//
//				index[j] = array[i]; // 앞에다가 앞의 값 넣기 j0, 2|
//				index[j + 1] = array[i + 1];// 뒤에다가 뒤의 값 넣기 j1, 2|
//				j = j + 2; // 0 이였다가 1 증가
//
//			} else {
//				System.out.println("앞 뒤 다른값이 나왔어");
//
//			}
//
//		}
//
//		// 같은 값이 모인 배열, 틀린값이 나온 순간 -1, 0 제외 필요
//		for (int i = 0; i < index.length - 1; i++) {
//
//			if (index[i] == index[i + 1]) {
//				answer += 1;
//
//			} else {
//				answer = -1;
//			}
//		}
		
		return answer;

	}
}
