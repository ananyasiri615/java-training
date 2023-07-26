package day_four_java;

import java.util.ArrayList;
import java.util.List;

public class CricketerMain {
	public static void main(String[] args) {
        // Create a list of cricketers
        List<Cricketer> cricketers = new ArrayList<>();
        cricketers.add(new Cricketer("Sachin Tendulkar", "Batsman", 18426));
        cricketers.add(new Cricketer("Muttiah Muralitharan", "Bowler", 800));
        cricketers.add(new Cricketer("Jacques Kallis", "All-rounder", 11579));

        for (Cricketer cricketer : cricketers) {
            printRunsInWords(cricketer);
        }
    }

    public static void printRunsInWords(Cricketer cricketer) {
        int noOfRuns = cricketer.getNoOfRuns();
        String runsInWords = convertToWords(noOfRuns);
        System.out.println(cricketer.getName() + ": " + runsInWords);
    }

    public static String convertToWords(int number) {
        return String.valueOf(number);
    }
}
