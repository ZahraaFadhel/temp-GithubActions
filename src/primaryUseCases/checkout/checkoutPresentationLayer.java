package src.primaryUseCases.checkout;

/**
 * The checkoutPresentationLayer class serves as the user interface for handling
 * the checkout process in the Cinema Management System (CMS). It provides an
 * interactive menu-driven system that guides users through the checkout
 * process, applying discounts, and selecting payment methods.
 *
 * Key Responsibilities: - Display the shopping cart and total booking price. -
 * Allow users to apply discount codes and reflect the discounted price. - Guide
 * users through the checkout process, including payment method selection. -
 * Provide an option to return to the main menu or exit the system. - Ensure
 * proper validation and error handling to enhance the user experience.
 *
 * This class enhances the checkout process by ensuring a structured and
 * user-friendly interaction, improving accessibility and ease of use.
 */
import java.util.Scanner;
import src.dataStore;
import src.helpers.*;

public class checkoutPresentationLayer {

    private final checkoutBusinessLayer businessLayer;
    private final Scanner scanner;

    /**
     * Constructor to initialize the checkoutPresentationLayer with a business
     * layer.
     *
     * @param businessLayer The business layer for checkout operations.
     */
    public checkoutPresentationLayer(checkoutBusinessLayer businessLayer) {
        this.businessLayer = businessLayer;
        this.scanner = new Scanner(System.in);
    }

    /**
     * Starts the checkout process by displaying the menu, handling discount
     * codes, and guiding the user through the checkout process.
     */
    public void start() {
        System.out.println(consoleColors.BLUE_BOLD + "\n--- Checkout ---" + consoleColors.RESET);
        if (dataStore.getBookings().isEmpty()) {
            System.out.println(consoleColors.RED_BOLD + "Sorry Shopping cart is empty, come back after booking tickets" + consoleColors.RESET);
            return;
        }
        checkoutDataLayer.printShoppingCart();
        double price = checkoutBusinessLayer.calculateTotalPrice(src.dataStore.getBookings());
        String discountCode = businessLayer.ApplyDiscountCode();
        if (!discountCode.isEmpty()) {
            price = businessLayer.ApplyDiscountCode(discountCode, price);
            System.out.println(consoleColors.GREEN_BOLD + "Discount code applied successfully :)" + consoleColors.RESET);
            System.out.println(consoleColors.DARK_GREEN_BOLD + "Discounted Total Price = " + consoleColors.RESET + price);
        }
        System.out.println();

        System.out.println(consoleColors.GREEN_BOLD + "1. Proceed to checkout" + consoleColors.RESET);
        System.out.println(consoleColors.GREEN_BOLD + "2. Go back to the main menu" + consoleColors.RESET);
        System.out.println(consoleColors.RED_BOLD + "3. Exit" + consoleColors.RESET);
        System.out.print(consoleColors.YELLOW_BOLD + "Enter your choice: " + consoleColors.RESET);

        while (true) {

            // Read the user's choice
            int choice = validation.getValidIntegerInput("Enter your choice: ");

            if (choice > 3 || choice < 1) {
                System.out.print(consoleColors.RED_BOLD + "Invalid input. Please enter a valid number.\n" + consoleColors.RESET);
                continue;
            }

            // Perform the selected operation based on the user's choice
            switch (choice) {
                case 1:
                    if (businessLayer.proceedToCheckout()) {
                        returnToMainMenu();
                        return;
                    }
                case 2:
                    System.out.println(consoleColors.YELLOW_BOLD + "Processing... \n" + consoleColors.RESET);
                    return;
                case 3:
                    System.out.println(consoleColors.YELLOW_BOLD + "\nExiting the system. Goodbye!" + consoleColors.RESET);
                    System.exit(0);  // Exit the application
            }
        }
    }

    /**
     * Prompts the user to confirm if they want to return to the main menu or
     * exit. Based on the user input, either returns to the main menu or exits
     * the system.
     */
    private void returnToMainMenu() {
        System.out.println(consoleColors.YELLOW_BOLD + "Go Back? (y/n)" + consoleColors.RESET);
        System.out.print(consoleColors.YELLOW_BOLD + "Enter your choice: " + consoleColors.RESET);

        String choice = scanner.nextLine().trim().toLowerCase();

        while (!(choice.equals("y") || choice.equals("n"))) {
            if (choice.length() != 1 || !choice.matches("[yn]")) {
                System.out.println(consoleColors.RED_BOLD + "Invalid choice. Please enter 'y' or 'n'." + consoleColors.RESET);
            }
            System.out.print(consoleColors.YELLOW_BOLD + "Enter your choice: " + consoleColors.RESET);
            choice = scanner.nextLine().trim().toLowerCase();
        }

        switch (choice) {
            case "y":
                System.out.println(consoleColors.YELLOW_BOLD + "\nReturning to browsing menu >>>" + consoleColors.RESET);
                break;
            case "n":
                System.out.println(consoleColors.RED_BOLD + "Exiting the system. Goodbye!" + consoleColors.RESET);
                System.exit(0);
            default:
                System.out.println(consoleColors.RED_BOLD + "Invalid choice, Returning to main menu." + consoleColors.RESET);
                break;
        }
    }
}
