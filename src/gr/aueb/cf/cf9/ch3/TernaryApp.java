package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Ternary operator demo. Calculates the
 * smallest between two integers that the
 * user gives.
 */
public class TernaryApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("Please enter two numbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

//        if (num1 < num2) {
//            min = num1;
//        } else {
//            min = num2;
//        }

        //Conditional Assignment
        min = num1 < num2 ? num1 : num2;

        System.out.println("The smallest number is: " + min
        );
    }
}
