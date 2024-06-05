package day16.AnonymousObject;

public class MainClass {

	public static void main(String[] args) {

//		Car car1 = new Tico(); // 오버라이딩된 메서드 실행
//		car1.run();

		// 매번 Car를 구현한 클래스가 달라져야한다면
		//
//		Car car2 = new Car();
		
		Car car2 = new Car() {

			@Override
			public void run() {
				System.out.println("뉴카");
			}
		};
		car2.run();
		
		Car car3 = new Car() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			
		};
		car3.run();
		// 이렇게 써도 되지만 가독성이 안좋을 수 있다
		
		
		
		//
		//tv 객체 만들기
		Tv tv = new Tv();
		
//		RemoteControl r = tv.remote;
		
		tv.remote.turnOn();
		tv.remote.volumeUp();
		
		

	}
}
