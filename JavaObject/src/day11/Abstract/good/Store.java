package day11.Abstract.good;

public abstract class Store {
	// abstract가 클래스 앞에 붙어야 오류 안남

	// 추상 메서드는 abstract를 붙이고, 오버라이딩 되어야함
	// 얘는 {} 중괄호가 없는 메서드

	private String name = "호식이치킨";

	public void setName(String name) {
		this.name = name;
	}

	// 메서드 선언
	public abstract void melon();

	public abstract void apple();

	public abstract void orange();

	// 추상 클래스는 객체로 생성할 수 없음

	public final void mango() {
		System.out.println("망고");
	}


	//메서드
	public String getName() {
		System.out.println("이름");
		return name;
	}
}
