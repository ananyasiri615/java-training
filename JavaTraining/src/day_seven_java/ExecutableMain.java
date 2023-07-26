package day_seven_java;

public class ExecutableMain {
	public static void main(String[] args) {
		
		Executable obj = () -> {System.out.println("Executing...");};
		obj.execute();
		Executable obj1 = () -> {System.out.println("Executing diffrently...");};
		obj1.execute();

	}
}
