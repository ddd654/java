package day07;

import java.util.Arrays;

public class ArrayInsert01 {
	public static void main(String[] args) {

		// 배열 앞에 data를 추가하려고 한다
		// 1. 새로운 배열 +1
		// 2. 기존 배열을 다음 인덱스번째로 옮겨담음
		// 3. 0번째에 data 추가

		int[] arr = { 10, 20, 30, 40, 50 };
		int data = 12; // 넣을 값

		// 새로운 배열 +1
		int[] newArr = new int[arr.length + 1];

		// 배열 옮기기
		for (int i = 0; i < arr.length; i++) {
			newArr[i + 1] = arr[i];
		}

		newArr[0] = 12;

		System.out.println(Arrays.toString(newArr));

	}
}
