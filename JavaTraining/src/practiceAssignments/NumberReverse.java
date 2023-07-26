package practiceAssignments;

import java.util.Scanner;

public class NumberReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reversedNumber = 0;
        for (int i = number; i > 0; i /= 10) {
            int remainder = i % 10;
            reversedNumber = reversedNumber * 10 + remainder;
        }
        System.out.println("The reversed number is: " + reversedNumber);
    }
}

