package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * The user tries to guess a secret number.
 */
public class SecretApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 42;
        int num = 0;

        System.out.println("Please enter a number to guess the secret one: ");
        num = scanner.nextInt();

        if (num == SECRET) {
            System.out.println("Congratulations you guess the secret number!!!");
        } else {
            System.out.println("Sorry, wrong guess.");
        }
    }
}
