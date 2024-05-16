package day07;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMatrix {
	public static void main(String[] args) {

		// 다차원 배열
		// 배열안에 배열이 저장되는 형태

		// 2차원 배열 모양
		// int[][] arr;

		int[] kor = { 10, 20, 30 };
		int[] math = { 40, 50, 60 };
		int[] eng = { 70, 80, 90 };

		// 배열에 넣기
		int[][] arr = { kor, { 40, 50, 60 }, eng };

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));

		// 2차원 배열에 사용
		// arr[행][열] 가로 세로
		System.out.println(arr[0][0]);
		arr[0][0] = 100; // 0 0에다가 0
		System.out.println(arr[0][0]);

		// 2차원을 한번에 생성, 초기화
		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// 2차원 배열 크기만 지정
		int[][] arr3 = new int[3][4];

		// deepToString써서 배열 크기 보기
		System.out.println(Arrays.deepToString(arr3));

		// 2차원 배열의 순회
		// 바깥 반복문은 행 - 가로
		int x = 1;
		for (int i = 0; i < arr3.length; i++) {

			// 안쪽 반복문은 열 - 세로
			for (int j = 0; j < arr3[i].length; j++) {
				arr3[i][j] = x++; // 먼저 값을 넣고 증가한다 i가 0이면, j는 1234...
			}
		}
		
		System.out.println(Arrays.deepToString(arr3));
	}
}
