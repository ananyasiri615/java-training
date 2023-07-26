package day_two_java;

public class Toy implements Repairable {
	@Override
	public int repair() {
		int repairingCharges = 200;
		int totalCharges = 0;
		System.out.println("The toy has been repaired");
		
		totalCharges = repairingCharges + SERVICE_CHARGE;
		return totalCharges;
	}

}
