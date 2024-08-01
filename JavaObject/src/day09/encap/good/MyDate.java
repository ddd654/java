package day09.encap.good;

public class MyDate {

	private int year;
	private int month;
	private int day;
	private String ssn; // 주민 번호

	/*
	 * 
	 * 은닉된 변수값 사용하기
	 * 
	 * setter
	 * 
	 * 1. 은닉 저장용 메서드 2. public으로 선언하고, 이름이 set+멤버변수명(카멜표기법)
	 */

	// setter
	public void setYears(int year) {
		// setter를 사용하면, 유효성 검증코드를 넣을 수 있음

		// ex)
		if (year < 1 || year > 2024) {
			System.out.println("year");
			return;
		}

		this.year = year;
	}

	/*
	 * getter
	 * 
	 * 1.은닉한 값 조회하는 메서드 2. public 선언 후, get+멤버변수
	 */

	// getter
	public int getYear(/**/) {
		return year;
	}

	// 1. month, day, ssn에 대한 setter, getter 만들기
	// month: 1~12
	// day: 1~31
	// ssn: "-"은 제거, 문자열 길이가 13인경우만 저장

	public void setMonth(int month) {
		this.month = month;

		if (month < 1 || 12 > month) {
			System.out.println("잘못된 값이에요");
			return;
		}
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;

		ssn = ssn.replace("-", "");

		if (ssn.length() == 13) {
			System.out.println(ssn);

		}
	}

	
	
	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public String getSsn() {
		return ssn;
	}
}
