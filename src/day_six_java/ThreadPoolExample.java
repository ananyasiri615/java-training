package day_six_java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(4);
		for(int i=0; i<6; i++) {
			Task task = new Task();
			executor.execute(task);
		}
		executor.shutdown();
	}
}
