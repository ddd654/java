package quiz09.Abstract;

public class Tank {
	
	int x = 0;
	int y = 0;
	int hp = 100;
	
	public boolean modeflag = false;

	public void location() {
		System.out.println("현재위치" + x + ", " + y);
	}

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void stop() {
		System.out.println("stop");
	}

	void changeMode() {
		modeflag = modeflag ? false : true;
	}
}
