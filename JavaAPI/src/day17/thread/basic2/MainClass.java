package day17.thread.basic2;

public class MainClass {
	public static void main(String[] args) {
		MyThread m1 = new MyThread();
		m1.setName("쓰레드A");
		m1.start();
		
		MyThread m2 = new MyThread();
		m2.setName("쓰레드B");
		m2.start();
		
		System.out.println("main thread 종료");
		
	}
}
