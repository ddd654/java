package _study;

import java.util.Arrays;

public class Quiz_isSimilar_array {
	public static void main(String[] args) {
		// 두 배열이 얼마나 유사한지 확인해보려고 합니다.
		// 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution
		// 함수를 완성해주세요.
		String[] s1 = { "a", "b", "c" };
		String[] s2 = { "q", "w", "e" };

		String[] longArr = s1.length > s2.length ? s1 : s2;
		String[] shortArr = s1.length < s2.length ? s1 : s2;
		System.out.println(Arrays.toString(longArr));
		System.out.println(Arrays.toString(shortArr));

		System.out.println(solution(s1, s2));

	}

	public static int solution(String[] s1, String[] s2) {
		int answer = 0;

		// 다른 방법 찾기

		for (String str1 : s1) {

		}

		// 배열이 같으면
		if (s1.length == s2.length) {
			for (int i = 0; i < s1.length; i++) {

				for (int j = 0; j < s2.length; j++) {

					if (s1[i].equals(s2[j]))
						answer++;

				}
			}

		} else {

			// 1. 어느 배열이 긴지 확인하기
			String[] longArr = s1.length > s2.length ? s1 : s2;
			String[] shortArr = s1.length < s2.length ? s1 : s2;

			// 2. 긴배열에서 짧은배열을 하나씩 확인하기
			for (int i = 0; i < longArr.length; i++) {

				for (int j = 0; j < shortArr.length; j++) {

					if (longArr[i].equals(shortArr[j])) {
						answer++;
					}

				}

			}
		}
		return answer;

	}

}
