package quiz19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quiz_Regex {
	public static void main(String[] args) {
		
		
		String a = "[0-9]+,?[0-9]+원";

		//가격의 패턴 3개 찾아보기
		String str = "헐2,500원 ㅋㅋㅋ 찾아보시지 1,200원 6,000원";
		
		
		Pattern p1 = Pattern.compile(a);
		Matcher m1 = p1.matcher(str);
		
		while(m1.find()) {
			System.out.println(m1.group());
		}
		
		
	}
}
