package day_five_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Shahid");
		list.add("Meera");
		list.add("Kabir");
		list.add("Mark");
		list.add("Diana");
		list.add("Arjun");
		
		System.out.println("Before Sorting : " + list);
		
		Collections.sort(list);
		
		System.out.println("After sorting : " + list);
	}
}
