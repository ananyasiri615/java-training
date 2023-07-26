package day_seven_java;

public class ExecutableMethodReference {
	
	public ExecutableMethodReference() {
		System.out.println("Method refernce using a constructor");
	}
	
	
	//method reference to an instance method
	public void display() {
		System.out.println("This definition is using method reference");
	}
	
	public static void print() {
		System.out.println("Method reference using a static method");
	}
	
	public static void main(String[] args) {
		
		ExecutableMethodReference obj = new ExecutableMethodReference();
		
		Executable exec = obj :: display; 
		
		exec.execute();
		
		Executable exec1 = ExecutableMethodReference :: print;
		
		exec1.execute();
		
		Executable exec2 = ExecutableMethodReference :: new;
		
		exec2.execute();
		
	}

}
