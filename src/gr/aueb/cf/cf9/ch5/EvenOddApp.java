package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * It defines two methods, isEven and isOdd,
 * to check if an integer is even or odd.
 */
public class EvenOddApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

        if (isEven(num)) {
            System.out.println("The number is even!");
        }

        if (isOdd(num)) {
            System.out.println("The number is odd!");
        }
    }

    public static boolean isEven(int a) {
        return a % 2 ==0;
    }

    public static boolean isOdd(int a) {
        return a % 2 !=0;   // return !isEven(num);
    }
}
