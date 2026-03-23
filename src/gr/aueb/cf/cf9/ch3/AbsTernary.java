package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Calculates the absolute of an integer using
 * the ternary operator. The absolute of an integer
 * is always a positive number. For example the
 * absolute of -5 is 5 and the absolute of 5 is 5.
 */
public class AbsTernary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        // User Input
        System.out.println("Please insert an integer: ");
        num = scanner.nextInt();

        // Data process
//        if (num >= 0) {
//            abs = num;
//        } else {
//            abs = -num;
//        }

        abs = (num >= 0) ? num : -num; // expression - syntactic sugar
    }
}
