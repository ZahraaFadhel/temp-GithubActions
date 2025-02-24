package src.helpers;

/**
 * The validation class handles input validation and manages the scanner. It
 * validates strings and integers, ensuring correct user input.
 */
import java.util.Scanner;

public class validation {

    public static boolean isValidString(String input) {
        // Regular expression to match letters, digits, underscores, and hyphens
        return input.matches("^[a-zA-Z0-9_-]+$");
    }

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Gets a valid integer input from the user, handling invalid inputs.
     * @param prompt The message displayed to the user before input.
     * @return A valid integer entered by the user.
     */
    public static int getValidIntegerInput(String prompt) {
        int number;
        while (true) {
            System.out.print(consoleColors.YELLOW_BOLD + prompt + consoleColors.RESET);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                return number;
            } else {
                System.out.println(consoleColors.RED_BOLD + "Invalid input. Please enter a valid number.\n" + consoleColors.RESET);
                scanner.nextLine(); // Clear the invalid input
            }
        }
    }

    /*
     * Closes the scanner resource. Call this before exiting the program.
     */
    public static void closeScanner() {
        scanner.close();
    }
}
