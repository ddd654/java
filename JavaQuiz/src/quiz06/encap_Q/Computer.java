package quiz06.encap_Q;

import day09.encap.Object.Chef;

public class Computer {

	// 1. 키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요

	// 2.기본생성자를 생성하고, 변수를 클래스로 초기화 하세요

	// 3.KeyBoard, Mouse, Monitor를 전달받는 생성자를 생성하세요.

	// 4.키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요

	// 5.키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요

	// 6.메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요

	private KeyBoard key;
	private Monitor mon;
	private Mouse mou;

	// 기본생성자
	public Computer() {
		this.key = new KeyBoard();
		this.mon = new Monitor();
		this.mou = new Mouse();
	}

	// 전달받는 생성자
	public Computer(KeyBoard key, Mouse mou, Monitor mon) {
		this.key = key;
		this.mon = mon;
		this.mou = mou;
	}

	// setter/ getter
	public KeyBoard getKey() {
		return key;
	}

	public void setKey(KeyBoard key) {
		this.key = key;
	}

	public Monitor getMon() {
		return mon;
	}

	public void setMon(Monitor mon) {
		this.mon = mon;
	}

	public Mouse getMou() {
		return mou;
	}

	public void setMou(Mouse mou) {
		this.mou = mou;
	}

	// 컴퓨터 인포
	void computerinfo() {
		key.info();
		mon.info();
		mou.info();
	}

}
