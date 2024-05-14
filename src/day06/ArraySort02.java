package day06;

import java.util.Arrays;

public class ArraySort02 {
	public static void main(String[] args) {

		// 버블 정렬 - 가장 느린 정렬방식
		// 가장 큰 수를 뒤로보냄
		int[] arr = { 5, 23, 1, 43, 200, 100, 41 };

		/*
		 * 5, 1, 23, 43, 100, 41, 200
		 * 
		 * 1, 5, 23, 43, 41, 100, 200
		 * 
		 * 1, 5, 23, 40, 43, 100, 200 ...
		 * 
		 */
		// 바깥 반복문이 회전수
		// 안쪽 반복문이 자리변경

		
//		for (int i = 0; i < arr.length - 1; i++) {
//
//			for (int j = 0; j < arr.length - i - 1; j++) {
//				System.out.println(i + " " + j);
//				
//				if(arr[j] > arr[j+1]) { // 부등호에 따라 정렬의 방향이 바뀜
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//					
//				}
//			}
//			System.out.println(Arrays.toString(arr));
//
//		}
		
		
		//퀵 정렬 - 가장빠른 정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

	}
}
