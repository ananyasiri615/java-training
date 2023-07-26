package day_four_java;

public class ThrowExample {

public static void main(String[] args) {
		
		System.out.println("Program started");
		
		//Exception e = new NullPointerException();
		
		try {
		throw new NullPointerException();
		} catch(NullPointerException e) {
			System.out.println("NullPointerException thrown exlicitly");
		}
		
		System.out.println("Program ended successfully");
		
	}

}
