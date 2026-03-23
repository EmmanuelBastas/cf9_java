package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 * Calculate the maximum value of an array.
 */
public class ArrayMax {

    public static void main(String[] args) {

        // Declaration and initialization of variables
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 5;
        int[] numbers = new int[SIZE];
        int maxPosition = 0;
        int maxValue = 0;

        // Data entry, Validation and Data Binding
        System.out.println("Please enter five integers: ");
        for (int i = 0; i < numbers.length; i++) {

            //Validate input
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid output. Please enter an inetger.");
                scanner.nextLine();
            }
            numbers[i] = scanner.nextInt();
        }

        // Delegation - calls services / methods
        maxPosition = findMaxPosition(numbers);
        maxValue = numbers[maxPosition];

        // Print of Result
        System.out.printf("The maximum value is %d at position %d.\n", maxValue, (maxPosition + 1));
    }

    /**
     * Find the position of the maximum value in an array.
     * @param arr   the input array.
     * @return      tje position of the maximum value.
     */
    public static int findMaxPosition(int[] arr) {
        if (arr == null || arr.length == 0) return Integer.MIN_VALUE;
        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}
