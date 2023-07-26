package day_seven_java;


public class CalculationMain {
    public static void main(String[] args) {
        Calculation addition = (num1, num2) -> {
            int result = num1 + num2;
            System.out.println("Addition result: " + result);
        };

        Calculation subtraction = (num1, num2) -> {
            int result = num1 - num2;
            System.out.println("Subtraction result: " + result);
        };

        Calculation multiplication = (num1, num2) -> {
            int result = num1 * num2;
            System.out.println("Multiplication result: " + result);
        };

        Calculation division = (num1, num2) -> {
            if (num2 != 0) {
                int result = num1 / num2;
                System.out.println("Division result: " + result);
            } else {
                throw new ArithmeticException("Division by zero!");
            }
        };

        int num1 = 100;
        int num2 = 50;

        addition.calculate(num1, num2);
        subtraction.calculate(num1, num2);
        multiplication.calculate(num1, num2);
        division.calculate(num1, num2);
    }
}
