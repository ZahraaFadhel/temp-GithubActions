package src.primaryUseCases.checkout;

/**
 * The checkoutBusinessLayer class handles the business logic for the checkout
 * process in the Cinema Management System (CMS). It facilitates user
 * interactions, payment processing, and discount code application while
 * ensuring valid input and data integrity.
 *
 * Key Responsibilities: - Calculate total booking price. - Validate and apply
 * discount codes. - Handle payment processing, supporting both saved and new
 * payment methods. - Ensure secure and valid user input for payment details,
 * enforcing format constraints. - Prompt users for confirmation and allow them
 * to save new payment methods.
 *
 * This class improves the checkout experience by enforcing data validation,
 * ensuring smooth transactions, and maintaining a user-friendly interface.
 */
import java.util.List;
import java.util.Scanner;
import src.dataStore;
import src.dataStore.Booking;
import src.dataStore.SavedPaymentMethod;
import src.helpers.consoleColors;
import src.helpers.validation;

public class checkoutBusinessLayer {

    private final checkoutDataLayer dataLayer;
    private final Scanner scanner;

    /**
     * Constructor to initialize the business layer with the given data layer.
     *
     * @param dataLayer The checkout data layer that handles data-related
     * operations.
     */
    public checkoutBusinessLayer(checkoutDataLayer dataLayer) {
        this.dataLayer = dataLayer; // Instantiate the data layer
        this.scanner = new Scanner(System.in); // Initialize the scanner for user input
    }

    /**
     * Calculates the total price of all bookings in the provided list.
     *
     * @param bookings The list of bookings whose total price is to be
     * calculated.
     * @return The total price of all bookings.
     */
    public static double calculateTotalPrice(List<Booking> bookings) {
        double total = 0;
        for (Booking booking : dataStore.getBookings()) {
            total += booking.getBookingPrice();
        }
        return total;
    }

    /**
     * Prompts the user to enter a discount code and validates it.
     *
     * @return The valid discount code entered by the user, or an empty string
     * if no discount code is entered.
     */
    public String ApplyDiscountCode() {
        while (true) {
            System.out.print(consoleColors.YELLOW_BOLD + "Enter discount code (or press Enter to skip):" + consoleColors.RESET);
            String discountCode = scanner.nextLine().trim();
            if (!discountCode.isEmpty()) {
                String[] words = discountCode.split("\\s+");
                int wordCount = words.length;
                if (wordCount != 1) {
                    System.out.println(consoleColors.RED_BOLD
                            + "Error: The discount code should consist of a single word, try again. (No spaces)"
                            + consoleColors.RESET);
                } else if (!validation.isValidString(discountCode)) {
                    System.out.println(consoleColors.RED_BOLD
                            + "Error: The discount code contains invalid characters. (Only letters, digits, hyphens, and underscores) are allowed."
                            + consoleColors.RESET);
                } else if (!dataLayer.isValidDiscountCode(discountCode)) {
                    System.out.println(consoleColors.RED_BOLD
                            + "Error: The discount code does not exist, try another one, try again."
                            + consoleColors.RESET);
                } else {
                    return discountCode;
                }
            } else {
                // No discount code entered, proceed without applying a discount
                return "";
            }
        }
    }

    /**
     * Applies the given discount code to the price and returns the discounted
     * price.
     *
     * @param discountCode The discount code to apply.
     * @param price The original price to apply the discount to.
     * @return The price after applying the discount.
     */
    public double ApplyDiscountCode(String discountCode, double price) {
        double discountPercentage = dataLayer.getDiscountPercentageByCode(discountCode);
        return price * (1 - discountPercentage / 100);
    }

    /**
     * Prompts the user to proceed to checkout, allowing them to choose between
     * using a saved payment method or entering a new one.
     *
     * @return true if the user successfully proceeds to checkout, false
     * otherwise.
     */
    public boolean proceedToCheckout() {
        while (true) {
            System.out.println();
            System.out.println(consoleColors.GREEN_BOLD + "1. Use a saved payment method" + consoleColors.RESET);
            System.out.println(consoleColors.GREEN_BOLD + "2. Use a new payment method" + consoleColors.RESET);

            // Read the user's choice
            int choice = validation.getValidIntegerInput("Enter your choice: ");

            if (choice < 1 || choice > 2) {
                System.out.print(consoleColors.RED_BOLD + "Invalid input. Please enter a valid number.\n" + consoleColors.RESET);
                continue;
            }

            switch (choice) {
                case 1 -> {
                    return handleSavedPaymentMethod();
                }
                case 2 -> {
                    return handleNewPaymentMethod();
                }
                default ->
                    System.out.println(consoleColors.RED_BOLD + "Error: Wrong input, try again." + consoleColors.RESET);
            }
        }
    }

