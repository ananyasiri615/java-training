package day_one_java;

public class Factorial {
	
	
	public void factorial(int n) {
		int result=1;
		for(int i=1;i<=n;i++) {
			result *=i;
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factorial obj = new Factorial();
		obj.factorial(5);

	}

}

