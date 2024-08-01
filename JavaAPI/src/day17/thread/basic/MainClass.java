package day17.thread.basic;

public class MainClass {
	public static void main(String[] args) {
		
		//객체 1개에다가, 쓰레드 2개로 동시에
		// 하나의 객체를 양쪽 쓰레드에서 서로 침범
		MyThread m1 = new MyThread();
		
		Thread thread1 = new Thread(m1, "쓰레드A");
		Thread thread2 = new Thread(m1, "쓰레드B");
		
		thread1.start();
		thread2.start();
		
		
		System.out.println("쓰레드 종료");
	}
}
