package day_six_java;

public class Task2 implements Runnable {
	
	public void run() {
		for(int i=10; i < 13; i++) {
			System.out.println(Thread.currentThread().getName() + " : Value of i = " + i);
		}
	}
}