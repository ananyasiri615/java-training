package WeeklyAssesments;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(",");
        
        List<Integer> list = new ArrayList<>();
        for (String num : numbers) {
            list.add(Integer.parseInt(num.trim()));
        }
        
        Collections.sort(list);
        
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                output.append(",");
            }
            output.append(list.get(i));
        }
        
        System.out.println("Output: " + output);
    }
}
