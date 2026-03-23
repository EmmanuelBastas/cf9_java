package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;
/**
 * User inserts base and power and the
 * program calculates base^power via a
 * method.
 */
public class PowerMethodApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;


        // Data entry and mapping to variables
        System.out.println("Please insert the base and the power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        result = pow(base, power);

        System.out.printf("%d ^ %d = %d\n", base, power, result);
    }

    public static int pow(int a, int b) {
        int result = 1;

        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }
}
