package day14.api.lang.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {

		// 날짜
		Date date = new Date();
		System.out.println(date);

		// 문자열로 변경
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss: E");
		String now = sdf.format(date);

		System.out.println(now);

		// 날짜 문자열 > 날짜타입으로 변환

		String str = "2024-09-12 02:23:11";

		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

		try {
			Date d = sdf3.parse(str);
			System.out.println("변경할 날짜타입:" + d);
		} catch (ParseException e) {

			e.printStackTrace();
		}

	}
}
