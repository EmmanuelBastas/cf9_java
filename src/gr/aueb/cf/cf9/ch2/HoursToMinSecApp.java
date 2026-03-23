package gr.aueb.cf.cf9.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Calc Hours to Minutes and Seconds for a given number of hours.
 */
public class HoursToMinSecApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int HOUR_TO_MINUTE = 60;
        final int HOUR_TO_SECONDS = 3600;
        int hours = 0;
        int mins = 0;
        int secs = 0;

        System.out.println("Please insert the number of hours:");
        hours = scanner.nextInt();
        mins = hours * HOUR_TO_MINUTE;
        secs = hours * HOUR_TO_SECONDS;

        System.out.printf(Locale.US, "The number of minutes is: %,d%n", mins);
        System.out.printf(Locale.forLanguageTag("el"), "The number of seconds is: %,d%n", secs);
    }
}
