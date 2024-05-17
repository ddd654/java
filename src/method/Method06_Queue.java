package method;

import java.util.Arrays;

public class Method06_Queue {
	public static void main(String[] args) {

		// Queue - First In First Out (FIFO)

		push(2);
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
	}

	static int[] arr = { 1, 2, 3, 4, 5, 6 };

	static void push(int data) {
		// 1. 배열크기 +1
		// 2. 배열복사 Arrays.copyOf(배열명, 복사할 길이);
		// push 코드랑 같음 - 1번 2번 합친거
		int[] temp = Arrays.copyOf(arr, arr.length + 1);

		// 마지막에 데이터 추가
		temp[temp.length - 1] = data;

		// 원본배열 변경
		arr = temp;
		temp = null;

		System.out.println(Arrays.toString(arr));
	}

	static int pop() {
		// 삭제가 가능한 조건 안에서
		// 1. 삭제할 데이터 백업
		// 2. 길이 -1 배열 생성
		// 3. 배열의 1번째 요소 ~ 마지막까지 복사
		// 4. 원본배열을 변경
		// 5. 삭제된 데이터를 반환 1>> 2>> 3>> ... >>8
		if (arr.length > 0) {

			int data = arr[0];

			int[] temp = new int[arr.length - 1];

//			for( int i = 0; i < temp.length; i++) {
//				temp[i] = arr[i +1];
//			}

			// 위 반복문과 같음
			Arrays.copyOfRange(arr, 1, arr.length); // 복사할 배열, 시작위치, 끝위치

			// 바꾼것을 원본에 넣기
			arr = temp;
			temp = null;

			return data;

		}
		return 0;
	}

}
