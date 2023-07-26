package day_six_java;

public class ThreadPriorityExample {
	public static void main(String[] args) {

        //creating thread using anonymous class
Thread t1 = new Thread(new Runnable() {

	public void run() {
		System.out.println("Current Thread priority " + Thread.currentThread().getPriority());
	}
});

Thread t2 = new Thread(new Runnable() {

	public void run() {
		System.out.println("Current Thread priority " + Thread.currentThread().getPriority());
}
});

t1.start();
t2.start();
t2.setPriority(Thread.MAX_PRIORITY);
}
}
