package day_one_java;

public class Animals implements LivingBeing {

	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		System.out.println("The animals breathe oxygen");
		
	}

	@Override
	public void communicate() {
		// TODO Auto-generated method stub
		System.out.println("The animals do not use any language to communicate but they make sounds.");
	}
	
	public static void main(String[] args) {
		
		Animals a = new Animals();
		a.breathe();
		a.communicate();
		
		LivingBeing l = new Animals();
		l.breathe();
		l.communicate();
		
		
	}

}
