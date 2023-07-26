package sonarQube;

public class Movie {
	
	private String name;
	
	public Movie(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return this.name;
	}
	

}
