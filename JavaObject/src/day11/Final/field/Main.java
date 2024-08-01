package day11.Final.field;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person("123", "키위");
		System.out.println(p1.nation);
		
		Person p2 = new Person("123", "키위");
		System.out.println(p2.ssn);
		
		
		//상수의 사용
		System.out.println(Constant.EARTH_TADIUS);
		System.out.println(Constant.PI);
		
		//상수 값
		System.out.println(Math.PI);
		System.out.println(Integer.MAX_VALUE);
	}
}
