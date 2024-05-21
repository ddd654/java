package day09.overloading.basic;

public class overloading {
	public static void main(String[] args) {
		
		Basic b = new Basic();
		
		b.input(10);
		b.input("사과");
		b.input(1, 3.14);
		b.input(3.14, 1);
		
		System.out.println(b);
		
	}
}
