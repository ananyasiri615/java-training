package day_six_java;

public class Task implements Runnable{
	@Override
	public void run() {
		for (int i = 1; i <=5; i++) {
			System.out.println("i : " + i + " -" + Thread.currentThread().getName());
			
		}
	}
}
