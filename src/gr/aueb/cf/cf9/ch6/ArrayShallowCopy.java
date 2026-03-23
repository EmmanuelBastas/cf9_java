package gr.aueb.cf.cf9.ch6;

/**
 * When we copy references that copy
 * is named shallow and has side effects.
 */
public class ArrayShallowCopy {

    public static void main(String[] args) {
     int[] arr1 = {1, 2, 3, 4, 5};
     int[] arr2 = arr1;             // Shallow copy

     arr2[0] = 1000;
        System.out.println(arr1[0]);
    }
}
