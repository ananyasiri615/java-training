package day_four_java;

public class EqualsMethodComparison {

	public static void main(String[] args) {

		String s1 = "Shankar";
		String s2 = new String("Shankar");

		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

	}
}
