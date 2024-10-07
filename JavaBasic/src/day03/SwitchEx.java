package day03;

public class SwitchEx {

	public static void main(String[] args) {
		
		int a = 10;
		
		//switch에 들어가는 값은 정수 or 문자 or 문자열 입니다
		switch(a) { //변수
		
		case 0:
		case 1:
			System.out.println("1입니다");
			break; //switch문을 탈출함
		case 2:
			System.out.println("2입니다");
			break;
		case 3:
			System.out.println("3입니다");
			break;
		case 4:
			System.out.println("4입니다");
			break;
			
		default :
			System.out.println("1,2,3,4가 아닙니다"); //else
		}
		
		
		
	}
}
