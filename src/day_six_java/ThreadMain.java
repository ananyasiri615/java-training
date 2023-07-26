package day_six_java;

public class ThreadMain {

	public static void main(String[] args) {

		Runnable rt = new Task();

		Thread t1 = new Thread(rt); // Thread is in 'New' state

		System.out.println("Program started by " + Thread.currentThread().getName());

		Thread t2 = new Thread(rt);

		Thread t3 = new Thread(rt);

		// t1.start(); //t1 goes into Runnable state

		t1.start(); // code inside run will be executed by the main thread itself
		
		try {
			t1.join(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		t2.start(); // t2 goes into Runnable state
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		t3.start(); // t3 goes into Runnable state
		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Program ended by " + Thread.currentThread().getName());

	}

}


//the order in which the thread is executed is not guarenteed
//nor is the duration of the running of the thread