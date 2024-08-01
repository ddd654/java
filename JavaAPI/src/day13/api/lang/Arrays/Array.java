package day13.api.lang.Arrays;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {

		// Arrays, 배열관련 클래스
		int[] arr = { 3, 4, 5, 6, 2, 3, 1, 2, 10 };

		// 배열에 있는거 정렬
		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));

		// 요소 검색
		int index = Arrays.binarySearch(arr, 6);
		System.out.println("6의위치: " + index);

		// 배열 복사
		// 배열과 복사할 길이 필요
		int[] newArr =Arrays.copyOf(arr, arr.length * 2);
		System.out.println(Arrays.toString(newArr));
		
		int[] newArr2 = Arrays.copyOfRange(arr, 3, 7); // ~~이상 ~~ 미만까지 복사해서
		System.out.println(Arrays.toString(newArr2)); // 출력
		
		if(Arrays.equals(newArr, newArr2)) {
			System.out.println("1");
		}
	}

}
