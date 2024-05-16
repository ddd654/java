package day06;

import java.util.Arrays;

public class ArraySearch02 {
	public static void main(String[] args) {
		
		//이진탐색 - 반반 분할 탐색
		//조건이 있음 > 배열이 나열 되어있어야함
		
		/*
		 * 1. 시작값, 끝값을 처음에 2개를 배치
		 * 2. 중간값을 구함
		 * 3. 중간값이 찾는값인지 확인
		 * 4. 중간값이 찾는값보다 크면, end를 중간값 -1 내림
		 * 5. ~ 작으면, start를 중간값 +1 내림
		 * 반복
		 * start 와 end가 교차되면 끝
		 * 
		 */
		
		int[] arr = { 1, 2, 3, 10, 20, 50, 80, 100 };
		
		int find = 80;
		int start = 0; // 시작
		int end = arr.length - 1; //마지막

		
		while(start <= end) { //start가 클때까지 반복
			
			int mid = (start + end) / 2; //짝수 홀수 상관없음
			
			if(arr[mid] == find) { //찾음
				System.out.println("찾은 값은:" + arr[mid] + "입니다.");
				break; // 더 이상 찾을 필요가 없음
			}
			
			if(arr[mid] < find) {
				start = mid +1;
			} else {
				end = mid -1;
			}
			
		}
		
		//못찾았을때
		if(start > end) {
			System.out.println(find + "는 없습니다.");
		}
		
		//이진탐색기
		// 음수나오면 값이 없음, 양수나오면 해당 인덱스 위치
		System.out.println(Arrays.binarySearch(arr, 80));// 배열 이름, 찾을값
		
		
		
	}
}
