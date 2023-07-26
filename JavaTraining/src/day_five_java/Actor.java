package day_five_java;

public class Actor {
	private String name;
	private String Gender;
	private String Industry;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String Gender) {
		Gender = Gender;
	}
	public String getIndustry() {
		return Industry;
	}
	public void setIndustry(String Industry) {
		Industry = Industry;
	}
	
	@Override
	public String toString() {
		return "Actor [name=" + name + ", Gender=" + Gender + ", Industry=" + Industry + "]";
	}
	
	public Actor(String name, String Gender, String Industry) {
		super();
		this.name = name;
		this.Gender = Gender;
		this.Industry = Industry;
	}
}
