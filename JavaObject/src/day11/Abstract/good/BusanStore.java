package day11.Abstract.good;

public class BusanStore extends Store{

	@Override
	public void melon() {
		System.out.println("부산 멜론 100원");
	}

	@Override
	public void apple() {
		System.out.println("부산 사과 200원");
		
	}

	@Override
	public void orange() {
		System.out.println("부산 오렌지 400원");
		
	}

}
