package day_one_java;

public class Human implements LivingBeing, Creature {
	@Override

	public void breathe() {

	System.out.println("The humans breathe oxygen");

	}

	@Override

	public void communicate() {

	System.out.println("The humans communicate using a language");

	}
	
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Humans eat rice");
		
	}

	public static void main(String[] args) {



	Human h = new Human();

	h.communicate();

	h.breathe();
	h.eat();

	LivingBeing lb = new Human();

	lb.communicate();

	lb.breathe();

	

	Creature obj = new Human();
      obj.eat();
	 

	}

}
