package day12.exception.tryCatch;

public class Trycatch03 {
	public static void main(String[] args) {

		// main메서드에 실행시 매개 값을 주는방법
		// run에서 run config >>arguments
		// ${string_prompt}

		
		try {
			String a = args[0];
			String b = args[1];
			// 문자열을 숫자로
			int x = Integer.parseInt(a);
			int y = Integer.parseInt(b);

			System.out.println("두 수의 합:"+x + y);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
		
			//예외
			String str = "123";
			str.charAt(0);
			
		} catch (NumberFormatException e) {
			System.out.println("ww");
		}

		
		

	}
}
