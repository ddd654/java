package day13.api.lang.string;

import java.util.Arrays;

public class String01 {
	public static void main(String[] args) {

		String str = "사과는 맛있어";
		String str2 = new String("바나나");
		String str3 = new String(new char[] { '바', '나', '나' });

		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);

		// charAt() - 한글자 자르기
		
		System.out.println(str.charAt(0));

		// substr()
		System.out.println(str.substring(5)); // 5미만 삭제
		System.out.println(str.substring(5, str.length())); // 5이상 길이 미만 삭제

		// split()
		// str을 괄호안으로 나눠서 문자열을 자름, 기준은 삭제
		String[] arr = str.split(" "); // 구분자 기준으로 문자열을 자름
		System.out.println(Arrays.toString(arr));

		// toCharArray()
		// 한 글자씩 끊어서 줌
		char[] arr2 = str.toCharArray();
		System.out.println(Arrays.toString(arr2));

		// ------------
		// 문자열 위치 찾기
		System.out.println(str.indexOf("사")); // 앞에서부터 사 찾기
		System.out.println(str.lastIndexOf("과")); // 뒤에서부터 과 찾기
		System.out.println(str.indexOf("없는 문자")); // -1은 문자가 없다는 뜻

		// 문자열 길이
		System.out.println(str.length());

		// 대소문자 변환
		str = "Happy World";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());

		// ------

		// 공백 제거
		str = "  11 22 33   ";
		System.out.println(str);
		System.out.println(str.trim());
		;

		// replace() - 대상 문자를, 변경할 문자로 바꾼다
		String s = str.replace("2", "사과");
		System.out.println(s);

		System.out.println("-----------replace");
		str = str.replace(" ", "");
		System.out.println(str);// 원본 문자에 반영
		

		// -----
		// 문자열 비교
		if ("사과".equals("사과")) {
		}

		// 문자열 대소 비교
		System.out.println("사과".compareTo("과자"));
		System.out.println("바나나".compareTo("과자"));
		System.out.println("과자".compareTo("과자")); //0나오면 같은 문자
		
		//문자열 합치기
		System.out.println(String.join(">>","서울","귤","메론"));
	}
}
