package sonarQube;

//Lyricist is-A Artist
public class Lyricist implements Filmcrew {
	
	protected String name;

	@Override
	public void getCrewDetails() {
		System.out.println(this.name + " as a lyricist");
	}
	
	public Lyricist(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return this.name;
	}

}