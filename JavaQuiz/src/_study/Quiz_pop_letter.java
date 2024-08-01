package _study;

public class Quiz_pop_letter {
	public static void main(String[] args) {

		System.out.println(solution("abcd", "d"));
	}

	public static String solution(String my_string, String letter) {
		String answer = "";
		
		for(int i = 0; i < my_string.length(); i++) {
			if(my_string.charAt(i) != letter.charAt(0) ) {
				answer += my_string.charAt(i);
			}
		}
		
//		replace함수가 있다
		
		return answer;
	}
}
