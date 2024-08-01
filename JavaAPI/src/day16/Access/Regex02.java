package day16.Access;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex02 {
	public static void main(String[] args) {

		// \\d  숫자를 찾음
		// \\d+  1개이상 찾음
		// \\d* 0개이상 찾음
		// \\d? 0또는 1개
		// \\d{3} 3개
		// \\{3,4} 3이상
		
		// \\w 영문자 혹은 숫자
		//
		// [a-z] 소문자
		//[0-9a-z] 숫자 영문자
		//[a-zA-Z] 모든 영문자
		// [] 영문자
		// 숫자 영문자
		

		String info = "30세|서울 관악구|02-1253-1232|wegw@dwegr.net";

		// 전화번호 형식
		String phone = "\\d{2,3}-\\d{3,4}-\\d{4}"; // 숫자가 2개이상 3개 미만

		// 이메일 형식
		String email = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]+";
						
		Pattern p1 = Pattern.compile(phone); //정규표현식 엔진 생성
		Matcher m1 = p1.matcher(info);        //적용시킬 문자열 남음
		
		
		
		//find() -정규표현식 찾기
		while(m1.find()) { //찾으면 true, 아니면 false
			System.out.println("문자: "+m1.group()); //일치하는 정규표현식 찾기
			System.out.println("시작:" + m1.start());
			System.out.println("끝" + m1.end());
		}
		
		System.out.println("-----");
		
		Matcher m2 = Pattern.compile(email).matcher(info);
		
		while(m2.find()) {
			System.out.println("이메일" + m2.group());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
