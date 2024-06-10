package quiz19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quiz_Regex03 {
	public static void main(String[] args) {

		// buffered 사용해서 읽는다
		// 정규표현식 사용해서 일련번호, 지점(건담베이스 강남),
		// 등급[등급], 상세내용, 가격 으로 5개 출력

		// 상세내용 정규표현식으로 찾기 불가능해서 시작, 끝지점으로 문자열 자르기

		String path = "C:\\Users\\user\\Downloads\\건담.txt";
		BufferedReader br = null;

		String p1 = "\\d{8}-\\d{2}-\\d{12,13}";
		String p2 = "건담[가-힣]* [가-힝]점";
		String p3 = "\\[[A-Z가-힣]\\]";
		String p4 = "[0-9],*[0-9]원";

		try {
			br = new BufferedReader(new FileReader(path));

			String str;
			while ((str = br.readLine()) != null) {
				System.err.println(str);
			}
			
			Matcher m1 = Pattern.compile(p1).matcher(str);
			Matcher m2 = Pattern.compile(p2).matcher(str);
			Matcher m3 = Pattern.compile(p3).matcher(str);
			Matcher m4 = Pattern.compile(p4).matcher(str);
			
			
			if(m1.find() ) {
				System.out.println(m1.group());
			}
			
			

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
