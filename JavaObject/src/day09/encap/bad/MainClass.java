package day09.encap.bad;

public class MainClass {
	public static void main(String[] args) {
		
		MyDate ma = new MyDate();
		ma.day = 30;
		ma.month = 12;
		ma.year = 2024;
		ma.ssn = "무엇일까";
		
		String ssn = ma.ssn;
		
		ma.info();
		
		//은닉이 없으면 잘못된 값이 저장될 수 있음
		//또한 누구나 가져갈 수도 있음
	}
}
