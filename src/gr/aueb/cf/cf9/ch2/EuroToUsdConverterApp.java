package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Calculates a price (integer) from EURO to
 * USD based on a currency exchange rate.
 * F.e. 1 euro = 99 USA cents.
 */
public class EuroToUsdConverterApp {

    public static void main(String[] args) {

        // Declaration and initialize of variables
        Scanner scanner = new Scanner(System.in);
        final int exchangeRate = 99;
        int euro = 0;
        int usDollars = 0;
        int usCents = 0;
        int totalUsaCents = 0;

        // Data input
        System.out.println("Please enter currency in euros");
        euro = scanner.nextInt();

        // Data processing -Expressions
        totalUsaCents = euro * exchangeRate;
        usDollars = totalUsaCents / 100;
        usCents = totalUsaCents % 100;

        // Data output
        System.out.printf("%d Euros = %d USA Dollars and %d USA Cents%n", euro, usDollars, usCents);
    }
}
