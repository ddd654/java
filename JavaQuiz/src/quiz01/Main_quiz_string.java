package quiz01;

import java.util.Arrays;

public class Main_quiz_string {
	public static void main(String[] args) {
		// 문자열.메서드명() 류
		String str = "안녕~";

		// 문자열에서 인덱스번호인거 가져오기
		char c = str.charAt(2);
		System.out.println("2번째 인덱스:" + c);
		System.out.println("마지막번째:" + c);

		// 문자열 길이
		str.length();
		System.out.println(str.length());

		// 문자 찾기 - 문자의 위치 알려줌
		System.out.println("녕 위치 찾기" + str.indexOf("녕"));

		// 없는 문자면 -1반환
		System.out.println(str.indexOf("오"));

		// 문자 변경하기 - 대상문자, 변경할 문자
		String str1 = str.replace("안녕", "hello");
		System.out.println(str1);

		// 원본 문자열의 공백이 사라진다
		String str2 = "사과 먹고 싶다~";
		str2 = str2.replace(" ", "");

		// 문자열 자르기, 2미만 없애기
		System.out.println(str.substring(2));
		// 0이상
		System.out.println(str.substring(0, 2));

		// 문자열 split
		String str3 = "010-1234-5678";
		// 하이픈 기준으로 잘라서 배열로 반환
		String[] r3 = str3.split("-");
		String[] r4 = str3.split(""); // 한글자로 나눠줌
		char[] r5 = str3.toCharArray();

		System.out.println(Arrays.toString(r3));
		System.out.println(Arrays.toString(r4));

		// 양측공백제거
		String str4 = "  hello world  ";
		System.out.println(str4.trim());

		// 문자열 비교
		System.out.println("홍길동".equals("홍길동")); // 문자열 true
		System.out.println("홍길동".equals("코코")); // 문자열 false

		// 문자열 비교
		System.out.println("abc".compareTo("abc")); // 0 나옴, 같은 수여서
		System.out.println("abc".compareTo("abd")); // -1, 뒷문자가 더 뒤에 있음
		System.out.println("abc".compareTo("abe")); // -2, 

		// 문자열 합치기
		String.join("->", "사","과","맛");
		System.out.println(String.join("->", "사","과","맛"));

	}
}
