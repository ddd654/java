package day07;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {

		// 배열의 복사
		// 얕은복사, 깊은복사
		// 얕은복사 - 주소값을 통한 복사, 원본배열에도 영향
		// 깊은복사 - 새로운 배열을 만들어서 복사

		int[] arr = { 1, 2, 3, 4, 5 };
		int[] newArr = arr;

		System.out.println(arr == newArr);

		newArr[0] = 100;
		System.out.println(Arrays.toString(newArr));
		System.out.println(Arrays.toString(arr)); // 원본 배열에 영향

		System.out.println("--------------");

		int[] arr2 = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];

		}

		arr2[0] = 1000; // 값을 변경해도 원본에 영향없음

		System.out.println("원본: " + Arrays.toString(arr));
		System.out.println("사본: " + Arrays.toString(arr2));
	}
}
