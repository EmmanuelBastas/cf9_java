package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Division and decimal remainder.
 */
public class DivisionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0.0;
        double num2 = 0.0;
        double result = 0.0;
        double remaining = 0.0;

        System.out.println("Please enter two numbers (doubles): ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();

        result = num1 / num2;  // Division of decimals gives decimal and the division with 0 gives Infinity.
        remaining = num1 % num2; // The remaining is the remaining of the division with the integer part.

        System.out.println("Result: " + result);
        System.out.println("Remaining: " + remaining);
    }
}