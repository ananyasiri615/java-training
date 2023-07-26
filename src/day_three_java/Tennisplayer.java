package day_three_java;

public class Tennisplayer extends Player {
	
	protected String type;

	public Tennisplayer(int id, String name) {
		// TODO Auto-generated constructor stub
		super(id, name);
	} 
	public Tennisplayer(int id, String name, String type) {
		super(id, name);
		this.type=type;
	}
	

	public void display() {
		System.out.println("id :"+id+", name :"+name+" ,type :"+type);
	}
	
	public Tennisplayer getInfo(int id, String name) {
		return new Tennisplayer(id, name);
	}
	

}
