package gr.aueb.cf.cf9.ch7;

import java.util.Scanner;

/**
 * Palindrome is a string that it can be read
 * both ways (start or end).
 */
public class Palindrome {

    public static void main(String[] args) {

    }

    public static boolean isPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
