package day_three_java;

public class MethodoverloadingEx {
	
	
	public void Calculate(int num1) {
		int result = num1*num1;
		System.out.println(result);
	}
	public void Calculate(int num1,int num2) {
		int result = num1*num2;
		System.out.println(result);
	}
	public void Calculate(int num1,int num2,int num3) {
		int ans=0;
		if(num1>num2 && num1>num3) {
			ans=num1;
		}
		else if(num2>num3) {
			ans=num2;
		}
		else {
			ans=num3;
		}
		System.out.println(ans);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodoverloadingEx obj = new MethodoverloadingEx();
		obj.Calculate(4);
		obj.Calculate(3, 4);
		obj.Calculate(2, 3, 4);
		

	}

}
