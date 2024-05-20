package quiz03;

public class Computer extends Calculator {

	double circle(int r) {
		double result = Math.PI * r * r;
		return result;
	}

	double rect(double a) {
		double result = a * a;
		return result;
	}

	double rect(double a, double b) {
		double result = a * b;
		return result;
	}
	
	double rect(double a, double b, double c) {
		double result = a * b* c;
		return result;
	}


}
