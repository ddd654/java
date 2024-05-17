package method;

import java.util.Arrays;

public class Method05_ArrayStack {

	public static void main(String[] args) {

		// 배열의 한계점은 크기가 정적이다
		// Stack - Last In First Out

		// int[] arr = { 1, 2, 3 };

		push(2);
		push(4);
		push(6);
		push(7);
		System.out.println(Arrays.toString(arr));

		//
		System.out.println(pop());
	}

	static int[] arr = { 1, 2, 3 };

	// 값 추가하기 -push
	static void push(int data) {
		// 뒤에 값을 하나 추가
		// 하나 더 크게
		int[] temp = new int[arr.length + 1];

		// 원본배열의 요소를 복사
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}

		// 마지막에 data를 추가함
		temp[temp.length - 1] = data;

		// 원본배열을 채움
		arr = temp;
		// temp 삭제
		temp = null;

	}

	// 특정 값 없애기 - pop
	static int pop() {

		if (arr.length > 0) {
			// 1. 삭제할 데이터 백업
			int data = arr[arr.length - 1];

			// 2.arr가 -1인 사본 배열을 만든다
			int[] temp = new int[arr.length - 1];

			// 3. 값을 복사
			for (int i = 0; i < temp.length; i++) {
				temp[i] = arr[i];
			}

			// 4. 원본배열을 바꾼다
			arr = temp;
			temp = null;

			// 삭제한 데이터 반환
			return data;

		}

		return 0;
	}

}
