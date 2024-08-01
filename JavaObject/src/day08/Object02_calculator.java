package day08;

public class Object02_calculator {
	public static void main(String[] args) {
		
		System.out.println("1번 계산기");
		
		Calculator call = new Calculator();
		
		System.out.println(call.add(1));
		System.out.println(call.add(2));
		System.out.println(call.add(3));
		
		
		System.out.println("2번 계산기---");
		Calculator cal2 = new Calculator();
		
		System.out.println(cal2.add(1));
		System.out.println(cal2.add(2));
		
	}
}
