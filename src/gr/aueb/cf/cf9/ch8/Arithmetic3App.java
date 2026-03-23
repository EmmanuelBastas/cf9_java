package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

public class Arithmetic3App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        while (true) {
            System.out.println("Please enter two integers");
            num1 = scanner.nextInt();
            if (num1 == 0) break;

            num2 = scanner.nextInt();

            // Validation instead of try catch, state-test
            if (num2 == 0) {
                System.out.println("The denominator can't be zero");
                continue;
            }

            result = num1 / num2;
            System.out.println("Result: " + result);
        }
    }
}
