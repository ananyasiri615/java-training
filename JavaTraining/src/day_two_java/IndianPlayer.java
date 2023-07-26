package day_two_java;

public abstract class IndianPlayer {
	
	private int id;
	private String name;
	
	public IndianPlayer() {
		
	}
	public IndianPlayer(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public abstract void play();
	
	public void representsCountry() {
		System.out.println("The Indian player represents India");
	}

}