package day_six_java;

public class Multithread {
	public static void main(String[] args) {
        Thread t1 = new Thread(new printNumber(101));
        Thread t2 = new Thread(new printNumber(201));
        Thread t3 = new Thread(new printNumber(301));

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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        t3.start();
        try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 }
}
