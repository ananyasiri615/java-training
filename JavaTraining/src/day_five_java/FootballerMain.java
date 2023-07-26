package day_five_java;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FootballerMain {
	public static void main(String[] args) {
        Map<Footballer, String> footballersMap = new HashMap<>();
        footballersMap.put(new Footballer(1, "Lionel Messi", 672, 34), "Argentina");
        footballersMap.put(new Footballer(2, "Cristiano Ronaldo", 674, 36), "Portugal");
        footballersMap.put(new Footballer(3, "Neymar Jr.", 196, 52), "Brazil");
        footballersMap.put(new Footballer(4, "Kylian Mbappe", 157, 22), "France");

//        System.out.println("Entries before sorting:");
//        for (Map.Entry<Footballer, String> entry : footballersMap.entrySet()) {
//            Footballer footballer = entry.getKey();
//            String country = entry.getValue();
//            
//        	System.out.println("The Key is: "+entry.getKey());
//            System.out.println("The Value is: "+entry.getValue());
//
//        }
//
//        Map<Footballer, String> sortedFootballersMap = new TreeMap<>(footballersMap);
//
//        System.out.println("\nEntries after sorting based on the number of goals:");
//        for (Map.Entry<Footballer, String> entry : sortedFootballersMap.entrySet()) {
//            Footballer footballer = entry.getKey();
//            String country = entry.getValue();
//        	
//        	System.out.println(entry.getKey() + " - " + entry.getValue());
//        }
        System.out.println("Entries before sorting:");
        
        footballersMap.forEach((Footballer, country) -> {
            System.out.println("The key is: " + Footballer);
            System.out.println("The value is: " + country);
        });

        Map<Footballer, String> sortedFootballers = new TreeMap<>(footballersMap);

        System.out.println("______________________________________________________");
        
        System.out.println("Entries after sorting:");
        sortedFootballers.forEach((Footballer, country) -> {
            System.out.println("The key is: " + Footballer);
            System.out.println("The value is: " + country);
        });

    }
}
