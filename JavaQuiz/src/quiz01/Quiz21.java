package quiz01;

import java.util.Scanner;

public class Quiz21 {
	public static void main(String[] args) {

//		int x = 3;
//		int cnt= 0;
//		for(int i =1; i<=x; i++) {
//			if(x % 1 == 0) {
//				cnt++;
//			}
//		}
//		
//		System.out.println(cnt == 2 ? "소수": "소수가아님");
//		
//		

		// 소수인지 확인

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();

		int sum = 0;
		start: for (int i = 1; i <= x; i++) {
			// 약수 검사를 하기전에 cnt는 다시 초기화
			int cnt = 0;

			for (int j = 1; j <= i; j++) {
				if (i % j == 0) { // i의 약수
					cnt++;
				}

				if (cnt > 2) { // 더 반복문를 돌릴 필요가 없을때 continue
					continue start;
				}

			} // 이 반복문을 돌고 나오면, 약수 개수가 나옴

			if (cnt == 2) {
				sum += i;
			}
		}

		System.out.println(sum);

	}
}
