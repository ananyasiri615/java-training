package day_five_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExamplee {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(30);
		list.add(52);
		list.add(25);
		list.add(8);
		list.add(8);
		list.add(45);
		list.add(5);
		list.add(5);
		list.add(85);
		
		Set<Integer> set = new HashSet<Integer>(list);
		
		System.out.println("List is :" + list);
		System.out.println("Set is : " + set);
		Collections.sort(list);
		 
        System.out.println("List after the use of" +
                        " Collection.sort() :\n" + list);
	}

}
