package day06;

public class Continue {
	public static void main(String[] args) {

//		for (int i = 1; i <= 10; i++) {
//
//			if (i % 2 ==0) {
//				continue; //반복문의 다음으로 간다
//			}
//
//			System.out.println(i);
//		}
//		

		System.out.println("-----------------------");

		// continue도 이름붙이기 됨

		int i = 1;
		while (i <= 10) {

			if (i == 5) {
				i++;
				continue;
			}

			System.out.println(i);
			i++;
		}

	}
}
