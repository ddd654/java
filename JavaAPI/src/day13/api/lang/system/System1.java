package day13.api.lang.system;

import java.util.Properties;

public class System1 {
	public static void main(String[] args) {
//		System.exit(0); // 프로그램 종료
		System.out.println();

		// getProperties - 정보 가져오기
		Properties p = System.getProperties();
		System.out.println(p);

		long s = System.currentTimeMillis();

		String str = "";
		for (long i = 1; i <= 1000; i++) {
			str += "A";
		}

		long end = System.currentTimeMillis();
		
		System.out.println("소요시간" + (end - s) * 0.001);
	}
}
