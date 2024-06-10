package day17.thread.basic2;

//thread 상속받음
public class MyThread extends Thread {

	private int num;

	@Override
	public void run() {
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
