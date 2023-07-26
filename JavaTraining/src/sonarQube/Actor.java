package sonarQube;

public class Actor implements Filmcrew {
	protected String name;
	@Override
	public void getCrewDetails() {
		System.out.println(this.name + " as a actor");
	}

	public Actor(String name) {
		this.name=name;

	}

	@Override
	public String toString() {
		return this.name;
	}
	

}


