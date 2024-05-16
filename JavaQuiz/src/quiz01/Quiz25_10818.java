package quiz01;

import java.util.Scanner;

public class Quiz25_10818 {
	public static void main(String[] args) {

		// 백준 10818

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] arr = new int[n];

		int i =0;
		while (i < arr.length) {
			arr[i] = scan.nextInt();
			i++;
		}

		int max = arr[0];
		int min = arr[0];
		
		int j =0;
		while(j <arr.length) {
			
			if(arr[j] > max) {
				max =arr[j]; //최대값
			}
			
			if(arr[j] < min) {
				min = arr[j]; //최소값
			}
			
			j++;
			
		}
		
		System.out.println(min + " " + max);
		
		
		
		

//		for(int i = 0; i < arr.length; i++) {
//			
//			
//			if(num1 < arr[i]) {
//				num1 = arr[i];
//			}
//			
//		}

	}
}
