package day04;

import java.util.Arrays;

public class WhileEx03 {

	public static void main(String[] args) {
		
		//배열의 반복.
//		int[] arr = {1,2,3,4,5,6,7,8,9 };
//		
//		int i = 0; //
//		int sum = 0;
//		while(i < arr.length ) {
//			//System.out.println(arr[i]);
//			sum += arr[i];
//			i++;
//		}
//		
//		System.out.println("배열 요소의 합:" + sum);
		
		//배열에 순서대로 값을 저장
		int[] arr = new int[10]; //길이가 10인 배열
		
		int j = 0;
		while( j < arr.length ) {
			
			arr[j] = j+1;
			
			j++;
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
	}
}
