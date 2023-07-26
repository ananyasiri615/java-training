package day_two_java;

public class ManMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Doctor obj = new Doctor("ABC","Maha","Hyderabad","F");
		obj.breathe();
		System.out.println(obj.toString());
		
		Engineer obj1 = new Engineer("Maha", "BCM", "F", "CSE");
		obj1.method();
		obj1.breathe();
		System.out.println(obj1.toString());
		
		Man obj2 = new Engineer("Maha", "BCM", "F", "CSE");
		
		System.out.println(obj2.toString());
	}

}
