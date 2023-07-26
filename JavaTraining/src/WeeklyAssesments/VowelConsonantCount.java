package WeeklyAssesments;

import java.util.Scanner;

public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;
        int spaceCount = 0;

        input = input.toLowerCase(); // Convert the input to lowercase for easier comparison

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a letter
                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } 
                else if(ch == ' ') {
                	spaceCount++;
                }
                else {
                    consonantCount++;
                }
            }
        System.out.println("Vowels: " + vowelCount +" Consonants: " + consonantCount );
    }
}
