package quiz09.Abstract;

public abstract class DropShip {

	int x = 0;
	int y = 0;
	int hp = 60;

	// 추상 메서드
	// 위치를 반환하는 메서드 (구현은 자식 클래스에서)
	public abstract void location();

	// 이동 메서드 (구현은 자식 클래스에서)
	public abstract void move(int x, int y);

	// 정지 메서드 (구현은 자식 클래스에서)
	public abstract void stop();
}
