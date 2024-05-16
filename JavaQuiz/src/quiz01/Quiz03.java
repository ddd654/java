package quiz01;

public class Quiz03 {

	public static void main(String[] args) {
		
		int bucket = 10; //바구니 크기
		int apple = (int)(Math.random() * 150) + 1; //사과의 개수 1~150개
		
		//사과의 개수가 정해질 때, 3항 연산식을 이용해서 필요한 바구니의 개수를 구하세요.
		System.out.println(apple);
		
		//사과가 73개 나오면 바구니는 8개 필요함
		//사과가 70개 나오면 바구니는 7개 필요함
		
		int cnt = apple % bucket == 0 ? apple / bucket  :  apple / bucket + 1;
		System.out.println("바구니의 개수:" + cnt);
		
		
		
		
	}
}
