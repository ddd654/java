package day12.Throw;

public class Throws {
	public static void main(String[] args) {

		// 예외 넘기는 키워드 throws

		// throws 붙은 메서드나 생성자는 예외처리 대신 진행해야함

		try {
			greeting(10);
		} catch (Exception e) {
			// TODO: handle exception

			System.out.println("예외처리 대신하기");
		}


		try {
			Class.forName("123");// <<예외처리하기
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	private static String[] arr = { "사과", "바나나", "키위" };

	public static void greeting(int i) throws Exception { // 예외 위로 보내기
		System.out.println(arr[i]);
	}

}
