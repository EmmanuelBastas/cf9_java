package gr.aueb.cf.cf9.review.challenges;

import java.util.Scanner;

/**
 * An Armstrong number is a number that is equal
 * to the sum of its digits, where each digit is
 * raised to the power of the number of digits.
 *
 * For example, 153 = 1³ + 5³ + 3³
 */
public class Armstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int initialNum = 0;
        int numberOfDigits = 0;
        int digit = 0;
        int sum = 0;

        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

        numberOfDigits = String.valueOf(num).length();

        initialNum = num;
        while (num != 0) {
            digit = num % 10;
            sum += (int) Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        System.out.printf("%d%s Armstrong\n", initialNum, (sum == initialNum) ? " is" : " is not");
    }
}
