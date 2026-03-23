package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Calculate the power of a number, a^n.
 * a^n = a * a * a * ... * a
 * (n times)
 */
public class PowerApp {

    public static void main(String[] args) {

        // Declaration and initialization of variables
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        // Data entry and mapping to variables
        System.out.println("Please insert the base and the power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        // Data processing - While - do
        while (i <= power) {
            result *= base;
            i++;
        }

        // Print of result
        System.out.printf("%d ^ %d = %d\n", base, power, result);
    }
}
