package day_one_java;

public class Coffee {
	
	private int id;
	private String flavour;
	private String colour;
	
	
	//The idea of having constructors is to initialize the values of the properties of the objects
	public Coffee () {
		id = 100;
		flavour = "chocolate";
		colour= "black";
	}
	
	public Coffee(int id) {
		//this.id refers to the attribute of the class
		//id refers to the parameter name passed in the constructor
		this.id = id;
	}
	
	public Coffee(int id, String flavour) {
		this.id = id;
		this.flavour = flavour;
	}
	public Coffee(String flavour,String colour) {
		this.flavour = flavour;
		this.colour= colour;
	}
	public Coffee(int id, String flavour,String colour) {
		this.id = id;
		this.flavour = flavour;
		this.colour=colour;
	}
	
	
	

	
	public static void main(String[] args) {
		
		Coffee t = new Coffee();
	//<class-name> <object-name> = new <constructor>;
		//constructor with empty parenthesis is known as default/no-arg constructor
		
		t.id = 101;
		t.flavour = "cardamom";
		System.out.println("id : " + t.id);
		System.out.println();
		
		Coffee t1 = new Coffee();
		System.out.println("id : " + t1.id);
		System.out.println("flavour : " + t1.flavour);
		System.out.println("colour : " + t1.colour);
		System.out.println();
		
		Coffee t2 = new Coffee(102);
		System.out.println("id : " + t2.id);
		System.out.println();
		
		Coffee t3 = new Coffee(102,"caramel");
		System.out.println("id : " + t3.id);
		System.out.println("flavour : " + t3.flavour);
		System.out.println();
		
		Coffee t4 = new Coffee("caramel","black");
		System.out.println("flavour : " + t4.flavour);
		System.out.println("colour : " + t4.colour);
		
		
	}
	
}
