package day_one_java;

public class Car {
	private String name;
	private String colour;
	private String company;
	
	public void displayCarInfo() {
		System.out.println("The car name is " + name+",colour is "+colour+" and it belongs to "+company);
		
	}

	public static void main(String[] args) {
		Car obj = new Car();
		obj.name="Creta";
		obj.colour="Red";
		obj.company="Hyundai";
		
		obj.displayCarInfo();

	}

}
