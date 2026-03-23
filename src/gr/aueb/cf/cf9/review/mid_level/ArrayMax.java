package gr.aueb.cf.cf9.review.mid_level;

public class ArrayMax {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5};
        int max = maxValue(arr);
        System.out.println(max);
    }

    public static int maxValue(int[] arr) {
        if (arr == null || arr.length == 0) return Integer.MIN_VALUE;
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
}
