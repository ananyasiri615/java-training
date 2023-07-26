package day_six_java;

public class SynchronizedTask implements Runnable {
	public synchronized void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " : Value of i = " + i);
		}

	}

	public static void main(String[] args) {

		// Create a runnable task which all threads will share
		SynchronizedTask rt = new SynchronizedTask();
		Thread t1 = new Thread(rt, "thread-a");
		Thread t2 = new Thread(rt, "thread-b");
		Thread t3 = new Thread(rt, "thread-c");

		t1.start();
		t2.start();
		t3.start();

	}
}
