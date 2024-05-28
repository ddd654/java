package day11.Inter.basic;

public class Main {
	public static void main(String[] args) {
		
//		Inter1 inter = new inter1();
		
		Basic b = new Basic();
		b.method01();
		
		Inter1 i1 = new Basic();
		i1.method01();
		
		Basic bb = (Basic)i1;
	}
}
