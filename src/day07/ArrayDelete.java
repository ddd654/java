package day07;

import java.util.Arrays;

public class ArrayDelete {
	public static void main(String[] args) {

		// 배열의 삭제 - 배열은 삭제가 없음

		// 1. 타겟인덱스 지정해서, 옮길 위치 지정
		// 2. 길이 -1 인 새로운 배열에 옮김

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int targetIndex = 4;
		System.out.println("원래:" + Arrays.toString(arr));

		// 타겟인덱스 부분에 arr[i + 1] 값 넣기 반복
		for (int i = targetIndex; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		System.out.println(Arrays.toString(arr));

		
		int[] newArr = new int[arr.length ];
		for(int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[i];
		}
		System.out.println(Arrays.toString(arr));

		// 기존 arr은 삭제
		arr = newArr;
		newArr = null;

		System.out.println(Arrays.toString(arr));
	}
}
