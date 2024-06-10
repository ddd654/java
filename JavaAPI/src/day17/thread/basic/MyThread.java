package day17.thread.basic;

public class MyThread implements Runnable {

	private int num;

	@Override
	public synchronized void run() { // 싱크로하면 침범못하게
		// TODO Auto-generated method stub

		for (int i = 1; i <= 10; i++) {
			num++;

			System.out.println(Thread.currentThread().getName() + ": " + num);
			// 현제 쓰레드 이름

			try {
				if (Thread.currentThread().getName().equals("쓰레드")) {
					Thread.sleep(1000);
				} else {
					Thread.sleep(500);
				}
				Thread.sleep(1000); // 1초 간격 멈춤
			} catch (Exception e) {
				e.printStackTrace();

			}
		}
	}

}
