package day09.inherit1;

public class DmbPhone extends Phone {
	// DmbPhone은 Phone클래스를 상속 받습니다.
	// channel 변수를 생성하고, color, model, channel을
	// 초기화 하는 생성자를 작성하세요.
	// 메인메서드가 정상적으로 실행되도록 메서드를 추가하세요.

	int channel;

//	String constructor() {
//		String color = 
//		
//		
//	}

	//초기화하는 생성자
	DmbPhone(String pColor, String pModel, int ch) {
		color = pColor;
		model = pModel;
		channel = ch;
	}

	//메서드 추가
	void turnOnDmb() {
		System.out.println("tv on");
	}

	void turnOffDmb() {
		System.out.println("tv off");
	}

	int changeChannel(int ch) {
		channel = ch;
		System.out.println(ch);

		return channel;
	}

}
