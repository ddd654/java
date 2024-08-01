package day09.encap.bad;

public class MyDate {

	// 클래스의 멤버변수의 접근제한자를 private로 설정
	// setter getter

	// 은닉이 없을때
	public int year;
	public int month;
	public int day;
	public String ssn; // 주민 번호

	public void info() {
		System.out.println("생년월일:" + year + "-" + month + "-" + day);
		System.out.println("주민번호:" + ssn);
	}

}
