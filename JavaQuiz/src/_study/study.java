package _study;

public class study {
	public static void main(String[] args) {

		System.out.println(solution(5));

	}

	public static int solution(int n) {
		int answer = 0;

		for (int i = 2; i <= n; i += 2) {
			answer += i;
		}

		return answer;
	}

}
