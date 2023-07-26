package day_seven_java;

import java.util.concurrent.atomic.AtomicBoolean;

public class StoppingThreadExample implements Runnable{
	private Thread worker;
	private AtomicBoolean shouldRun = new AtomicBoolean(false);
	
	@Override
	public void run() {
		shouldRun.set(true);
		while(shouldRun.get()) {
			System.err.println("The thread is running");
		}
		System.out.println("The thread is stopped");
	}
	
	public void start() {
		worker = new Thread(this);
		worker.start();
	}
	
	public void stop() {
		shouldRun.set(false);
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		StoppingThreadExample obj = new StoppingThreadExample();
		obj.start();
		
		Thread.sleep(2000);
		
		obj.stop();
	}
}
