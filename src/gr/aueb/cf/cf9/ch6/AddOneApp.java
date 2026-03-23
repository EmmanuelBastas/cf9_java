package gr.aueb.cf.cf9.ch6;

/**
 * Suppose we represent large integers in a table.
 * We want to add the unit.
 */
public class AddOneApp {

    public static void main(String[] args) {


    }

    /**
     * Adds one unit to an array that represents
     * an integer.
     * @param arr  the input array.
     * @return     an array with the result.
     */
    public static int[] addOne(int[] arr) {
        if (arr == null) return new int[0];
        int[] arrOut = new int[arr.length + 1];
        int sum = 0;
        int carry = 1;

        for (int i = arr.length - 1; i >= 0; i++) {
            sum = arr[i] + carry;
            arrOut[i + 1] = sum % 10;
            carry = sum / 10;
        }

        if (carry == 1) {
            arrOut[0] = 1;
        }

        return arrOut;
    }
}
