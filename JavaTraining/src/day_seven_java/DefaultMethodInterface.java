package day_seven_java;

public interface DefaultMethodInterface {
	void print();
	void display();
	
	default void displayDefaultMessage(){
		System.out.println("This is default message.");

	}
	static void displayStaticMessage () {
		System.out.println("This is static message of the inerface.");
	}
}
