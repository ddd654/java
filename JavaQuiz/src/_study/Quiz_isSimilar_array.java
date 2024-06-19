package _study;

public class Quiz_isSimilar_array {
	public static void main(String[] args) {
		// 두 배열이 얼마나 유사한지 확인해보려고 합니다.
		// 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution
		// 함수를 완성해주세요.
		String[] s1 = { "a", "b", "c" };
		String[] s2 = { "a", "c", "a" };
		System.out.println(solution(s1, s2));

	}

	public static int solution(String[] s1, String[] s2) {
		int answer = 0;
		String[] arr1 = new String[s1.length];
		String[] arr2 = new String[s2.length];
		
		
		
		//1. 어느 배열이 긴지 확인하기
		String[] longArr = s1.length > s2.length ? s1 : s2;
		String[] shortArr = s1.length < s2.length ? s1: s2;
		
		//2. 긴배열에서 짧은배열을 하나씩 확인하기
		s1[0] == s2[i];
		
		for(int i = 0; i < longArr.length; i++) {
			if(longArr[i] == )
		}
		
		return answer;
	}

}
