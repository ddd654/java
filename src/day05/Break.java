package day05;

public class Break {
	public static void main(String[] args) {
		
		//무한 반복문
		//반복문의 횟수를 모를때 사용, while(true) 문장을 많이사용
		
		int i = 1;
		while(true) {
			
			if(i==15) {
				break;
			}
			
			System.out.println(i);
			
			i++;
		}
		
	}
}
