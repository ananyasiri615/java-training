package day_three_java;

public class Beveragee {

	protected String state = "Liquid";
	 public void showBeverageState() {
         System.out.println("State of beverage - " + this.state);
     }
	 public Beveragee() {
         System.out.println("From inside Beverage class constructor");
     }
	
}
