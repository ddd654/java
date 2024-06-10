package _study;

import java.util.Arrays;
import java.util.Scanner;

public class study {
	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		int a = scan1.nextInt();

		// 배열 int[] arr 만들기
		int[] arr = new int[a];

		// 배열에 길이만큼, 1씩 넣기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(solution(arr));

	}

	public static double solution(int[] numbers) {
		double answer = 0;

		for (int i = 0; i <= numbers.length; i++) {
			answer += numbers[i];
		}

		return answer;

	}

}
