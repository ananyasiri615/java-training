package day_five_java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ActorMapMain {
public static void main(String[] args) {
		
		Map<ActorMap, String> actorsMap = new HashMap<>();
		
		ActorMap a1 = new ActorMap("Shah Rukh Khan", "Male", 50);
		ActorMap a2 = new ActorMap("Jonny Depp", "Male", 60);
		ActorMap a3 = new ActorMap("Anushka Sharma", "Female", 35);
		
		actorsMap.put(a3, "Bollywood");
		actorsMap.put(a2, "Hollywood");
		actorsMap.put(a3, "Bollywood");
		actorsMap.put(a1, "Bollywood");
		actorsMap.put(a1, "Bollywood");
		
		System.out.println("size : " + actorsMap.size());
		
		System.out.println(actorsMap);
		
		Set<Entry<ActorMap, String>> setViewOfMap = actorsMap.entrySet();
		
		Iterator<Entry<ActorMap, String>> it = setViewOfMap.iterator();
		
		while(it.hasNext()) {
			Entry<ActorMap, String> entry = it.next();
			System.out.println("The key : " + entry.getKey());
			System.out.println("The Value : " + entry.getValue());
		}
		
		
		
	}
}
