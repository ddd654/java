package day05;

public class MultiFor {
	public static void main(String[] args) {

		// 반복 중첩

//		for (int i = 1; i <= 10; i++) {
//			for (int j = i; j <= 9; j++) {
//				System.out.println(i + " - " + j);
//			}
//		}

		// 모든 구구단

		for (int i = 2; i <= 9; i++) {
			
			
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + "=" + i * j);

			}
			
			System.out.println("-------------");
			
		}

		
	}

}
