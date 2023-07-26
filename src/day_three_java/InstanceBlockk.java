package day_three_java;

public class InstanceBlockk {
	
	private int id;
	private String name;
	private static int num;
	
	//instance initializer 
    //it is executed before the constructor is being executed
	{
		System.out.println("Object created");
	}
	// to initialize static variable
	// before class is loaded it will be executed
	static
	{
		System.out.println("the static block");
		num=100;
	}
	public InstanceBlockk() {
		//System.out.println("Object created");
		System.out.println("Default constructor invoked");
		id = 10;
		name = "abc";
	}
	
	public InstanceBlockk(int id) {
		//System.out.println("Object created");
		System.out.println("id constructor invoked");
		this.id = id;
	}
	
	public InstanceBlockk(int id, String name) {
		//System.out.println("Object created");
		System.out.println("id, name constructor invoked");
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args) {
		System.out.println("the main method");
		InstanceBlockk obj1 = new InstanceBlockk();
		InstanceBlockk obj2 = new InstanceBlockk(11);
		InstanceBlockk obj3 = new InstanceBlockk(12, "xyz");
		
		
	}

}
