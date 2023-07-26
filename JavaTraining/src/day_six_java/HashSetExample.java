package day_six_java;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();

        stringSet.add("Bhuvan");
        stringSet.add("Banana");
        stringSet.add("Orange");
        stringSet.add("Mango");
        stringSet.add("Orange");

        System.out.println("HashSet values before sorting:");
        stringSet.forEach(p -> System.out.println(p));

        Set<String> sortedSet = new TreeSet<>(stringSet);

        // Create a new HashSet to preserve insertion order
        Set<String> sortedHashSet = new HashSet<>(sortedSet);

        System.out.println("\nHashSet values after sorting:");
        sortedSet.forEach(p -> System.out.println(p));
    }
}
