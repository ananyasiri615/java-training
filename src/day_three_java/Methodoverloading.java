package day_three_java;

public class Methodoverloading {
	
	public void display() {
		System.out.println("Display method");
	}
	public void display(String name) {
		System.out.println("Hi "+name);
	}
	public void display(String name,String surname) {
		System.out.println("Hi "+name+" "+surname);
	}
	public void display(String name,int age) {
		System.out.println("Hi " +name +" your age is:"+age);
	}
	public static void main(String[] args) {
		
		Methodoverloading obj = new Methodoverloading();
		obj.display();
		obj.display("Maha");
		obj.display("Maha", "Nagula");
		obj.display("Maha", 23);
	}
	

}
