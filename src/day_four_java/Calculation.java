package day_four_java;

public class Calculation {
public static void divide(int n1, int n2) {
		
		int result = 0;
		try {
			result = n1 / n2;
		} catch(ArithmeticException ex) {
			System.out.println("The divisor cannot be zero. Please try again.");
			//ex.printStackTrace();
		}
		
		System.out.println("Result = " + result);
	}
	
	public static void main(String[] args) {
		
		//Arithmetic Exception
		//Unchecked Exception or runtime exception
		divide(12, 0);
		
		System.out.println("The program ended successfully");
		
	}
}
