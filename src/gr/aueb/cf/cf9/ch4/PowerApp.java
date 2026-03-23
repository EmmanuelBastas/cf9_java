package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * User inserts base and power and the
 * program calculates base^power, f.e.
 * 2^10 = 1024.
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;

        // Data entry and mapping to variables
        System.out.println("Please insert the base and the power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        // Data processing
        for (int i = 1; i <= power; i++) {
            result *= base;
        }

        // Print of result
        System.out.printf("%d ^ %d = %d\n", base, power, result);
    }
}
