package day_four_java;

public class FinallyBlock {
	public static String getName(String name) {

		try {
			name = name.toUpperCase();
			
			
		} catch (NullPointerException e) {
			System.out.println("The name cannot be null.");
			e.printStackTrace();
		} finally {
			System.out.println("Line One");
			System.out.println("Line two");
			System.out.println("Line three");
		}
		//you cannot use try block alone. It should be either supported by a catch block or a finally block.
		//try-catch-finally together can also be used
		return name;
	}

	public static void main(String[] args) {

		// NullPointerException runtime exception
		String name = getName(null);
		System.out.println("The name : " + name);
	}
}
