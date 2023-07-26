package home_Assignments;

import java.util.HashSet;
import java.util.Scanner;

import java.util.Set;

public class StringPermutations {

    public static void permutations(String str, boolean[] usedChars, String emptyStr, Set<String> printedPermutations) {
        if (emptyStr.length() == str.length()) {
            if (!printedPermutations.contains(emptyStr)) {
                System.out.println(emptyStr);
                printedPermutations.add(emptyStr);
            }
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            if (!usedChars[i]) {
                usedChars[i] = true;
                String charStr = String.valueOf(str.charAt(i));
                permutations(str, usedChars, emptyStr + charStr, printedPermutations);
                usedChars[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean[] usedChars = new boolean[str.length()];
        permutations(str, usedChars, "", new HashSet<>());
    }
}
