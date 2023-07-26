package day_five_java;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(101);
		set.add(104);
		set.add(107);
		set.add(102);
		set.add(105);
		set.add(105); 
		set.add(105);
		set.add(105);
		set.add(102);
		set.add(107);
		set.add(107); 
		
		System.out.println("Size of the set is : " + set.size());
		
		for(int value : set) {
			System.out.println(value);
		}
		
		System.out.println("Is 106 containted? " +set.contains(106));
		
	}

}
