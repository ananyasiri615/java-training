package day_one_java;

public class TwoDArrayExample {
	
	public static void main(String[] args) {
		
		int [][] arr = new int [3][4];
		
		arr[0][0] = 101;
		arr[0][1] = 102;
		arr[0][2] = 103;
		arr[0][3] = 104;
		
		arr[1][0] = 105;
		arr[1][1] = 106;
		arr[1][2] = 107;
		arr[1][3] = 108;
		
		arr[2][0] = 109;
		arr[2][1] = 110;
		arr[2][2] = 111;
		arr[2][3] = 112;
		
		
		for(int i=0;i<arr.length;i++) {
			
		}
		int i=0;
		int j=0;
		for(int [] val : arr) {
			for(int value : val) {
				j++;
				System.out.println("The value at row " + i +" column "+ j +" " + value);
			}
			i++;
			
		}
		
		
		
	}

}
