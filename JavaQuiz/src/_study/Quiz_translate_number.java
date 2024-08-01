package _study;

public class Quiz_translate_number {
	public static void main(String[] args) {

		// 우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다. 입국심사에서 나이를 말해야 하는데,
		// PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다. a는 0, b는 1, c는 2, ..., j는 9입니다. 예를
		// 들어 23살은 cd, 51살은 fb로 표현합니다. 나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록
		// solution 함수를 완성해주세요.

		System.out.println(solution(123));
	}

	public static String solution(int age) {
		String answer = "";
		
		//1이 b이 된다
		// 숫자를 입력하면 알파벳문자가 나오게 하기		
		String age2 = Integer.toString(age);
		
		
		
		//비교할 알파벳
		String alpa = "a";
		
		//문자열 길이만큼 반복? 알파벳 개수만큼 반복?
		for(int i = 0; i <= 26; i++) {
			
			//age2의 문자열 i번째를 i값 자체와 비교하기
			if(age2.charAt(i) == i) {
				answer += "a";
				
				
			}

		}

		
		
		return answer;
	}
}
