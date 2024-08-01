package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz26_10813 {
	public static void main(String[] args) {

		// 공바꾸기
		/*
		 * 1,2,3,4,n까지 쓰여있는 배열
		 * 
		 * N 은 바구니 개수 M 은 바꿀 횟수
		 * 
		 */
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = i + 1; // 5가 들어올때

		}

		int i = 1;
		while (i <= m) {

			int a = scan.nextInt();
			int b = scan.nextInt();

			// 자리바꿈

			int temp = arr[a - 1];
			arr[a - 1] = arr[b - 1];
			arr[b - 1] = temp;


			i++;
		}
		System.out.println(Arrays.toString(arr));

		//출력
		for(int j =0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}

	}
}
