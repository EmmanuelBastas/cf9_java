package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 * Create a message that contains the name of the user and the age.
 */
public class StrConCat {

    public static void main(String[] args) {

        // Declaration and initialization of variables
        Scanner scanner = new Scanner(System.in);
        String firstname = "";
        int age = 0;
        String message = "";

        // Data entry via scanner, Validation and Data Binding
        System.out.println("Please enter your first name: ");
        firstname = scanner.nextLine();

        //Validate input
        System.out.println("Please enter your age: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid output. Please enter a number: ");
            scanner.nextLine();
        }
        age = scanner.nextInt();

        // Calls service / method
        message = createMessage(firstname, age);

        // Print of Result
        System.out.println(message);
    }

    /**
     * Create a message that contains the name of the user and the age.
     * @param firstname     the user's first name.
     * @param age           the user's age.
     * @return              the message.
     */
    public static String createMessage(String firstname, int age) {
        return String.format("Hello, my name is %s and I am %d years old.", firstname, age);
    }
}
