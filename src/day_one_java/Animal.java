package day_one_java;

//Write a program and create a class called Animal
//
//name, colour, vegetarian
//
//displayInfo()
//
//
//Default - Tiger, Yellow, False
//
//Create at least 3 animals and display their values

public class Animal {
	private String name="Tiger";
	private String colour="Yellow";
	boolean vegeterian=false;
	
	public void displayInfo() {
		System.out.println("The Animal is "+name+" colour is "+colour+" and vegeterian is "+vegeterian);
		
	}
	public static void main(String[] args) {
		Animal obj1 = new Animal();
		obj1.name="Lion";
		obj1.colour="yellow";
		obj1.vegeterian=false;
		
		obj1.displayInfo();
		
		Animal obj2 = new Animal();
		obj2.name="Goat";
		obj2.colour="black";
		obj2.vegeterian=true;
		
		obj2.displayInfo();
		
		Animal obj3 = new Animal();
		obj3.name="cow";
		obj3.colour="white";
		obj3.vegeterian=true;
		
		obj3.displayInfo();
		
		Animal obj4 = new Animal();		
		obj4.displayInfo();
		
	}

}
