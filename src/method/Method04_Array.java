package method;

import java.util.Arrays;

public class Method04_Array {
	public static void main(String[] args) {

		// 배열도 메서드의 매개변수나 반환으로 사용가능
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		method01(arr); // 배열은 변수명을 넣는다 {}x
		System.out.println();

		int[] result = method02();
		System.out.println(Arrays.toString(result));
		
		System.out.println("-------------");
		int a= 1;
		int[] ar = {1,2,3};
		method03(a, ar);

		System.out.println("a:" + a);
		//배열의 값은 바뀔 수 있다.
		System.out.println("ar:" + Arrays.toString(ar)); 

	}

	// 메서드로 배열을 받는 메서드
	static void method01(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ">>");
		}

	}

	// 반환으로 배열을 리턴하는 메서드
	static int[] method02() {

		int[] arr = { 1, 2, 3 };

		return arr;
	}
	
	//배열을 전달할때
	static void method03(int a, int[] arr){
		
		a = 10;
		arr[0] = 10;
		
		
	}
	

}
