package day12.exception.Throw;

public class Throw {
	public static void main(String[] args) {

		try {
			System.out.println(sum(16));
			System.out.println(sum(-5));

		} catch (Exception e) {
			System.out.println("예외처리, 양수로 주세요");
			
			
			System.out.println(e.getMessage());
			// 예외의 내용과 위치 찍기, 예외 원인 찾기용, 필수
			e.printStackTrace();
		}
		
		System.out.println("종료");
	}

	public static int sum(int a) throws Exception {

		// 음수가 오면
		if (a < 0) {
			// 예외 생성문
			// 예외 처리할 try나 throw를 사용해 진행
			throw new Exception();
		}

		int sum = 0;
		for (int i = 0; i < a; i++) {
			sum += i;
		}
		return sum;
	}
}
