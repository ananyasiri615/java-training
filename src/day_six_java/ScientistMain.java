package day_six_java;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class ScientistMain {
	public static void main(String[] args) {
        Map<Scientist, String> ScientistMap = new HashMap<>();
        ScientistMap.put(new Scientist(1, "Einstietn", 1000), "Physics");
        ScientistMap.put(new Scientist(2, "Darwin", 200), "Chemistry");
        ScientistMap.put(new Scientist(1, "Newton", 500), "Physics");
        ScientistMap.put(new Scientist(1, "Edison", 250), "Gravity");

        System.out.println("Entries before sorting:");
        for (Map.Entry<Scientist, String> entry : ScientistMap.entrySet()) {
            Scientist scientist = entry.getKey();
            String subject = entry.getValue();
            
        	System.out.println("The Key is: "+entry.getKey());
            System.out.println("The Value is: "+entry.getValue());

        }

        Map<Scientist, String> sortedScientitsMap = new TreeMap<>(ScientistMap);

//        System.out.println("\nEntries after sorting based on the number of goals:");
//        for (Map.Entry<Scientist, String> entry : sortedScientitsMap.entrySet()) {
//            Scientist scientist = entry.getKey();
//            String subject = entry.getValue();
//        	
//        	System.out.println(entry.getKey() + " - " + entry.getValue());
//        }
        ScientistMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

    }
	
	
}
