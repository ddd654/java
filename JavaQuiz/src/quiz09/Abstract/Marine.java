package quiz09.Abstract;

public class Marine extends Unit {

	int x = 0;
	int y = 0;
//	int hp = 60;
	
	public static int attack = 6;
	public static int armor = 0;

	public Marine(int x, int y, int hp) {
		super(x, y, 60);
		
	}

	


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

}
