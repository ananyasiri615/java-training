package day_seven_java;

import java.util.ArrayList;
import java.util.List;

public class LambdaForEach {
	public static void main(String[] args) {
			
			List<String> list = new ArrayList<>();
			
			list.add("Arjun");
			list.add("Shankar");
			list.add("Javed");
			
			//for-each loop
			for(String val : list) {
				System.out.println(val);
			}
			System.out.println("________________________________");
			//for-each method
			list.forEach(p -> System.out.println(p));	
	}
}
