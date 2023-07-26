package sonarQube;

public abstract class Artist {
	
	protected String name;
	
	public abstract void getInfo();

	public Artist(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
	
	

	
}