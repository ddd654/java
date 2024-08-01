package day12.Throw;

public class Throw02 {

	// 생성자
	public Throw02() throws Exception { //넘기기
		System.out.println("생성자 호출");
		aaa();

		System.out.println("종료");

	}

	// 메서드
	void aaa() throws Exception { // 다시넘기기
		System.out.println("aaa호출");
		bbb();
		System.out.println("aaa종료");

	}

	void bbb() throws Exception { //예외 위로 넘기기
		System.out.println("bbb호출");
		System.out.println(10 / 0);

//		try {
//			System.out.println(10 /0);
//		} catch (Exception e) {
//			System.out.println("예외처리완료");
//		}

		System.out.println("bbb종료");
	}
}
