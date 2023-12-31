package day_five_java;

public class ActorMap {

	private String name;
	private String gender;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "ActorMap [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	public ActorMap(String name, String gender, int Age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;	
	}
	

}
