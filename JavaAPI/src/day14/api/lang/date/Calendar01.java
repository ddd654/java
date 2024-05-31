package day14.api.lang.date;

import java.util.Calendar;

public class Calendar01 {
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		// day, hour, minute, second ...
		
		System.out.println(year + " " + month);
	}
}
