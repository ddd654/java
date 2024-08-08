package quiz09.Abstract;

public class Main {
	public static void main(String[] args) {

//		Circle c = new Circle();
		
		Shape s = new Circle("원형", 2);
		Shape r = new Rect("사각형", 4);
		
		
		System.out.println(s.getArea());
		System.out.println(r.getArea());
		
	
		
		Marine m = new Marine(0, 0, 0);
		Tank t = new Tank();
		DropShip d = new DropShip() {
			@Override
			public void location() {

			}

			@Override
			public void move(int x, int y) {

			}

			@Override
			public void stop() {

			}
		};
		
		m.location();
		
		
		
	}
}
