package day_two_java;

public class CurableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Dengue d = new Dengue();
		
		Corona cr = new Corona();
		
		//dengue instance of curable?
		if(d instanceof Curable) {
			System.out.println("Dengue is a curable desease");
		}
		else {
			System.out.println("Dengue is not a curable desease");
		}
		
		if(cr instanceof Curable) {
			System.out.println("Corona is a curable desease");
		}
		else {
			System.out.println("Corona is not a curable desease");
		}

	}

}
