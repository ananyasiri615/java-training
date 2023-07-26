package day_six_java;

public class SynchronizedMethodExample implements Runnable {

	Calculation calculation;
	
	public SynchronizedMethodExample(Calculation calculation) {
		super();
		this.calculation = calculation;
	}
	
	@Override
	public void run() {
		calculation.sum(4);
		calculation.square(6);
	}
	
	public static void main(String[] args) {
		Calculation calculation = new Calculation();
		Runnable rt1 = new SynchronizedMethodExample(calculation);
		Runnable rt2 = new SynchronizedMethodExample(calculation);
		Runnable rt3 = new SynchronizedMethodExample(calculation);
		Thread t1 = new Thread(rt1, "thread-a");
		Thread t2 = new Thread(rt2, "thread-b");
		Thread t3 = new Thread(rt3, "thread-c");
		
		t1.start();
		t2.start();
		t3.start();
			
	}
}
