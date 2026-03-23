package gr.aueb.cf.cf9.ch8;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * The {@link BankApp} provides one deposit service.
 */
public class BankApp {
    static double balance = 0.0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = 0.0;

        try {
            System.out.println("Please enter an amount to deposit: ");
            amount = scanner.nextDouble();
            deposit(amount);
            System.out.println("Balance after deposit: " + balance);
        } catch (Exception e) {
            System.out.println("A negative amount cannot be deposited.");
        }

    }

    /**
     * Deposit an amount of money.
     * @param amount            the amount to deposit.
     * @throws Exception        if the amount is negative.
     */

    public static void deposit(double amount) throws Exception {
        try {
            if (amount < 0) throw new Exception("Amount cannot be negative");
            balance += amount;
            // logging
        } catch (Exception e) {
            System.err.println(LocalDateTime.now() + "\n" + e.getMessage());        // logging
            throw e;        // re-throwing the exception
        }
    }
}
