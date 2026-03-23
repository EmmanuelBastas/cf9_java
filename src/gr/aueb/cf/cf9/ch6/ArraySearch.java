package gr.aueb.cf.cf9.ch6;

import java.util.Scanner;

/**
 * Search for an element in an array.
 */
public class ArraySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = null;
        int value = 0;
        int position = 0;

        System.out.println("Please enter a value to search for: ");
        value = scanner.nextInt();

        position = getPosition(arr, value);

        if (position == -1) {
            System.out.println("Value not found");
        } else {
            System.out.println("Value: " + value + " found at position: " + (position + 1));
        }
    }

    /**
     * Returns the position of the first element of the array
     * that equals the search value. If it doesn't
     * exist the element returns -1.
     * @param arr       the input array.
     * @param value     the value of search.
     * @return          the position of the array
     *                  that the element was found
     *                  otherwise -1.
     */
    public static int getPosition(int[] arr, int value) {
        if (arr == null) return -1;

        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {          // comparison
                positionToReturn = i;
                break;
            }
        }

        return positionToReturn;
    }

    public static int getPosition2(int[] arr, int value) {
        if (arr == null) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {          // comparison
                return i;
            }
        }

        return -1;
    }
}
