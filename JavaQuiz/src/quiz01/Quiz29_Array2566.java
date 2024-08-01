package quiz01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Quiz29_Array2566 {
	public static void main(String[] args) {

		// 2차원 배열 문제- 2566

		Scanner scan = new Scanner(System.in);

		int[][] arr = new int[9][9];

		// 바깥 반복문 행 가로
		for (int i = 0; i < arr.length; i++) {

			// 안쪽 열 세로
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = scan.nextInt();

			}
		}

		System.out.println(Arrays.deepToString(arr));

		// 최대값
		int max = 0;
		int x = 0;
		int y = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] > max) {
					max = arr[i][j];
					x = i;
					y = j;
				}
			}
		}

		System.out.println(max);
		System.out.println((x+1) + " " + (y+1));
		

	}
}
