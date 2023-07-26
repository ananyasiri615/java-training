package day_six_java;

public class Task1 implements Runnable {
	public void run() {
		for(int i=0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + " : Value of i = " + i);
		}
	}
}
