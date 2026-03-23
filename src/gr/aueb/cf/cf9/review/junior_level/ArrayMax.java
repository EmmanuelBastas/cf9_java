package gr.aueb.cf.cf9.review.junior_level;


/*
    The variables a, m aren't good names.
    The code could be a method.
    There is no documentation
    There is not a check for an empty array
    There is not structure
    It doesn't have SoC
 */
public class ArrayMax {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5};
        int m = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > m) {
                m = a[i];
            }
        }
        System.out.println(m);
    }
}
