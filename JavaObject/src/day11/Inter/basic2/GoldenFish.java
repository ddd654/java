package day11.Inter.basic2;

public class GoldenFish extends Fish implements IPet {
	public void swiming() {
		System.out.println("금붕어 해엄중");
	}

	@Override
	public void playing() {
		System.out.println("금붕어");
	}
}
