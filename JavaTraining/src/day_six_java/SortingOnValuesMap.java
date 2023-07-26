package day_six_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortingOnValuesMap {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(101, "Viveknand");
		map.put(102, "Meerabai");
		map.put(103, "Ramakrishna");
		map.put(104, "Shankaracharya");
		
		for(Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " - Value : " + entry.getValue());
		}
		System.out.println("____________________________________________________________________");
		//Lets create a list of Values
		//We will sort that list
		//We will again for the map using the sorted list
		
		List<String> values = new ArrayList<>();
		
		for(Entry<Integer, String> entry : map.entrySet()) {
			values.add(entry.getValue());
		}
		
		Collections.sort(values);
		
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		
		//vivekanand
		for(String name : values) {
			for(Entry<Integer, String> entry : map.entrySet()) {
				if(name.equals(entry.getValue())) {
					sortedMap.put(entry.getKey(), entry.getValue());
					break;
				}
			}
		}
		
		
		for(Entry<Integer, String> sortedEntry : sortedMap.entrySet()) {
			System.out.println("Key : " + sortedEntry.getKey() + " - Value : " + sortedEntry.getValue());
		}
		

	}

}


//print the map as it is

//create a list from the values of the map

//sort that list

//iterate over the list 

//And create a sorted map

//print the sorted map