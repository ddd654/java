package _study_java;

import quiz03.Calculator;

class Calculator1 {

	static double PI = 3.14;
	int left, right;
	static int base = 0;

	public void setOp(int left, int right) {
		this.left = left;
		this.right = right;

	}

	public void sum() {
		System.out.println(this.left + this.right + base);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}

}

public class CalculatorDemo4 {
	public static void main(String[] args) {
		Calculator1 c1 = new Calculator1();
		System.out.println(c1.PI);

		Calculator1 c2 = new Calculator1();
		System.out.println(c2.PI);
		System.out.println(Calculator1.PI);

	}

}
