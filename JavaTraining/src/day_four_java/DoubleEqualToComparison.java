package day_four_java;

public class DoubleEqualToComparison {

	public static void main(String[] args) {

		String s1 = "Shankar";
		String s2 = new String("Shankar");

		System.out.println(s1 == s2);
		/*
		 * The above comparison returns false. Even though the content is same. Because
		 * s1 object created in String constant pool, whereas s2 object is created in HEAP.
		 * Thus memory addresses are different
		 */
	}

}
