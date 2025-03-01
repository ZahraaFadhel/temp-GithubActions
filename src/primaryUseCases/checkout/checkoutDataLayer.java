package src.primaryUseCases.checkout;

/**
 * The checkoutDataLayer class is responsible for managing checkout-related data
 * in the Cinema Management System (CMS). It facilitates interactions between
 * the business layer and the data storage by providing methods to handle
 * discount codes, payment validations, and cart operations.
 *
 * Key Responsibilities: - Retrieve and validate discount codes, ensuring they
 * exist and apply to transactions. - Manage bookings by fetching the current
 * shopping cart and calculating total price. - Validate payment details
 * including card type, cardholder name, card number, expiry date, and CVV to
 * prevent invalid entries.
 *
 * This class enhances the security and efficiency of the checkout process by
 * ensuring only valid payment and discount information is processed.
 */
import java.util.List;
import src.dataStore.Booking;
import src.dataStore.ValidDiscountCode;
import src.helpers.consoleColors;

public class checkoutDataLayer {

    /**
     * Retrieves all bookings from the dataStore.
     *
     * @return A list of all current bookings.
     */
    public List<Booking> bookings() {
        return src.dataStore.getBookings();
    }

    /**
     * Retrieves all valid discount codes from the dataStore.
     *
     * @return A list of valid discount codes.
     */
    public List<ValidDiscountCode> validDiscountCodes() {
        return src.dataStore.getValidDiscountCodes();
    }

    /**
     * Checks if a given discount code is valid, ignoring case.
     *
     * @param code The discount code to validate.
     * @return true if the discount code is valid, false otherwise.
     */
    public boolean isValidDiscountCode(String code) {
        for (ValidDiscountCode discountCode : src.dataStore.getValidDiscountCodes()) {
            if (discountCode.getCode().equalsIgnoreCase(code)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Retrieves the discount percentage for a given valid discount code.
     *
     * @param discountCode The discount code to check.
     * @return The percentage of discount associated with the code, or 0 if the
     * code is invalid.
     */
    public int getDiscountPercentageByCode(String discountCode) {
        for (ValidDiscountCode validCode : src.dataStore.getValidDiscountCodes()) {
            if (validCode.getCode().equalsIgnoreCase(discountCode)) {
                return validCode.getPercentage();  // Return the discount percentage
            }
        }
        return 0;
    }

    /**
     * Prints the current shopping cart along with the total price.
     */
    public static void printShoppingCart() {
        System.out.println(consoleColors.BLUE_BOLD + "Shopping Cart:" + consoleColors.RESET);
        for (Booking booking : src.dataStore.getBookings()) {
            System.out.println(booking);
        }
        System.out.println(consoleColors.DARK_GREEN_BOLD + "Total Price = " + consoleColors.RESET + checkoutBusinessLayer.calculateTotalPrice(src.dataStore.getBookings()));
        System.out.println();
    }

    

    //-------------------------------------------------------------------------------------------------------------------
    //--------------------------------------- Validate payment informations----------------------------------------------
    //-------------------------------------------------------------------------------------------------------------------

    
    /**
     * Checks if the provided card type is valid (Visa or MasterCard).
     *
     * @param cardType The type of the card to validate.
     * @return true if the card type is valid, false otherwise.
     */
    public static boolean isValidCardType(String cardType) {
        return cardType.equalsIgnoreCase("Visa") || cardType.equalsIgnoreCase("MasterCard");
    }

    /**
     * Validates the cardholder's name to ensure it only contains letters and
     * spaces.
     *
     * @param name The name of the cardholder.
     * @return true if the name is valid, false otherwise.
     */
    public static boolean isValidCardholderName(String name) {
        return name.matches("^[a-zA-Z ]+$"); // Only letters and spaces allowed
    }

    /**
     * Validates the card number to ensure it consists of exactly 16 digits.
     *
     * @param cardNumber The card number to validate.
     * @return true if the card number is valid, false otherwise.
     */
    public static boolean isValidCardNumber(String cardNumber) {
        return cardNumber.matches("^\\d{16}$"); // Exactly 16 digits
    }

    /**
     * Validates the expiry date of the card to ensure it's in MM/YY format.
     *
     * @param expiryDate The expiry date to validate.
     * @return true if the expiry date is valid, false otherwise.
     */
    public static boolean isValidExpiryDate(String expiryDate) {
        return expiryDate.matches("^(0[1-9]|1[0-2])/(\\d{2})$"); // MM/YY format (01-12/YY)
    }

    /**
     * Validates the CVV to ensure it consists of exactly 3 digits.
     *
     * @param cvv The CVV to validate.
     * @return true if the CVV is valid, false otherwise.
     */
    public static boolean isValidCVV(String cvv) {
        return cvv.matches("^\\d{3}$"); // Exactly 3 digits (0-9)
    }
}
