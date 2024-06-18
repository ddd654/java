package _study;

public class Quiz_cloth_discount {
	public static void main(String[] args) {

		System.out.println(solution(580000));
	}

	public static int solution(int price) {

		// 100000이상 - 0.05 * 100000
		// 300000이상 - 0.1 * 300000
		// 500000이상 - 0.2 * 500000

//		if (price >= 500000) { // 분기는 큰것부터
//			answer = (int) (price * (1 - 0.2));
//		} else if (price >= 300000) {
//			answer = (int) (price * (1 - 0.1));
//		} else if (price >= 100000) {
//			answer = (int) (price * (1 - 0.05));
//		} else {
//			answer = price;
//		}
		
		if(price >= 500000)
			return (int)(price * 0.8);
		if(price >=300000)
			return (int)(price * 0.9);
		if(price >= 100000){
			return (int)(price * 0.95);
		}

		return price;
	}
}
