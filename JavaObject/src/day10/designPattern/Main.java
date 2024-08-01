package day10.designPattern;

public class Main {
	public static void main(String[] args) {

		// 객체 생성할때 3번의 getInstance()를 호출
		Singleton s = Singleton.getInstance(); // 객체 생성 방법
		Singleton s2 = Singleton.getInstance();
		
		//s와 s2는 같다

		//
		
		String name = s.getName();
		String name2 = s2.getName();
		
		System.out.println(name);
		System.out.println(name2);
		
	}
}
