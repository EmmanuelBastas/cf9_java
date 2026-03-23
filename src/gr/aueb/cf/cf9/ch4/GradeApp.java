package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * It receives a grade from the user and
 * depending on the rating scale displays
 * the appropriate message.
 */
public class GradeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = 0;

        System.out.println("Please type the grade: ");
        grade = scanner.nextInt();

        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Below the base");
                break;
            case 5:
            case 6:
                System.out.println("Good");
                break;
            case 7:
            case 8:
                System.out.println("Very good");
                break;
            case 9:
            case 10:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("The grade must be between 1-10");
                break;
        }
    }
}
