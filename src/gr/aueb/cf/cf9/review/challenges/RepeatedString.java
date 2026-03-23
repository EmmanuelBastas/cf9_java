package gr.aueb.cf.cf9.review.challenges;

import java.util.Scanner;

/**
 * Given a {@link String} the program returns
 * a String repeated n times.
 */
public class RepeatedString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userStr = "";
        String outputStr = "";
        int times = 0;

        System.out.println("Please enter your sentence and the number of times you want it to be repeated");
        userStr = scanner.nextLine();
        times = scanner.nextInt();

        outputStr = mulStr(userStr, times);
        System.out.println(outputStr);
    }

    public static String mulStr(String userStr, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(userStr);
        }
        return sb.toString();
    }
}
