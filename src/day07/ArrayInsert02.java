package day07;

import java.util.Arrays;

public class ArrayInsert02 {
	public static void main(String[] args) {

		// 배열 중간에 추가하기
		// 1. 배열 생성 +1
		// 2. 배열을 옮겨담음
		// 3.

		int[] arr = { 1, 2, 3, 4, 5 };

		// targetIndex번째에 data추가
		int targetIndex = 2;
		int data = 12;

		// 배열 생성 +1
		int[] newArr = new int[arr.length + 1];

		// 배열 옮김
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = newArr[i];
		}

		// 인덱스값에 넣을 준비
		for (int i = newArr.length - 1; i > targetIndex; i--) {
			newArr[i] = newArr[i-1];
			
		}
		
		newArr[targetIndex] = data;


		System.out.println(Arrays.toString(newArr));

	}
}
