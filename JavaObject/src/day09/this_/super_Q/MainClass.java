package day09.this_.super_Q;

public class MainClass {
	public static void main(String[] args) {

		SuperSonicAp air = new SuperSonicAp("str");
		
		air.takeOff();
		air.flymode = 1;
		air.fly(); //오버라이딩 먼저 실행
		air.land();
	}
}
