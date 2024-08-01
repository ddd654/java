package quiz08.Static;

public class MyArrays {

	// Arrays.toString() 메서드 만들기

	// 1. MyArrays는 외부에서 객체로 생성할 수 없어야 한다
	// 2. 메서드 호출시, static을 이용해 사용
	// 2. int[] 이나 String[]이나 Char[]이 전달되도 동일하게 동작하게 오버로딩

	public static String toString(int[] arr) {

//		int[] arr1 = new int[3];
//
//		for (int i = 0; i <= arr1.length; i++) {
//			arr1[i] = 1 + i;
//
//		}
//
//		return arr1;

		String str = "[";
		for (int i = 0; i < arr.length; i++) {
			str += arr[i];
			if (i == arr.length - 1)
				break;
			str += ",";
		}
		str += "]";
		return str;
	}

	public static String toString1(int[] arr1) {

		return "";

	}

}
