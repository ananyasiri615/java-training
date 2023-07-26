package day_five_java;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> names = new LinkedList<>();
		LinkedList<String> names1 = new LinkedList<>();
		
		names1.add("sachin");
		names1.add("Azhar");
		names1.add("Ajay");
		names1.add("Saurav");
		names1.addFirst("Vinod");
		names1.addFirst("Zahir");
		
		for(String name: names1) {
			System.out.println(name);
		}
		
		names1.removeFirst();
		
		names1.add("Azhar");
		names1.add("Ajay");
		names1.add("Azhar");
		
		System.out.println(names1);
		
		names1.removeLastOccurrence("Azhar");

		Iterator<String> it = names1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Iterator<String> it1 = names1.descendingIterator();
		while(it1.hasNext()) {
			System.out.println("descending : " + it1.next());
		
		}
	}

}
