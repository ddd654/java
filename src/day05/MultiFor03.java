package day05;

public class MultiFor03 {
	public static void main(String[] args) {

		// 바깥에 반복횟수에 따라 다르게 회전하는 반복문

//		for (int i = 1; i <= 5; i++) {
//
//			for (int j = 1; j <= i; j++) {
//				System.out.println(i + " - " + j);
//			}
//		}

		// 삼각형 모양
		int star = 5;
		for (int i = 1; i <= star; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}

		System.out.println("-------------------");

		// 감소되는 삼각형 모양

//		for (int i = 1; i <= star; i++) {
//
//			for (int j = 1; j <= star +1 - i; j++) {
//				System.out.print("*");
//			}
//			System.out.println(); // 줄바꿈
//
//		}

		for (int i = 1; i <= star; i++) {

			for (int j = star + 1 - i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈

		}

		System.out.println("------------------------");

		// 왼쪽삼각형

//		for (int i = 1; 1 <= star; i++) {
//			for (int j = 1; j <= star - i; j++) {
//				System.out.println(" ");
//			}
//
//			for (int j = 1; j <= i; j++) {
//				System.out.println();
//			}
//
//		}

//		/*
//		 * 
//		 *     *
//		 *    ***
//		 *   *****
//		 *  *******
//		 * *********
//		 * 
//		 */

		for (int i = 1; i <= star; i++) {

			for (int j = 1; j <= star - i; j++) { // 공백 4,3,2,1...
				System.out.print(" ");
			}

			for (int j = 1; j <= i * 2 - 1; j++) { // 별 1, 3, 5, 7...
				System.out.print("*");

			}
			System.out.println(); // 줄바꿈
		}

	}
}
