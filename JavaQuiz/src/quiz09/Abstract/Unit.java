package quiz09.Abstract;

public abstract class Unit {

	// private은 getter setter 필요
	public int x = 0;
	public int y = 0;
	public int hp = 60;

	// unit의 hp를 받아서
	public Unit(int x, int y, int hp) {
		this.x = x;
		this.y = y;
		this.hp = hp;
	}

	public abstract void getInfo();

	public abstract void location();

	public abstract void move();

	public void stop() {
		System.out.println();
	}

}
