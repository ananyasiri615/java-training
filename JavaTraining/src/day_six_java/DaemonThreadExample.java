package day_six_java;

public class DaemonThreadExample implements Runnable{
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread().getName() + " : Daemon thread running");
		} else {
			System.out.println(Thread.currentThread().getName() + " : User thread running");
		}
	}

	public static void main(String[] args) {

		Thread t1 = new Thread(new DaemonThreadExample(), "Thread-1");
		
		t1.start();
		
		t1.setDaemon(true);
	}
}
