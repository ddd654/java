package day04;

public class MultiForEx03 {

	public static void main(String[] args) {
		
		//바깥에 반복횟수에 따라서 다르게 회전하는 반복문
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.println(i + "-" + j);
//			}
//		}
		
		/*
		*
		**
		***
		****
		*****
		*/
		int star = 5;
		for(int i = 1; i <= star; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(); //줄바꿈
		}
		
		System.out.println("---------------------------------");
		
		/*
		***** 1행 5번
		****  2행 4번
		***   3행 3번
		**    4행 2번
		*	  5행 1번
		*/

//		for(int i = 1; i <= star; i++) { //행
//			for(int j = 1; j <= star+1-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println(); //줄바꿈
//		}
		
		for(int i = 1; i <= star; i++) { //행
			
			for(int j = star+1-i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------");
		/*
		별을 찍기전에 공백을 출력.
		바깥반복문 - 행
		내부반복문 - 출력
		    *
		   **
		  ***
		 ****
		*****
		*/
		for(int i = 1; i <= star; i++) {
			 
			for(int j = 1; j <= star-i; j++ ) { //공백출력하는 for
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++) { //별을 출력하는 for
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		
		System.out.println("-------------------------------");
		/*
		    *
		   ***
		  *****
		 *******
		*********
		*/
		
		for(int i = 1; i <= star; i++) {
			
			for(int j = 1; j <= star - i; j++) { //공백찍음 4,3,2,1,0..
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i*2-1; j++) { //별 찍음 1,3,5,7,9 - i값에 따라서~
				System.out.print("*");
			}
			
			System.out.println(); //줄바꿈
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
