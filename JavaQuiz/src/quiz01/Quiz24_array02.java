package quiz01;

public class Quiz24_array02 {
	public static void main(String[] args) {

		// 가장 큰 값 하나만 출력

		int[] arr = { 34, 65, 1, 23, 12, 53, 100, 23, 99 };

		int num1 = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (num1 < arr[i]) {
				num1 = arr[i];
			} 

		}

		System.out.println(num1);

	}
}
