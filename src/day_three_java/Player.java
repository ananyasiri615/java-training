package day_three_java;

public class Player {
	protected int id;
	protected String name;
	
	public Player getInfo(int id, String name) {
		return new Player(id, name);
	}
	
	public void display() {
		System.out.println("id : " + id + ", name : " + name);
	}

	public Player(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + "]";
	}


}
