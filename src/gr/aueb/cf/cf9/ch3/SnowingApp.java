package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * The user inserts the temperature in Celsius, and
 * the status of isRaining variable and calculates
 * if it is raining and the temperature is below 0,
 * it is snowing.
 */
public class SnowingApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isRaining = false;
        boolean isSnowing = false;

        System.out.printf("Please insert if it rains (true/false)");
        isRaining = scanner.nextBoolean();
        System.out.printf("Please insert the temperature");
        temperature = scanner.nextInt();

        isSnowing = isRaining && (temperature < 0);
        System.out.println("Is snowing: " + isSnowing);
    }
}
