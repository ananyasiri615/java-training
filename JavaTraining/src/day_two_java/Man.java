package day_two_java;

public class Man {
	String name;
    String address;
    String gender;
    
    public Man(String name, String address, String gender) {
		this.name = name;
		this.address = address;
		this.gender = gender;
    }
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void breathe(){
        System.out.println("Man breathes.");
    }


}
