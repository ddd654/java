package _study_java;

class Calculator3 {

	public static void sum(int left, int right) {
		System.out.println(left + right);
	}
	public static void avg(int left, int right) {
		System.out.println((left + right) / 2);

	}
	
	
}

public class CalculatorDemo3{
	
	public static void main(String[] args) {
		Calculator3 c1 = new Calculator3();
		Calculator3.sum(1, 2);
		Calculator3.avg(11, 22);
		c1.sum(2, 5);
	}

	
	
}