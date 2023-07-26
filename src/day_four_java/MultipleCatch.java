package day_four_java;

public class MultipleCatch {
	public static void calculate(int n1, int n2) {

		int[] arr = new int[] { 12, 34, 5, 5, 3 };
		int index = 0;
		int value = 0;
		try {
			index = n1 / n2;
			value = arr[index];
		} /*catch (ArithmeticException e) {
			System.out.println("The divisor cannot be zero");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The index " + index + " is beyond the range of the array");
		}*/
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled");
			e.printStackTrace();
		}
		System.out.println("The value at index " + index + " = " + value);
	}

	public static void main(String[] args) {

		calculate(10, 5);
		
		System.out.println("The program ended successfully");

	}
}
