package gr.aueb.cf.cf9.review.challenges;

import java.util.Scanner;

/**
 * Given a string, convert it to alternating uppercase and lowercase letters.
 * Example: coding → CoDiNg
 */
public class UpperLowerCaseApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String inputStr = "";
        char ch = ' ';

        // Data entry
        System.out.println("Please enter a string");
        inputStr =scanner.nextLine();

        // Edit - Business
        for (int i = 0; i < inputStr.length(); i++) {
            ch = inputStr.charAt(i);
            if (Character.isLowerCase(ch)) {
                ch = i % 2 == 0 ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
                sb.append(ch);
            }
        }

        System.out.println(sb);
    }
}
