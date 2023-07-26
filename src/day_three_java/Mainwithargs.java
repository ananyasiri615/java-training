package day_three_java;

public class Mainwithargs {
	
	public static int calculate(String[] args) {
		int vowelscount=0;
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
			String a = args[i];
			char[] arr = a.toCharArray();
			for(int j=0;j<arr.length;j++) {
				if(arr[j]== 'a' || arr[j] == 'e' || arr[j] == 'i' || arr[j] == 'o' || arr[j] == 'u' || arr[j] == 'A' || arr[j] == 'E' || arr[j] == 'I' || arr[j] == 'O' || arr[j] == 'U') {
					vowelscount++;
				}
			}
		
		
		}
		int result = 26-vowelscount;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Mainwithargs obj = new Mainwithargs();
		int answer = obj.calculate(args);
		System.out.println(answer);

	}

}
