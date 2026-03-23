package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * We display a menu to the user.
 * The user gives a choice, and we
 * give him feedback.
 */
public class SwitchApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        final int EXIT = 4;

        do {
            System.out.println("Please choose one of the following: ");
            System.out.println("1. One-player game");
            System.out.println("2. Two=player game");
            System.out.println("3. Team game");
            System.out.println("4. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Start one-player game");
                    break;
                case 2:
                    System.out.println("Start two-player game");
                    break;
                case 3:
                    System.out.println("Start team game");
                    break;
                case 4:
                    System.out.println("Exit game");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;
            }
        } while (choice != EXIT);
    }
}
