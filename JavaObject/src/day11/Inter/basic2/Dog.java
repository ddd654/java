package day11.Inter.basic2;

public class Dog extends Animal implements IPet {
	public void eating() {
		System.out.println("강아지 왈");
	}

	@Override
	public void playing() {

		System.out.println("강아지 오버라이딩");
	}
}
