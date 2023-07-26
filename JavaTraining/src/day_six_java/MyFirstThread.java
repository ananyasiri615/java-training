package day_six_java;

//MyFirstThread is-A Thread 
public class MyFirstThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("This is executed by "+ Thread.currentThread().getName()); 
		System.out.println("linel executed by "+Thread.currentThread().getName());	
	}
	public static void main(String[] args) {

		System.out.println("the program began by" +Thread.currentThread().getName()); 
		
		// Create an object of thread 
		Thread t = new MyFirstThread(); 
		t.setName("siri-thread"); // start the thread

		t.start();

		System.out.println("the program ended by "+Thread.currentThread().getName());
	}
}