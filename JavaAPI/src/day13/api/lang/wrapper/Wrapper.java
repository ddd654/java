package day13.api.lang.wrapper;

public class Wrapper {
	public static void main(String[] args) {
		
		//wrapper 
		
		int a = 100;
		double b= 2.32;
		char c = 'a';
		boolean d = false;
		
		//boxing
		//기본타입에서 객체타입으로 변환하는 작업

		Integer val1 = new Integer();
		Double val2 = new Double();
		Charactor val3 = new Charactor();
		Boolean val4 = new Boolean();
		
		Object[] arr = {val1, val2, val3};
		
		//unboxing
		// 객체타입에서 기본타입으로 변경
		a = val1.intValue();
		b = val2.doubleValue();
		
		
		//auto boxing
		Integer x =100;
		Double y = 3.14;
		
		int v1 = x; //자동 형변환 해서 바로 넣기
		double v2 = y;
		
		Object[] arr2 = {1,2,2.321};
		
		//-------------
		
		//중요한 래퍼클래스 기능
		// 문자열에서 기본타입으로 변환하기
		int A = Integer.parseInt("123");
		double D = Double.parseDouble("2.34");
		long L = Long.parseLong("122");
		
		System.out.println(A +D);
		
		
		
		
		
		
		
		
		
		
	}
}
