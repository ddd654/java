package day09.encap.good;

public class Mainclass {
	public static void main(String[] args) {

		MyDate ma = new MyDate();

		ma.setYears(2232);

		int year = ma.getYear();
		System.out.println("년도" + year);

		/////////

		MyDate my = new MyDate();

		// 15를 세트
		my.setDay(15);

		// 15 겟
		int day = my.getDay();
		System.out.println(day + "일");

		
		
		my.setSsn("123456-1234567");

		
		my.setDay(day);
		my.setMonth(12);
		my.setyear(12);
		String ssn = my.setSsn();
		
		
		
		
		
		

	}
}