    /**
     * Handles the use of a saved payment method, if available.
     *
     * @return true if the saved payment method is used successfully, false
     * otherwise.
     */
    private boolean handleSavedPaymentMethod() {
        SavedPaymentMethod savedPaymentMethod = dataStore.getSavedPaymentMethod();
        if (savedPaymentMethod != null) {
            System.out.println(savedPaymentMethod);
            promptForCheckout();
            dataStore.clearAllBookings();
            return true;
        }
        System.out.println(consoleColors.RED_BOLD + "No saved payment method. Please enter a new one." + consoleColors.RESET);
        return false;
    }

    /**
     * Handles the use of a new payment method by validating user input for card
     * details.
     *
     * @return true if the new payment method is processed successfully.
     */
    private boolean handleNewPaymentMethod() {
        System.out.print(consoleColors.GREEN_BOLD + "Enter Card Type (Visa/MasterCard): " + consoleColors.RESET);
        String cardType;
        while (true) {
            cardType = scanner.nextLine().trim();
            if (checkoutDataLayer.isValidCardType(cardType)) {
                break;
            }
            System.out.println(consoleColors.RED_BOLD + "Invalid card type. Please enter Visa or MasterCard." + consoleColors.RESET);
        }

        System.out.print(consoleColors.GREEN_BOLD + "Enter Cardholder Name: " + consoleColors.RESET);
        String cardholderName;
        while (true) {
            cardholderName = scanner.nextLine().trim();
            if (checkoutDataLayer.isValidCardholderName(cardholderName)) {
                break;
            }
            System.out.println(consoleColors.RED_BOLD + "Invalid name. Only letters and spaces are allowed." + consoleColors.RESET);
        }

        System.out.print(consoleColors.GREEN_BOLD + "Enter Card Number: " + consoleColors.RESET);
        String cardNumber;
        while (true) {
            cardNumber = scanner.nextLine().trim();
            if (checkoutDataLayer.isValidCardNumber(cardNumber)) {
                break;
            }
            System.out.println(consoleColors.RED_BOLD + "Invalid card number. It must be exactly 16 digits." + consoleColors.RESET);
        }

        System.out.print(consoleColors.GREEN_BOLD + "Enter Expiry Date (MM/YY): " + consoleColors.RESET);
        String expiryDate;
        while (true) {
            expiryDate = scanner.nextLine().trim();
            if (checkoutDataLayer.isValidExpiryDate(expiryDate)) {
                break;
            }
            System.out.println(consoleColors.RED_BOLD + "Invalid expiry date. Format must be MM/YY." + consoleColors.RESET);
        }

        System.out.print(consoleColors.GREEN_BOLD + "Enter CVV: " + consoleColors.RESET);
        String cvv;
        while (true) {
            cvv = scanner.nextLine().trim();
            if (checkoutDataLayer.isValidCVV(cvv)) {
                break;
            }
            System.out.println(consoleColors.RED_BOLD + "Invalid CVV. It must be exactly 3 digits." + consoleColors.RESET);
        }

        promptForCheckout();
        dataStore.clearAllBookings();

        return handleSavePaymentMethodResponse(cardType, cardholderName, cardNumber, expiryDate, cvv);
    }

    /**
     * Prompts the user to continue with the checkout process.
     */
    private void promptForCheckout() {
        System.out.println(consoleColors.YELLOW_BOLD + "+-----------------+");
        System.out.println("|    CHECKOUT     |");
        System.out.println("+-----------------+");
        System.out.println("Press ENTER to continue..." + consoleColors.RESET);
        scanner.nextLine();
    }

    /**
     * Handles the user's response to save a new payment method.
     *
     * @param cardType The card type (e.g., Visa or MasterCard).
     * @param cardholderName The cardholder's name.
     * @param cardNumber The card number.
     * @param expiryDate The card expiry date.
     * @param cvv The card CVV.
     * @return true if the payment method is processed successfully.
     */
    private boolean handleSavePaymentMethodResponse(String cardType, String cardholderName, String cardNumber, String expiryDate, String cvv) {
        System.out.println(consoleColors.YELLOW_BOLD + "Do you want to save this payment method? (yes/no)" + consoleColors.RESET);
        System.out.println(consoleColors.RED_BOLD + "Note: Previous saved method will be replaced." + consoleColors.RESET);
        String response = scanner.nextLine().trim().toLowerCase();

        if (response.equals("yes")) {
            SavedPaymentMethod newPaymentMethod = new SavedPaymentMethod(cardType, cardholderName, cardNumber, expiryDate, cvv);
            dataStore.updatePaymentMethod(newPaymentMethod);
        }
        return true;
    }

}


