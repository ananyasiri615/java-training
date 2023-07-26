package day_two_java;

public class Engineer extends Man {

	protected String deparment;


	public String getDeparment() {
		return deparment;
	}

	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}

	public Engineer(String name, String address, String gender, String deparment) {
		super(name, address, gender);
		this.deparment = deparment;
	}
	
	public void method() {
		System.out.println("Enginner class");
	}

	@Override
	public String toString() {
		return "Engineer [deparment=" + deparment + ", name=" + name + ", address=" + address + ", gender=" + gender
				+ "]";
	}
	
	
	
	

}
