package day_six_java;

public class printNumber implements Runnable {
	   private int startingNumber;

    public printNumber(int startingNumber) {
        this.startingNumber = startingNumber;
    }

    @Override
    public synchronized void run() {
        for (int i = startingNumber; i <= startingNumber + 8; i += 2) {
            System.out.println(i);
        }
        System.out.println( );
    }
}