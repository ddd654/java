package day08;

public class PhoneMain {
	public static void main(String[] args) {

		Phone red = new Phone(); // new 생성자()

		red.info();

		Phone black = new Phone("검정");
		black.info();

		Phone white = new Phone("흰색", 100000);
		white.info();

		

		// (색상, 가격, 모델)을 받는 생성자를 만들고
		// 객체로 생성
		Phone red = new Phone("빨강", 100, "갤럭시");
		red.info();
		
		
	}
}
