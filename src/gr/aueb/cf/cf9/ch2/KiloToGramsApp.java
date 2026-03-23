package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * The user inserts the weight in kilograms, and the program calculates
 * the weight in grams.
 *
 */
public class KiloToGramsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int KILOS_IN_GRAMS = 1000;
        int inputKilos = 0;
        int grams = 0;

        System.out.println("Please insert your weight");
        inputKilos = scanner.nextInt();
        grams = inputKilos * KILOS_IN_GRAMS;

        System.out.printf("Weight in Kilos: %d, Weight in Grams: %,d%n", inputKilos, grams);
    }
}
