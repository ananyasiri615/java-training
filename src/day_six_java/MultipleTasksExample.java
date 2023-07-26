package day_six_java;

public class MultipleTasksExample {
public static void main(String[] args) {
		
		Thread t1 = new Thread(new Task1());
		Thread t2 = new Thread(new Task2());
		Thread t3 = new Thread(new Task3());
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t3.start();
	}
}
