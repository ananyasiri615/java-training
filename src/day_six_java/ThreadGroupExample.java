package day_six_java;

public class ThreadGroupExample {
public static void main(String[] args) {
		
		ThreadGroup tgrp = new ThreadGroup("My Thread Group");
		
        Task task = new Task();
		Thread t1 = new Thread(tgrp, task, "Thread1");
		Thread t2 = new Thread(tgrp, task, "Thread2");
		Thread t3 = new Thread(tgrp, task, "Thread3");
		
		t1.start();
		t2.start();
		t3.start();
		
		tgrp.list();
	
	}	
}
