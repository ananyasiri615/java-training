package day_three_java;

public class Area {
	
	public double area(int radius) {
		return 3.14*radius*radius;
		
	}
	public int area(int length,int breadth) {
		return length*breadth;
	}
	
	public float area(float side) {
		return side*side;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area obj = new Area();
		double res1= obj.area(4);
		float res2 = obj.area(4.0f);
		int res3 = obj.area(3, 4);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);

	}

}
