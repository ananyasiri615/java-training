package day_one_java;

public class Task {
	private String name;
	private String type;
	private String colour;
	public void method() {
		System.out.println("the consumer gets energied");
	}
	
	public static void main(String[] args) {
		Task obj1 = new Task();
		obj1.name="cappuccino";
		obj1.type="Hot coffee";
		obj1.colour="brown";
		System.out.println("the coffee name:"+obj1.name);
		System.out.println("the coffee type:"+obj1.type);
		System.out.println("the coffee colour:"+obj1.colour);
		obj1.method();
		
		System.out.println();
		
		
		Task obj2 = new Task();
		obj2.name="cappuccino";
		obj2.type="cold coffee";
		obj2.colour="black";
		
		System.out.println("the coffee name:"+obj2.name);
		System.out.println("the coffee type:"+obj2.type);
		System.out.println("the coffee colour:"+obj2.colour);
		obj2.method();
		
	}
	

}
