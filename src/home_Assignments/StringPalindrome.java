package home_Assignments;

import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        StringBuilder reversed = new StringBuilder();
        for (int i = str1.length() - 1; i >= 0; i--) {
            reversed.append(str1.charAt(i));
        }
        if (reversed.toString().equals(str1)) {
            System.out.println("string is palindromes");
        } else {
            System.out.println("string is not a palindrome");
        }
    }
}
