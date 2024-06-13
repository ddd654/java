package _study;

public class Quiz_make_piece {
	public static void main(String[] args) {
		// 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기
		// 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다.
		// 피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는
		// solution 함수를 완성해보세요.

		double n = 2;

		System.out.println(n / 7);
		System.out.println(solution(2));

	}

	public static double solution(int n) {
		int answer = 0;

		if (n / 7 <= 1) { // n이 7 이하이면
			answer = 1;
		} else if( n % 7 == 0) { //  뚝 떨어질때
			answer = n / 7;
		} else {
			answer = n / 7 + 1; // 8 이상 14면 2여야하는데 3이나옴
		}

		return answer;
	}

}
