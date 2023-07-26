package day_two_java;

public class Car implements Repairable {

	@Override
	public int repair() {
		// TODO Auto-generated method stub
		int repairingCharges = 300;
		int totalCharges = 0;
		System.out.println("The toy has been repaired");
		
		totalCharges = repairingCharges + SERVICE_CHARGE;
		
		return totalCharges;
		
	}

}
