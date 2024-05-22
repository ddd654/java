package day10.designPattern;

public class Singleton {

	// singleton 패턴 - 객체가 단 1개만 생성하도록 클래스를 구성해주는 패턴

	// 1. 외부에서 직접 객체를 생성할 수 없도록,
	// 생성자를 1개로 제한

	private Singleton() {
		
	}

	// 2. 멤버변수로 스스로 객체를 1개 만든다
	// static 붙으면 단 1개가 됨
	
	private static Singleton instance = new Singleton();
	
	//3. 클래스 외부에서, 객체를 요구할 때 
	// getter메서드로 1개의 객체를 반환
	public static Singleton getInstance() {
		return instance;
	}
	
	////////
	private String name = "사과";
	
	public String getName() {
		return name;
	}
	
	
	
}
