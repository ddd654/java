package _study;

public class Quiz_bacteria {
	public static void main(String[] args) {
		// 어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
		// 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를
		// return하도록 solution 함수를 완성해주세요.

		System.out.println(solution(7, 15));

	}

	private static int solution(int n, int t) {
		// TODO Auto-generated method stub
		int answer = 0;

//		7, 14, 28, 56, 112, 224...

//		n*2^0, 7*2^1, 7*2^2, 7*2^8...
		
		int a =(int) Math.pow(2, t);
		
		answer = n * a;


		return answer;
	}

}
