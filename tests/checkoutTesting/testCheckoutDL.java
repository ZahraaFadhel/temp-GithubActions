/**
 * Test Class for Checkout Data Layer
 * Tests valid and invalid scenarios for discount codes, card details, and bookings.
 */
package tests.checkoutTesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import src.primaryUseCases.checkout.checkoutDataLayer;
import src.dataStore.*;

public class testCheckoutDL {

    private checkoutDataLayer checkoutDL;

    @BeforeEach
    public void setUp() {
        checkoutDL = new checkoutDataLayer();
        new src.dataStore();
    }

    @Nested
    class SuccessCases {
        /**
         * Test: Bookings Initialization
         * Verifies that bookings are initialized correctly.
         */
        @Test
        public void testBookings() {
            List<Booking> bookings = checkoutDL.bookings();
            assertNotNull(bookings, "Bookings list should not be null");
            assertEquals(4, bookings.size(), "DataStore contains 4 sample bookings ensure they were initialized correctly");
        }

        /**
         * Test: Valid Discount Codes
         * Verifies that valid discount codes are initialized correctly.
         */
        @Test
        public void testValidDiscountCodes() {
            List<ValidDiscountCode> discountCodes = checkoutDL.validDiscountCodes();
            assertNotNull(discountCodes, "Discount codes list should not be null");
            assertEquals(3, discountCodes.size(), "DataStore contains 3 sample discount codes ensure they were initialized correctly");
        }

        /**
         * Test: Valid Discount Code Check
         * Verifies that valid discount codes are recognized (case-insensitive and with spaces).
         */
        @Test
        public void testIsValidDiscountCode() {
            assertTrue(checkoutDL.isValidDiscountCode("NEWYEAR25"));
            assertTrue(checkoutDL.isValidDiscountCode("eidmubarak15"), "Valid discount code (case insensitive)");
            assertTrue(checkoutDL.isValidDiscountCode("NEWYEAR25 "), "Trailing space should be a valid discount code");
            assertTrue(checkoutDL.isValidDiscountCode(" NEWYEAR25"), "Leading space should be a valid discount code");
        }

        /**
         * Test: Discount Percentage by Code
         * Verifies that the correct discount percentage is returned for valid codes.
         */
        @Test
        public void testGetDiscountPercentageByCode() {
            assertEquals(25, checkoutDL.getDiscountPercentageByCode("NEWYEAR25"));
            assertEquals(15, checkoutDL.getDiscountPercentageByCode("EIDMUBARAK15"));
            assertEquals(25, checkoutDL.getDiscountPercentageByCode("NEWYEAR25 "), "Trailing space should return 25% discount");
            assertEquals(25, checkoutDL.getDiscountPercentageByCode(" NEWYEAR25"), "Leading space should return 25% discount");
        }

        /**
         * Test: Valid Card Type
         * Verifies that valid card types are recognized (case-insensitive).
         */
        @Test
        public void testIsValidCardType() {
            assertTrue(checkoutDataLayer.isValidCardType("Visa"));
            assertTrue(checkoutDataLayer.isValidCardType("MasterCard"));
            assertTrue(checkoutDataLayer.isValidCardType("VISA"), "Valid card type (case insensitive)");
            assertTrue(checkoutDataLayer.isValidCardType("MASTERCARD"), "Valid card type (case insensitive)");
        }

        /**
         * Test: Valid Cardholder Name
         * Verifies that valid cardholder names are recognized.
         */
        @Test
        public void testIsValidCardholderName() {
            assertTrue(checkoutDataLayer.isValidCardholderName("John Doe"));
            assertTrue(checkoutDataLayer.isValidCardholderName("Alice"));
        }

        /**
         * Test: Valid Card Number
         * Verifies that valid card numbers are recognized.
         */
        @Test
        public void testIsValidCardNumber() {
            assertTrue(checkoutDataLayer.isValidCardNumber("1234567890123456"));
        }

        /**
         * Test: Valid Expiry Date
         * Verifies that valid expiry dates are recognized.
         */
        @Test
        public void testIsValidExpiryDate() {
            assertTrue(checkoutDataLayer.isValidExpiryDate("12/25"));
            assertTrue(checkoutDataLayer.isValidExpiryDate("01/30"));
        }

        /**
         * Test: Valid CVV
         * Verifies that valid CVVs are recognized (with leading/trailing spaces).
         */
        @Test
        public void testIsValidCVV() {
            assertTrue(checkoutDataLayer.isValidCVV("123"));
            assertTrue(checkoutDataLayer.isValidCVV("123 "), "123 with trailing space should be a valid CVV");
            assertTrue(checkoutDataLayer.isValidCVV(" 123"), "123 with leading space should be a valid CVV");
        }
    }

    @Nested
    class FailureCases {
        /**
         * Test: Invalid Discount Code
         * Verifies that invalid discount codes are not recognized.
         */
        @Test
        public void testIsValidDiscountCode() {
            assertFalse(checkoutDL.isValidDiscountCode("INVALIDCODE"), "Invalid discount code does not exist");
        }

