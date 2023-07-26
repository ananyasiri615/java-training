package day_six_java;

public class Number {
	public synchronized void displayNumbers() {
		for(int i=0; i<5; i++)
			System.out.println(Thread.currentThread().getName() + " : " + i);
	}
}
