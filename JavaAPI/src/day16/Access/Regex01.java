package day16.Access;

public class Regex01 {
	public static void main(String[] args) {
		
		
		String info = "사과|20세|서울시 강남구|010-2424-1313";
		
		// regex - 정규 표현식
		//전화번호 마스킹하기
		String pattern = "[0-9]{3}-[0-9]{4}-[0-9]{4}";
		String result = info.replaceAll(pattern, "***-****-****");
		System.out.println(result);
		
	}
}