        /**
         * Test: Invalid Discount Percentage
         * Verifies that invalid discount codes return 0% discount.
         */
        @Test
        public void testGetDiscountPercentageByCode() {
            assertEquals(0, checkoutDL.getDiscountPercentageByCode("INVALIDCODE"), "INVALIDCODE should return 0% discount");
            assertEquals(0, checkoutDL.getDiscountPercentageByCode(""), "Empty string should return 0% discount");
        }

        /**
         * Test: Invalid Card Type
         * Verifies that invalid card types are not recognized.
         */
        @Test
        public void testIsValidCardType() {
            assertFalse(checkoutDataLayer.isValidCardType("Amex"), "Not visa or mastercard so should not be a valid card type");
            assertFalse(checkoutDataLayer.isValidCardType(""), "Empty string should not be a valid card type");
            assertFalse(checkoutDataLayer.isValidCardType(null), "Null input should not be a valid card type");
        }

        /**
         * Test: Invalid Cardholder Name
         * Verifies that invalid cardholder names are not recognized.
         */
        @Test
        public void testIsValidCardholderName() {
            assertFalse(checkoutDataLayer.isValidCardholderName("John123"), "Contains numbers should not be a valid cardholder name");
            assertFalse(checkoutDataLayer.isValidCardholderName("John@Doe"), "Contains special characters should not be a valid cardholder name");
            assertFalse(checkoutDataLayer.isValidCardholderName(""), "Empty string should not be a valid cardholder name");
            assertFalse(checkoutDataLayer.isValidCardholderName(null), "Null input should not be a valid cardholder name");
            assertFalse(checkoutDataLayer.isValidCardholderName("John Doe123"), "Contains numbers should not be a valid cardholder name");
            assertFalse(checkoutDataLayer.isValidCardholderName("John-Doe"), "Contains special characters should not be a valid cardholder name");
        }

        /**
         * Test: Invalid Card Number
         * Verifies that invalid card numbers are not recognized.
         */
        @Test
        public void testIsValidCardNumber() {
            assertFalse(checkoutDataLayer.isValidCardNumber("1234"), "Should not be a valid card number (too short)");
            assertFalse(checkoutDataLayer.isValidCardNumber("12345678901234567"), "Should not be a valid card number (too long)");
            assertFalse(checkoutDataLayer.isValidCardNumber("123456789012345a"), "Should not be a valid card number (contains letters)");
            assertFalse(checkoutDataLayer.isValidCardNumber(""), "Empty string should not be a valid card number");
            assertFalse(checkoutDataLayer.isValidCardNumber(null), "Null input should not be a valid card number");
            assertFalse(checkoutDataLayer.isValidCardNumber("1234 5678 9012 3456"), "Card number with spaces should not be valid");
            assertFalse(checkoutDataLayer.isValidCardNumber("1234-5678-9012-3456"), "Card number with hyphens should not be valid");
        }

        /**
         * Test: Invalid Expiry Date
         * Verifies that invalid expiry dates are not recognized.
         */
        @Test
        public void testIsValidExpiryDate() {
            assertFalse(checkoutDataLayer.isValidExpiryDate("13/25"), "Should not be a valid expiry date (invalid month)");
            assertFalse(checkoutDataLayer.isValidExpiryDate("00/25"), "Should not be a valid expiry date (invalid month)");
            assertFalse(checkoutDataLayer.isValidExpiryDate("12/2025"), "Should not be a valid expiry date (invalid format)");
            assertFalse(checkoutDataLayer.isValidExpiryDate("12/25/2025"), "Should not be a valid expiry date (invalid format)");
            assertFalse(checkoutDataLayer.isValidExpiryDate(""), "Empty string should not be a valid expiry date");
            assertFalse(checkoutDataLayer.isValidExpiryDate(null), "Null input should not be a valid expiry date");
            assertFalse(checkoutDataLayer.isValidExpiryDate("12-25"), "Should not be a valid expiry date (incorrect separator)");
            assertFalse(checkoutDataLayer.isValidExpiryDate("12/5"), "Should not be a valid expiry date (invalid year format)");
        }

        /**
         * Test: Invalid CVV
         * Verifies that invalid CVVs are not recognized.
         */
        @Test
        public void testIsValidCVV() {
            assertFalse(checkoutDataLayer.isValidCVV("12"), "Should not be a valid CVV (too short)");
            assertFalse(checkoutDataLayer.isValidCVV("1234"), "Should not be a valid CVV (too long)");
            assertFalse(checkoutDataLayer.isValidCVV("12a"), "Should not be a valid CVV (contains letters)");
            assertFalse(checkoutDataLayer.isValidCVV(""), "Empty string should not be a valid CVV");
            assertFalse(checkoutDataLayer.isValidCVV(null), "Null input should not be a valid CVV");
        }
    }
}
