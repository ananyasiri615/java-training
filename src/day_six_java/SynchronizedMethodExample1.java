package day_six_java;

public class SynchronizedMethodExample1 implements Runnable {
displayNumber number;
	
	public SynchronizedMethodExample1(displayNumber number) {
		this.number = number;
	}
	
	@Override
	public void run() {
		number.displayNumbers();
	}
	
	public static void main(String[] args) {
		
		displayNumber number = new displayNumber();
		
		Runnable rt1 = new SynchronizedMethodExample1(number);
		Runnable rt2 = new SynchronizedMethodExample1(number);
		Runnable rt3 = new SynchronizedMethodExample1(number);
		
		Thread t1 = new Thread(rt1);
		Thread t2 = new Thread(rt2);
		Thread t3 = new Thread(rt3);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
