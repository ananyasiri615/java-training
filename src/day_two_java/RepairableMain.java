package day_two_java;

public class RepairableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Repairable r1 = new Toy();

		Repairable r2 = new Car();

		int chargesToBePaid = r1.repair();

		System.out.println("Charges to be paid is : " + chargesToBePaid);

		chargesToBePaid = r2.repair();

		System.out.println("Charges to be paid is : " + chargesToBePaid);

	}

}
