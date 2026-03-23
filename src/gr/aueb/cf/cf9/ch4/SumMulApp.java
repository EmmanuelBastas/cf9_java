package gr.aueb.cf.cf9.ch4;

/**
 * Calculates and print the summit
 * of the first 10 integers.
 */
public class SumMulApp {

    public static void main(String[] args) {

        int sum = 0;
        int mul = 1;

        for (int i = 1; i <= 10; i++) {
            sum = sum + i; //sum += i;
            mul = mul * i; //mul *= i;
        }

        System.out.println("Sum = " + sum);
        System.out.println("Product = " + mul);
    }
}
