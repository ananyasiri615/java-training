package day_seven_java;

public class ThreadInterruptionExample implements Runnable {

    public void run() {
        for (int i = 1; i <= 2; i++) {
	    if (Thread.interrupted()) {
	        System.out.println(Thread.currentThread().getName() + " : interrupted() method call.");
	    } else {
	        System.out.println(Thread.currentThread().getName() +  " : thread is not interrupted.");
	      }
	}
}        

    public static void main(String args[]) {

	Thread t1 = new Thread(new ThreadInterruptionExample(), "First Thread");
	Thread t2 = new Thread(new ThreadInterruptionExample(), "Second Thread");

	t1.start();
	t1.interrupt(); //it will set the value of interrupt flag to true

	t2.start();

    }
}
