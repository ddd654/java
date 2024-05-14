package day06;

import java.util.Scanner;

public class PrimeEx_debugmode {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			//약수 검사하기 전에 cnt 다시 초기화
			int cnt = 0;

			for (int j = 1; j <= i; j++) { // i 만큼 반복

				if (i % j == 0) { // i의 약수
					cnt++;
				}

			} // 이 반복문이 끝나면, 약수 개수가 나옴

			if (cnt == 2) {
				sum +=i;
			}

		}
		
		System.out.println(sum);

	}
}
