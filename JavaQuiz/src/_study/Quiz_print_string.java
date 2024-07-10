package _study;

public class Quiz_print_string {
	public static void main(String[] args) {

		System.out.println(solution("abcABC", 3));
		System.out.println("ABC".length());
	}

	//my_string이 문자열, n이 횟수
	public static char solution(String my_string, int n) {
		char answer = 0;
		
		//문자열을 한칸씩 나눠서 문자수만큼 반복하기
		for(int i = 0; i < my_string.length(); i++) {
//			answer(i) = my_string.charAt(i);

			//그중에서 1글자씩 n번 반복하기
			for(int j = 0; j < n ; j++) {
			}
			
		}
		
		return answer;
	}
}
