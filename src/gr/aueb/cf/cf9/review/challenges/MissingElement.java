package gr.aueb.cf.cf9.review.challenges;

/**
 *  Given an array with n elements from 1 to n+1
 *  For example [1, 2, 3, 5]
 *  Find the missing element.
 */
public class MissingElement {

    public static void main(String[] args) {

    }

    public static int findMissingElement(int[] arr) {
        int expectedSum = 0;
        int actualSum = 0;
        int n = 0;

        n = arr.length;
        expectedSum = (n * (n + 1)) / 2;
        for (int item : arr) {
            actualSum += item;
        }
        return expectedSum - actualSum;
    }
}
