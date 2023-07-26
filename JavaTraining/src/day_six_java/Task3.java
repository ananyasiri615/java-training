package day_six_java;

public class Task3 implements Runnable {
	
	public void run() {
		for(int i=20; i < 23; i++) {
			System.out.println(Thread.currentThread().getName() + " : Value of i = " + i);
		}
	}
}