package day06;

import java.util.Arrays;

public class ArraySwap {
	public static void main(String[] args) {

		// 자리바꾸기

//		int x = 5;
//		int y = 10;
//		int temp = 0;
//
//		temp = x;
//		x = y;
//		y = temp;
//
//		System.out.println(x + " " + y);
		
		//랜덤한 두 수를 이용해 자리 바꾸기
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int a = (int)(Math.random() * 10);
		int b = (int)(Math.random() * 10);
		
		
		System.out.println(a+ "-" +b);
		
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}
}
