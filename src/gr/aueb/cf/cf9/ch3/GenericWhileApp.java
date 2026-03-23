package gr.aueb.cf.cf9.ch3;

/**
 * We give starting value, final value, loop steps
 * and the program calculates the amount of repeats.
 */
public class GenericWhileApp {

    public static void main(String[] args) {
        int i = 1;
        int endVal = 10;

        while  (i <= endVal) {
            System.out.println("i = " + i);
            i++;
        }

        System.out.println("Loops / Iterations: " + (i - 1));
    }
}
