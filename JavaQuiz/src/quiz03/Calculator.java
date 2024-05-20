package quiz03;

public class Calculator {

	int result = 0;
	double pi = 3.14;

	int add(int a) {
		result += a;
		return result;

	}

	double circle(int r) {
		double result = pi * r * r;
		return result;
	}

}
