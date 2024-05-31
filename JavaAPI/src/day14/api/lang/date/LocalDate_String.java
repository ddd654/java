package day14.api.lang.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDate_String {
	public static void main(String[] args) {

		// 날짜, 시간 형변환하기

		LocalDate date = LocalDate.now();
		System.out.println(date);

		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);

		// ------

		// LocalDateTime 을 String 으로 형변환
		// 괄호 안에 형식으로 바꾸겠다는 뜻

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh-mm-ss");
		String now = dtf.format(datetime);

		System.out.println(now);
		
		//다시 String을 LocalDateTime으로 변환
		LocalDateTime nowtime = LocalDateTime.parse(now, DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss"));
		System.out.println(nowtime);
		
	}
}
