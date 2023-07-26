package day_one_java;

public class Dowhileloop {
	
	public long method(long number) {
		int sum=0;
		long rem=0;
		do {
			rem=number%10;
			sum += rem;
			number = number/10;
			
		}while(number>0 );
		
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dowhileloop obj = new Dowhileloop();
		long res = obj.method(234567);
		System.out.println(res);

	}

}
