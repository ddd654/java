package day12.exception.tryCatch;

public class RunTimeExample {
	public static void main(String[] args) {
		
		//실행예외
		//nullpointer
		
		String name = null;
		name.charAt(0);
		
		
		//classCast 예외
		String s = (String)new Object();
		
		
		//ArrayIndexBound 배열의 범위 잘못참조
		
		//NumberFormat 에러
		int a = Integer.parseInt("가과");
		System.out.println(a+1);
	}
}
