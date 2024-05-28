package day11.Abstract.good;

public class SeoulStore extends Store {

	// 필요한 메서드
	// 어노테이션 - 특정 기능이나 명명할때 사용함
	@Override // 지금은 오버라이딩 됐다는 뜻
	public void melon() {
		System.out.println("서울 멜론 400원");
	}

	@Override
	public void apple() {
		System.out.println("서울 사과 500원");
	}

	@Override
	public void orange() {
		System.out.println("오렌지 100원");
	}

}
