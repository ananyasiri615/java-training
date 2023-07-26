package day_four_java;

public class MultipleCatchDifferrentPlaces {
	public static int divide(int n1, int n2) {

		int result = 0;
		try {
			result = n1 / n2;
		} catch (ArithmeticException ex) {
			System.out.println("The divisor cannot be zero. Please try again.");
			ex.printStackTrace();
		}

		return result;
	}

	public static void main(String[] args) {

		// Arithmetic Exception
		// Unchecked Exception or runtime exception

		int index = divide(12, 2);

		int[] arr = new int[] { 12, 3, 45, 5 };

		int value = 0;
		try {
			value = arr[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The index is beyond the range of the array. Please try again");
		}

		System.out.println("The value at index " + index + " = " + value);

		System.out.println("The program ended successfully");

	}
}
