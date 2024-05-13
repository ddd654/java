package day05;

public class EnhancedFor {
	public static void main(String[] args) {
		// 향상된 for

		int[] arr = { 1, 2, 3, 4, 5 };

		// 배열은 조건 미만으로
//		for(int i= 0; i < arr.length; i++) {
//			
//		}

		for (int v : arr) { // 배열의 값을 순서대로 v에 넣음
			System.out.println(v);
		}

		System.out.println("-----------------");

		char[] arr2 = { 'A', 'B', 'C', 'D', 'E' };

		for (char c : arr2) {
			System.out.println(c);
		}

		
		int[] score = { 33, 55, 43, 22, 23, 43 };
		//배열안에 것들을 순서대로 넣음
		
		int sum = 0;
		for (int a : score) {
			sum += a;
		}

			System.out.println("합계:" + sum);
			System.out.println("평균:" + (double)sum / score.length);
		
	}
}
