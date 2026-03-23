package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * User inserts 2 values, numerator and denominator
 * and the program tries to calculate the quotient, repeatedly.
 *
 * If the numerator is 0, then the program stops.
 * if the denominator is 0, then the process repeats.
 */
public class DivisionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Please enter a numerator: ");
            numerator = scanner.nextInt();

            if (numerator == 0) {
                System.out.println("Numerator is 0. Quiting...");
                break;
            }

            System.out.println("Please entera denominator: ");
            denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("Denominator is 0. Quiting...");
                continue;
            }

            result = numerator / denominator;
            System.out.println("The result is: " + result);
        }
    }
}
