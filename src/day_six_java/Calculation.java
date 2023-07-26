package day_six_java;

public class Calculation {
	public synchronized void sum(int i) {
		System.out.println(Thread.currentThread().getName() + " : sum = " + (i + i));
	}
	
	public synchronized void square(int j) {
		System.out.println(Thread.currentThread().getName() + " : square = " + j*j);
	}
}

