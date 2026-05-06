package gr.aueb.cf.cf9.ch18.bankapp;

import gr.aueb.cf.cf9.ch18.bankapp.controller.AccountController;
import gr.aueb.cf.cf9.ch18.bankapp.core.exceptions.AccountNotFoundException;
import gr.aueb.cf.cf9.ch18.bankapp.core.exceptions.InsufficientBalanceException;
import gr.aueb.cf.cf9.ch18.bankapp.core.exceptions.ValidationException;
import gr.aueb.cf.cf9.ch18.bankapp.dao.AccountDAOImpl;
import gr.aueb.cf.cf9.ch18.bankapp.dao.IAccountDAO;
import gr.aueb.cf.cf9.ch18.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.cf9.ch18.bankapp.service.AccountServiceImpl;
import gr.aueb.cf.cf9.ch18.bankapp.service.IAccountService;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class Main {
        private final static IAccountDAO accountDAO = new AccountDAOImpl();
        private final static IAccountService accountService = new AccountServiceImpl(accountDAO);
        private final static AccountController accountController = new AccountController(accountService);
        private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String option;
        String iban;

        while (true) {
            printMenu();
            option = scanner.nextLine();

            try {
                switch (option) {
                    case "1" -> {
                        System.out.print("Please enter iban: ");
                        iban = scanner.nextLine().trim();
                        System.out.println("Please enter the balance");
                        BigDecimal balance = new BigDecimal(scanner.nextLine().trim());

                        AccountReadOnlyDTO readOnlyDTO = accountController.createNewAccount(iban, balance);
                        System.out.println("The account with iban: " + readOnlyDTO.iban() + " and balance: " +
                                readOnlyDTO.balance() + " is successfully created.");
                    }
                    case "2" -> {
                        System.out.print("Please enter iban: ");
                        iban = scanner.nextLine().trim();
                        System.out.println("Please enter the amount for deposit");
                        BigDecimal depositAmount = new BigDecimal(scanner.nextLine().trim());

                        accountController.deposit(iban, depositAmount);
                        System.out.println("Successful deposit: " + depositAmount + ", Balance: " +
                                accountController.getBalance(iban));
                    }

                    case "3" -> {
                        System.out.print("Please enter iban: ");
                        iban = scanner.nextLine().trim();
                        System.out.println("Please enter the amount for withdraw");
                        BigDecimal withdrawAmount = new BigDecimal(scanner.nextLine().trim());

                        accountController.withdraw(iban, withdrawAmount);
                        System.out.println("Successful withdraw: " + withdrawAmount + ", Balance: " +
                                accountController.getBalance(iban));
                    }

                    case "4" -> {
                        System.out.print("Please enter iban: ");
                        iban = scanner.nextLine().trim();

                        BigDecimal balance = accountController.getBalance(iban);
                        System.out.println("Balance: " + balance);
                    }

                    case "5" -> {
                        List<AccountReadOnlyDTO> readOnlyDTOs = accountController.getAllAccounts();

                        if (readOnlyDTOs.isEmpty()) {
                            System.out.println("There is no accounts");
                        } else {
                            readOnlyDTOs.forEach(System.out::println);
                        }
                    }

                    case "6" -> {
                        System.out.println("Exit...");
                        scanner.close();
                        return;
                    }
                    default -> System.out.println("Not a valid option. Please try again.");
                }
            } catch (AccountNotFoundException e) {
                System.out.println("Account does not exists.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format.");
            } catch (ValidationException e) {
                System.out.println("Wrong validation:" + e.getMessage());
            } catch (InsufficientBalanceException e) {
                System.out.println("Insufficient balance.");
            }
        }

    }

    public static void printMenu() {
        System.out.println("\n=== Service Bank App");
        System.out.println("1. Create (or update) account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Check balance");
        System.out.println("5. Print all accounts");
        System.out.println("6. Exit");
        System.out.println("Please choose one option");
    }
}
