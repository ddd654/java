package day06;

public class Break03 {
	public static void main(String[] args) {

		// 중첩 반복에서 break
		// 탈출을 위한 변수를 활용,

//		boolean bool = false;
//		
//		for (char c = 'A'; c <= 'Z'; c++) {
//			
//			for (char l = 'a'; l <= 'z'; l++) {
//				System.out.println(c + "-" + l);
//				
//				if(l == 'e') {
//					bool = true; // if문을 실행했음을 나타냄
//					break;
//				}
//				
//			}
//			
//			if(bool) { // true 였으면 완전 탈출
//				break;
//			}
//			
//		}

		//이름 붙이기
		//바깥 반복문에 이름 붙여서, 안쪽 반복문에도 이름 붙여 탈출 ex11
		
		ex11:for (char c = 'A'; c <= 'Z'; c++) {

			for (char l = 'a'; l <= 'z'; l++) {
				System.out.println(c + "-" + l);
				
				if(l == 'e') {
					break ex11;
				}
			}
		}

	}
}
