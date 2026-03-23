package gr.aueb.cf.cf9.ch6;

/**
 * Checks if an array is symmetric or not.
 * Symmetric is an array that can be read
 * with the same order either from the
 * start or the end.
 * For example, [1, 2, 3, 3, 2, 1]
 * [1, 2, 3, 2, 1]
 *
 */
public class ArraySymmetric {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6,};

    }

    public static boolean isArraySymmetric(int[] arr) {
//        boolean isSymmetric = true;

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
//                isSymmetric = false;
//                break;
                return false;
            }
        }
//        return isSymmetric;
        return true;
    }
}
