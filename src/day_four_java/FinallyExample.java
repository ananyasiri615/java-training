package day_four_java;

public class FinallyExample {
	public static void main(String[] args) {
		System.out.println(getFullName());
	}
	
	public static String getFullName() {
		String name = null;
		String fullName = null;
		
		try {
			fullName = name.concat(" Kumar");
			// return fullName;
		} catch(NullPointerException npe) {
			npe.printStackTrace();
			//return fullName + "_Exception";
		} finally {
			//return fullName + "_Finally";
			fullName = fullName.concat("_Finally");
		}
		return fullName;
	}
}
