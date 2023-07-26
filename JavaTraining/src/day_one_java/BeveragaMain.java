package day_one_java;

public class BeveragaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Beverage [] beverages = new Beverage [3]; 
		
		Beverage softDrink = new Beverage(1, "Soft drink", "Cold");
		Beverage coffee = new Beverage(2, "Coffee", "Hot");
		Beverage cocktail = new Beverage(3, "Cocktail", "Cold");
		
		beverages[0] = softDrink;
		beverages[1] = coffee;
		beverages[2] = cocktail;
		
		for(Beverage b:beverages) {
			System.out.println(b.toString());
		}

	}

}
