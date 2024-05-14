package day06;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {

		// 배열문법
		// 배열의 시작 0
		
		//벼열 선언
		int[] arr; 
		
		// 배열 생성
		arr = new int[5];
		
		//초기화
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
				
		System.out.println(arr); //배열의 주소값
		System.out.println(Arrays.toString(arr));
		
		//배열의 길이
		System.out.println("배열의 길이:" + arr.length);
		
		
		//배열을 선언하는 다양한 방법들
		int[] arr1 = new int[5]; //초기화가 안된 배열, n 사이즈의 배열
		int[] arr2 = {1, 2, 3, 4, 5, 6};
		int[] arr3 = new int[] {1, 2, 3, 4, 5};
		
		//new는 무엇인가
		
		System.out.println(Arrays.toString(arr1));
		
		
		
	}
}
