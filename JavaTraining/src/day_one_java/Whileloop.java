package day_one_java;

public class Whileloop {
	int count=0;
	public void method(int n) {
		while(n>0) {
			n=n/10;
			count++;
			
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Whileloop obj = new Whileloop();
		obj.method(2345);

	}

}
