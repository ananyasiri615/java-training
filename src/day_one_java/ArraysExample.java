package day_one_java;


public class ArraysExample {

	public static void main(String[] args) {
	
		String [] arr = new String[3];
		
		arr[0] = "Arjun";
		
		arr[1] = "Mark";
		
		arr[2] = "Javed";
		
		System.out.println("The size of the array : " + arr.length);
		
		System.out.println(arr[2]);
		
		for(String name : arr) {
		
			System.out.println("Name : " + name.toUpperCase());
		
		}
		
		arr[2] = "Anjali";
		
		System.out.println(arr[2]);
	
	}

 

}

 
