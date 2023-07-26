package day_three_java;

public class Tea extends Beveragee {
	String state = "Brown Liquid";


	public Tea() {
		super();   //this statement will call Beverage class' constructor
		System.out.println("From inside Tea class constructor");
	}

	public void showBeverageState() {
		System.out.println("State of tea - " + state);
		//using super, we are accessing state variable of parent class Beverage
		System.out.println("State of beverage - " + super.state);
	}

	public void showState() {
		showBeverageState();
		//here super is used to refer to super class method
		super.showBeverageState();
	}

	public static void main(String[] args) {

		Tea tea = new Tea();
		tea.showBeverageState();
		tea.showState();
	}
}