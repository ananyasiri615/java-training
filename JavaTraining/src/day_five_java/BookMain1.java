package day_five_java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BookMain1 {
	
	public static void main(String[] args) {

	Map<Integer, Book1> map = new HashMap<Integer, Book1 >();

	Book1 s1 = new Book1(1, "Einstein", 556.25);
	Book1 s2 = new Book1(2, "Newton", 56.56);
	Book1 s3 = new Book1(3, "Darwin", 253.56);	
	
	map.put(1, s1);
	map.put(2, s2);
	map.put(3, s3);
	
	System.out.println("The size is: "+map.size());
	System.out.println();
	
	Set<Entry<Integer, Book1>> iterate = map.entrySet();
	
	for(Entry<Integer, Book1> entry: iterate) {
		System.out.println("The key is: "+entry.getKey());
		System.out.println("The values are= ID:"+entry.getValue().getId()+"\tName:"+entry.getValue().getName()
				+"\tPrice:"+entry.getValue().getPrice()+"\n");
	}

	}
}
