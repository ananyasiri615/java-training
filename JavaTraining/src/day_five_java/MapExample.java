package day_five_java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
			
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Vivekanad");
		map.put(102, "Meerabai");
		map.put(103, "Ramakrishna");
		map.put(104, "Shankaracharya");
			
		System.out.println("Size: "+map.size());
		System.out.println("The value againt 102: "+map.get(102));
		map.put(103, "Dayanand");
		System.out.println(map);
		Set<Entry<Integer, String>> setViewOfMap = map.entrySet();
		for(Entry<Integer, String> entry: setViewOfMap) {			
			System.out.println("The key is: "+entry.getKey());
			System.out.println("The valur is: "+entry.getValue());
		}
	}
}
