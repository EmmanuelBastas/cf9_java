package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

/**
 * Creating an {@link ArithmeticException} without
 * controlling it.
 */
public class Arithmetic1App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Please enter two numbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        //result = num1 / num2;           // If num2 == 0 we will get an ArithmeticException
        result = div(num1, num2);
        System.out.println("Result: " + result);            // This line will not be executed
    }

    public static int div(int num1, int num2) {
        return num1 / num2;
    }
}
