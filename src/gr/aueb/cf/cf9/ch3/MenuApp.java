package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Reveals a menu until the user
 * choose exit.
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Please choose one of the below");
            System.out.println("1. Import Request");
            System.out.println("2. Delete Request");
            System.out.println("3. Exit");
            choice = scanner.nextInt();
        } while (choice != 3);

        System.out.println("Thanks for using the program");
    }
}
