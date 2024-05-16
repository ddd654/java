package day07;

import java.util.Arrays;

public class ArrayInsert {
	public static void main(String[] args) {

		// 배열은 크기가 고정되있음
		// 원본 배열의 +1 크기의 새로운 배열을 만들고, 값을 옮김
		// 마지막에 값을 추가한다.
		// 원본배열의 주소값을 새로운 값으로

		int[] arr = { 10, 20, 30, 40, 50 };
		int data = 60;

		// 1.
		int[] newArr = new int[arr.length + 1];

		// 2.
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];

		}

		// 3.
		newArr[newArr.length - 1] = data;
		System.out.println(Arrays.toString(newArr));

		
		// 4.
		arr = newArr;
		
		
		//5. newArr 삭제
		newArr = null;
		System.out.println(Arrays.toString(arr));

	}
}
