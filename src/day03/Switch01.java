package day03;

public class Switch01 {
	public static void main(String[] args) {

		int a = 1;

		// switch에 들어가는 값은 정수, 문자, 문자열입니다.
		switch (a) {
		case 1:
			System.out.println("1입니다");
		case 2:
			System.out.println("2입니다");
			break;
		case 3:
			System.out.println("3입니다");
		default:
			System.out.println("default");

		}
	}
}
