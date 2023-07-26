package day_one_java;

public class Excercise {
	
	public static void isEligible(int age) {
		boolean ans = age > 18 ? true:false;
		if(ans) {
			System.out.println("The person is eligible to vote");
		}
		else {
			int wait = 18-age;
			System.out.println("The person has to wait for "+wait+" years to vote ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Excercise.isEligible(19);
		Excercise.isEligible(9);
		Excercise.isEligible(28);


	}

}
