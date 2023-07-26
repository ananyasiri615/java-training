package day_one_java;

public class Actor {
	public int id;
	public String name;
	public String gender;
	public String industry;

	
	public Actor(int id,String name,String gender,String industry) {
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.industry=industry;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


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


	public String getIndustry() {
		return industry;
	}


	public void setIndustry(String industry) {
		this.industry = industry;
	}


	@Override
	public String toString() {
		return "Actor [id=" + id + ", name=" + name + ", gender=" + gender + ", industry=" + industry + "]";
	}

	
	

}
