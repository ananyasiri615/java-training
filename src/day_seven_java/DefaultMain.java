package day_seven_java;

public class DefaultMain {
public static void main(String[] args) {
		
		DefaultMethodInterface obj = new DefaultMethodClass();
		obj.displayDefaultMessage();
		obj.print();
		obj.display();
		DefaultMethodInterface.displayStaticMessage();		
	}
}
