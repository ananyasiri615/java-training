package day_one_java;

public class LuckyNumberCalculator {
	
	public int method(String name) {
		char arr[] = name.toCharArray();
		int count1=0;
		int count2=0;
		int counta=0;
		int counte=0;
		int counti=0;
		int counto=0;
		int countu=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=' ') {
				count1++;
			}
			if(arr[i] =='A' ||  arr[i] =='a' ) {
				counta++;
			}
			if(arr[i] =='E' ||  arr[i] =='e' ) {
				counte++;
			}
			if(arr[i] =='I' ||  arr[i] =='i' ) {
				counti++;
			}
			if(arr[i] =='0' ||  arr[i] =='o' ) {
				counto++;
			}
			if(arr[i] =='U' ||  arr[i] =='u' ) {
				countu++;
			}
			
		}
		if(counta>0) {
			counta=1;
		}
		if(counte>0) {
			counta=1;
		}
		if(counti>0) {
			counta=1;
		}
		if(counto>0) {
			counta=1;
		}
		if(countu>0) {
			counta=1;
		}
		count2 = counta+counte+counti+counto+countu;
		return count1-count2;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LuckyNumberCalculator obj1 = new LuckyNumberCalculator();
		int res1 = obj1.method("Maha      laxmi");
		System.out.println(res1);
		LuckyNumberCalculator obj2 = new LuckyNumberCalculator();
		int res2 = obj2.method("Maha laxmi Nagula");
		System.out.println(res2);
		LuckyNumberCalculator obj3 = new LuckyNumberCalculator();
		int res3 = obj3.method("Mounika");		
		System.out.println(res3);
	}

}



//import java.util.Scanner;
//
//public class LuckyNumberCalculator {
//
//    private static final String VOWELS = "aeiou";
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//
//        int totalCharacters = name.length();
//        int vowelsCount = 0;
//        for (int i = 0; i < totalCharacters; i++) {
//            char character = name.charAt(i);
//            if (VOWELS.indexOf(character) != -1) {
//                vowelsCount++;
//            }
//        }
//
//        int luckyNumber = totalCharacters - vowelsCount;
//        System.out.println("Your lucky number is: " + luckyNumber);
//    }
//}

