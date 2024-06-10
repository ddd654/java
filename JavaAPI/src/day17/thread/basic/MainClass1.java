package day17.thread.basic;

public class MainClass1 {
	public static void main(String[] args) {
		
		
		// Thread
		// 프로그램 실행을 나눅고
		// 동시에 여러작업 하게
		
		// 객체 n개, 쓰레드를 n개로 동작 = 따로따로
		// runnable 인터페이스를 상속받는 경우는, 쓰레드 객체를 생성해서 동작
		
		MyThread m1 = new MyThread();
		MyThread m2 = new MyThread();
		
		Thread thread1 = new Thread(m1, "쓰레드A"); // 매개변수안에 람다식 넣을수도 있음
		Thread thread2 = new Thread(m2, "쓰레드B"); // 매개변수안에 람다식 넣을수도 있음

		thread1.start();
		thread2.start();
		
		System.out.println("main Thread 출력");
		
		
		
		
	}
}
