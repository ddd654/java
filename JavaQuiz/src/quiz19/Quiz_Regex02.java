package quiz19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Quiz_Regex02 {

	public static void main(String[] args) {

		String str = "123123-45644 GS25(치킨도시락) 4,400원";
		String str2 = "123123-3453454 GS25(마늘햄쌈) 5,000원";
		String str3 = "123456-3453 GS(갓혜자도시락) 6,000";

		String[] arr = { str, str2, str3 };

		// arr 상품번호, GS25, (상품명), 가격을 정규표현식으로 나눠서 출력

		String arr1 = "\\d{6}-\\d{1,8}";
//		String arr2 = "\\w[A-Z]";
//		String arr3 = "\\d*";
//		String arr4 = "\\W";

		Pattern p = Pattern.compile(arr1);
//		Pattern p2 = Pattern.compile(arr2);
//		Pattern p3 = Pattern.compile(arr3);
//		Pattern p4 = Pattern.compile(arr4);

		for (int i = 0; i < arr.length; i++) {

			Matcher m = p.matcher(arr[i]);
//			Matcher m2 = p2.matcher(arr[i]);
//			Matcher m3 = p3.matcher(arr[i]);
//			Matcher m4 = p4.matcher(arr[i]);

			if (m.find()) {
				System.out.println("번호" + m);
			}
			
		}

		// 상품

	}

}
