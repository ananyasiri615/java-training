package day_six_java;

public class displayNumber {
	public void displayNumbers() {

		System.out.println(Thread.currentThread().getName() + " : Entering displayNumbers method");
		System.out.println(Thread.currentThread().getName() + " : This is the second statement");

		synchronized (this) {
			for (int i = 0; i < 5; i++)
				System.out.println(Thread.currentThread().getName() + " : " + i);
		}
		System.out.println(Thread.currentThread().getName() + " : Existing displayNumbers method");
	}
}
