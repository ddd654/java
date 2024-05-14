package day06;

public class ArraySearch {
	public static void main(String[] args) {

		// 순차 탐색
		int[] arr = { 1, 2, 3, 10, 20, 50, 80, 100 };

		int find = 80;
		int findIndex = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == find) {// 찾음
				findIndex = i;
				break; // 뒤에 중복나와서 탈출

			}
		}

		if (findIndex != -1) {
			System.out.println(find + "는" + findIndex + "번째 인덱스에 있습니다.");
		} else {
			System.out.println(find + "는 없는데요");
		}
	}
}
