package _study;

public class Quiz_win_RSP {
	public static void main(String[] args) {
		System.out.println(solution("500"));
		
	}

	public static String solution(String rsp) {
		String answer = "";

		// 052가 나와야

		// 경우의수 ?
		// 문자열을 하나씩 분리해서?

		// 문자열을 하나씩 분리하기, 배열에 하나씩 넣기

		for (int i = 0; i < rsp.length(); i++) {

			char b = rsp.charAt(i);
			
			if (b == '5') { //따옴표 안써서 틀림
				answer += '2';
			} else if (b == '2') {
				answer += '0';
			} else if (b == '0') {
				answer += '5';
			} else {}
			
		}

		return answer;
	}

}
