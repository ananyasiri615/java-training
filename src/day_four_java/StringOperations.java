package day_four_java;

public class StringOperations {
	public static String getName(String name) {
		String nam = null;
		try{
		nam =  name.toUpperCase();
		} catch(NullPointerException npe) {
			System.out.println("The String is null");
		}
		System.out.println(nam);
		return name.toUpperCase();
	}
	
	public static void main(String[] args) {
		//NUll pointer Exception runtime exception
		String name = getName(null);
		System.out.println("The name : "+name);
	}
}
