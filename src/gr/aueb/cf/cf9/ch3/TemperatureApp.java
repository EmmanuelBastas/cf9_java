package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * A temperature app in that the user inserts
 * a temperature and the program makes the
 * calculations according to boolean method.
 */
public class TemperatureApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isTempBelowZero = false;

        System.out.printf("Please insert temperature");
        temperature = scanner.nextInt();

        isTempBelowZero = temperature < 0;

        System.out.printf("The temperature is below 0: " + isTempBelowZero);
    }
}
