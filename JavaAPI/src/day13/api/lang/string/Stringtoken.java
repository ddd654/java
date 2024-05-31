package day13.api.lang.string;

import java.util.StringTokenizer;

public class Stringtoken {
	public static void main(String[] args) {

		// split()과 유사
		// StringTokenizer 클래스
		// 문자를 구분자를 기준으로 잘라서 사용

		String str1 = "오늘은 5월 31일 이고, 금요일 입니다";

		StringTokenizer st = new StringTokenizer(str1);
		// 위 str1을 공백을 기준으로 잘라서
		System.out.println("잘린문자의 개수:" + st.countTokens());

		// 아래처럼 나온다
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());

		// ---다음 문자열이 남아있으면, true로 되서 마저 나온다 없으면 false
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		// ------------

		String log = "2024.05.31, 금요일, 사과, /no=39, id=aaa231";

		StringTokenizer st2 = new StringTokenizer(log, ", ");

		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());

		}

		//---
		
		//구분자에 ,./= 같이 여러개 넣으면 이것들 기준으로 나눔
		StringTokenizer st3 = new StringTokenizer(log, ",./=");
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken().replace(" ", ""));
		}
		
		//---------
		StringTokenizer st4 = new StringTokenizer(log, ",", true);
		while (st4.hasMoreTokens()) {
			System.out.println(st4.nextToken());
		}
		
	}
}
