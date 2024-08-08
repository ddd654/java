package quiz09.Abstract;

// Unit 클래스 상속
public class Marine extends Unit {

	// 멤버 변수는 Unit 클래스에서 상속받아 사용되므로 삭제
	// int x = 0;
	// int y = 0;
	// int hp = 60;

	// static 변수는 Marine 클래스의 모든 인스턴스에서 공통적으로 사용
	public static int attack = 6;
	public static int armor = 0;

	// Marine 클래스의 생성자
	public Marine(int x, int y, int hp) {
		super(x, y, hp); // Unit 클래스의 생성자를 호출
	}

	@Override
	public void getInfo() {

	}

	// 위치 출력 메서드
	@Override
	public void location() {
		System.out.println("현재 위치: " /*+ setX() + ", " + getY()*/);
	}

	@Override
	public void move() {

	}

	/*// 이동 메서드
	@Override
	public void move(int x, int y) {
//		setX(x);
//		setY(y);
	}*/

	// 정지 메서드
	@Override
	public void stop() {
		System.out.println("정지");
	}
}
