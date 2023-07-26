package day_three_java;

public class AutoTypePromotionExamplee {
	
	public void sum(byte num1, byte num2) {
                System.out.println("byte, byte version is called.");
		System.out.println(num1 + num2);
	}
	
	public void sum(int num1, int num2) {
                System.out.println("byte, int version is called.");
		System.out.println(num1 + num2);
	}
	
	public static void main(String[] args) {

		AutoTypePromotionExamplee obj = new AutoTypePromotionExamplee();
		obj.sum(10, 20);    //compiler error The method sum(byte, int) in the type 
	                            //AutoTypePromotionExample is not 
                                    //applicable for the arguments (int, int)
	}
}