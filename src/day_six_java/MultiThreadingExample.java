package day_six_java;

public class MultiThreadingExample {
	public static void main(String[] args) {
		System.out.println("Executing main thread");
		
		String name = Thread.currentThread().getName();
		
		System.out.println("The name of the currently running thread: " + name);
	}
}
