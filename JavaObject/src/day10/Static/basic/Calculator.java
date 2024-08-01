package day10.Static.basic;

public class Calculator {

	// static 멤버는 언제쓸까
	
	//계산기마다 다른값을 가져야해서 일반멤버변수가 된다
	// 원주율은 동일하기에, static 선언이 좋다
	private String color;
	private int result;
	public static double pi = 3.14;
	
	//1번만 실행됨
	static {
		pi = 3.15;
		System.out.println("StaticBlock");
	}
	
	
	//
	public void setColor(String color) {
		this.color = color; //this. << static에서 못씀
	
	}
	
	public String getColor() {
		return color;
	}
	
	//멤버변수를 쓰지않고 사용할 메서드는 static 붙이면 좋다
	public double circle(int c) {
		return pi * r*r;
	}
	
}
