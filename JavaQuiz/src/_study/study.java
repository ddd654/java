package _study;

public class study {
	public static void main(String[] args) {
		
		solution();
		
	}

	public static double solution(int[] numbers) {
		double answer = 0;

		for (int i = 0; i <= numbers.length; i++) {
			answer += numbers[i];
		}

		return answer;

	}

}
