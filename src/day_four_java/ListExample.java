package day_four_java;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

public class ListExample {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("Mark");
		names.add("Diana");
		names.add("Kane");
		names.add("Joe");
		names.add("Martina");
		
		System.out.println(names.get(3));
		
		System.out.println("Size = " + names.size());
		
		for(String name : names) {
			//System.out.println(name);
			if(name.endsWith("a")) {
				name = "Miss " + name;
			}
			else {
				name = "Mr " + name;
			}
			System.out.println(name);
		}
		
//		Iterator<String> it = names.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println("Value from iterator : " + it.next());
//		}
			
	}

}