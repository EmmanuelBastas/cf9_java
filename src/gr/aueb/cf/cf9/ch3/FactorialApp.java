package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Calculate factional of a number.
 * n! = 1 * 2 * 3 * 4 * 5 = 120
 * For instance, 5! = 1 * 2 * 3 * 4 * 5 = 120
 */
public class FactorialApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int factorial = 1;
        int i = 1;

        System.out.println("Please insert a number");
        number = scanner.nextInt();

        while (i <= number) {
            factorial *= i;
            i++;
        }
        System.out.printf("%d! = %d\n", number, factorial);
    }
}
