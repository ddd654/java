package day06;

public class Array02 {
	public static void main(String[] args) {

		// 배열의 순회
		int[] arr = { 24, 23, 55, 22, 77, 86 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println("인덱스:" + i + ", 값:" + arr[i]);

		}

		for (int a : arr) {
			System.out.println("값:" + a);
			;
		}
		
		System.out.println("-------------");
		
		//배열을 거꾸로 순회
		
		for(int i = arr.length -1; i >= 0; i--) {
			System.out.println("인덱스:" + i + ", 값:" + arr[3]);
		}
		
		System.out.println("--------------");
		
		//배열 요소들의 합
		int sum = 0;
		for(int i =0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("합계:" +sum);

	}
}
