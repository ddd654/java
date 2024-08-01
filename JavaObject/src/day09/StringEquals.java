package day09;

public class StringEquals {
	public static void main(String[] args) {

		String str1 = "사과";
		String str2 = "사과";
		//생성자 넣기
		String str3 = new String("사과");

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		// 동일한 문자를 동일 클래스에서 선언하면, 동일한 주소를 바라본다
		System.out.println(str1 == str2); // 주소값 비교
		// 다른 클래스에서 넘어오거나, 직접 문자열을 생성하면 다른 주소다
		System.out.println(str1 == str3); // 주소값 비교

		//str1과 str3의 문자가 같게 써야 비교가능함 - equals로 비교해야 함
		if(str1.equals(str3)) {
			System.out.println(str3);
		}
	}
}
