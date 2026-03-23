package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * User gives his age in years (integer)
 * and the program returns it in days. (1 year = 365 days)
 * For example if the age is 20 years the result is 7300 days.
 */
public class YearsToDaysApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int DAYS_IN_YEAR = 365;
        int inputAgeInYears = 0;
        int ageInDays = 0;

        System.out.println("Please insert your age");
        inputAgeInYears = scanner.nextInt();
        ageInDays = inputAgeInYears * DAYS_IN_YEAR;

        System.out.printf("Age in years: %d, Age in days: %,d%n", inputAgeInYears, ageInDays);


    }
}
