package day06;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {

		// 배열의 정렬
		// 선택정렬, 버블정렬
		int[] arr = { 5, 23, 1, 43, 200, 100, 41 };

		/*
		 * 선택 1, 23, 5, 43 ...
		 * 
		 * 1, 5, 23, 43, 200...
		 * 
		 * 1, 5, 23, 43, 200...
		 * 
		 * 1, 5, 23, 41, 200, 100, 43
		 * 
		 * 1, 5, 23, 41, 43, 200, 100
		 * 
		 * 1, 5, 23, 41 ,43, 100, 200
		 */

		// 오름차순
		// 바깥 반복문 - 회전수
		// 안쪽 반복문 - 자리바꿈

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j <= arr.length; j++) {

				if (arr[i] > arr[j]) { 
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
