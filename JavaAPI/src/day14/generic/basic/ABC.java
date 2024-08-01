package day14.generic.basic;

public class ABC<T> {
	
	
	//제네릭은 인터페이스, 클래스에 <타입>을 적는 문법
	
	// 미정인 T 타입
	private T t;
	
	public void setT(T t) {
		this.t = t;
	}
	
	public T getT() {
		return t;
	}
	
}
