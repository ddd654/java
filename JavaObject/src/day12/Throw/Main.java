package day12.Throw;

public class Main {
	public static void main(String[] args){
		
		try {
			new Throw02();
		} catch (Exception e) {
			System.out.println("예외처리 완료!");
		}
		
		System.out.println("종료");
		
	}
}
