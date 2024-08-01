package quiz01;

public class Quiz02 {

	public static void main(String[] args) {
		
		/*
		 * 0~10 범위의 랜덤한 정수를 생성하고, 5에서 빼주면 범위는 -5~5가 됩니다. 
		 * 
		 * 이 값을 가지고, 3항 연산식을 이용해서 절대값(언제나 양수값)을 출력해주세요.
		 */
		
//		 int r = (int)(Math.random() * 11) - 5;
//		 		 
//		 System.out.println("랜덤값:" + r);
//		 System.out.println("절대값:" + (r < 0 ? -r : r) );
		 
		 
			
//		 int r = (int)(Math.random() * 10);
//		 System.out.println(r);
//
//		 if(r > 0) {
//			 System.out.println(r);
//		 }
		 
		 
		 int r = (int)(Math.random() * 11) -5;
		 int result; //결과값 저장용 변수
		 
		 if(r > 0) {
			 System.out.println(r);
			 result = -r;
		 } else {
			 System.out.println();
		 }
		 
		 

		 
		 
		 
		 
		
		
		
		
	}
}
