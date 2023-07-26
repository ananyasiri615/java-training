package day_one_java;

public class Calculation {
	
	
	public int addition(int num1,int num2) {
		return num1+num2;
	}
	public double subtraction(int num1,double num2) {
		return num1-num2;
	}
	public int multiplication(int num1,int num2,int num3) {
		return num1*num2*num3;
	}
	public float division(float num1,float num2) {
		return num1/num2;
	}
	

	public static void main(String[] args) {		
		Calculation c = new Calculation();
		int r1 = c.addition(10, 20);
		System.out.println(r1);
		double r2=c.subtraction(20, 10.00);
		System.out.println(r2);
		int r3 = c.multiplication(10, 10, 30);
		System.out.println(r3);
		float r4 = c.division(13444f, 234f);
		System.out.println(r4);
		

	}

}
