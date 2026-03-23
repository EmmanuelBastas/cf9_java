package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class Menu2App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("Please choose one of the below");
            System.out.println("1. Import Request");
            System.out.println("2. Delete Request");
            System.out.println("3. Exit");
            choice = scanner.nextInt();
            if (choice == 3) {
                break;
            }
        }

        System.out.println("Thanks for using the program");
    }
}


