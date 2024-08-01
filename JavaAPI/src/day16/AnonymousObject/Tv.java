package day16.AnonymousObject;

public class Tv {

	private int volume;
	public RemoteControl remote;

	// 익명객체
	public Tv() {
		remote = new RemoteControl() {

			// 안에서 바깥을 참조할 수 있음

			@Override
			public void volumeUp() {
				// TODO Auto-generated method stub
				volume++;
			}

			@Override
			public void volumedown() {
				// TODO Auto-generated method stub
				volume--;

			}

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("TV를 켭니다");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("TV를 켭니다");

			}
		};

	}
}
