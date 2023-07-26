package sonarQube;

public class Singer implements Filmcrew {
	protected String name;
	@Override
	public void getCrewDetails() {
		System.out.println(this.name + " as a singer");
	}

	public Singer(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return this.name;
	}
}