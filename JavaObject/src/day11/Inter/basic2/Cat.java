package day11.Inter.basic2;

public class Cat extends Animal implements IPet {
	public void eating() {
		System.out.println("고양이 생선");
	}

	@Override
	public void playing() {
		System.out.println("고양이 야옹 오버라이딩");
	}
}
