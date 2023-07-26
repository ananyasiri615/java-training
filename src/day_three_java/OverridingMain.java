package day_three_java;

public class OverridingMain {
	
	public static void main(String[] args) {
		
		
		//That which version of overridden method will be invoked that depends on
		//the type of object being created, and not the reference variable
		Player obj1 = new Cricketerr(1,"Virat","Batsman");
		obj1.display();
		
		Player obj2 = new Tennisplayer(1,"sindhu","Final");
		obj2.display();
		
		Player p1 = obj1.getInfo(101, "Rohit Sharma");
			
		System.out.println(p1);
		
		Player p2 = obj2.getInfo(102, "Jadeja");
		System.out.println(p2);
		
	}

}
