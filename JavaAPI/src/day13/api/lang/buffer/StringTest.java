package day13.api.lang.buffer;

public class StringTest {
	public static void main(String[] args) {

		// 문자열, 빠른 문자열 속도 비교

		long start = System.currentTimeMillis();

//		//일반 문자열 더하기
//		String s= "";
//		for(int i = 1; i <= 100000; i++) {
//			s += "A";
//		}

		// stringbuffer

		StringBuffer s = new StringBuffer();

		for (int i = 1; i <= 100000; i++) {
			s.append("a");
		}

		long end = System.currentTimeMillis();

		System.out.println("소요시간: " + (end - start) * 0.001);

	}
}
