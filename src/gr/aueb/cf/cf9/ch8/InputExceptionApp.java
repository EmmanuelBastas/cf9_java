package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

/**
 * The {@link java.util.InputMismatchException} occurs
 * when the {@link java.util.Scanner} fails to reads
 * the right data type.
 */
public class InputExceptionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please enter one int: ");
        // num = scanner.nextInt();

        while (!scanner.hasNextInt()) {
            System.out.println("Not acceptable characters");
            scanner.nextLine();
        }

        num = scanner.nextInt();
        System.out.println("Num: " + num);
    }
}
