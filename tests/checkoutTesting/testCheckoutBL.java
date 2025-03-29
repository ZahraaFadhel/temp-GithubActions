/**
 * Test Class for Checkout Business Layer
 * Tests scenarios like calculating total price, applying discounts, and handling checkout.
 */
package tests.checkoutTesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.util.List;

import src.primaryUseCases.checkout.checkoutBusinessLayer;
import src.primaryUseCases.checkout.checkoutDataLayer;
import src.dataStore.Booking;

public class testCheckoutBL {

    private checkoutBusinessLayer checkoutBL;
    private checkoutDataLayer checkoutDL;

    @BeforeEach
    public void setUp() {
        checkoutDL = new checkoutDataLayer();
        new src.dataStore();
        checkoutBL = new checkoutBusinessLayer(checkoutDL);
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
         * Test: Calculate Total Price
         * Verifies that the total price is calculated correctly.
         */
        @Test
        public void testCalculateTotalPrice() {
            List<Booking> bookings = checkoutDL.bookings();
            double totalPrice = checkoutBusinessLayer.calculateTotalPrice(bookings);
            assertEquals(20, totalPrice, "Total price should be 20.0 based on sample bookings");
        }

        /**
         * Test: Apply Valid Discount Code
         * Verifies that a valid discount code reduces the price correctly.
         */
        @Test
        public void testApplyDiscountCode_ValidCode() {
            String discountCode = "NEWYEAR25";
            double originalPrice = 100.0;
            double discountedPrice = checkoutBL.ApplyDiscountCode(discountCode, originalPrice);
            assertEquals(75.0, discountedPrice, "Discount code NEWYEAR25 should reduce the price by 25%");
        }

        /**
         * Test: Proceed to Checkout with New Payment Method
         * Verifies that checkout succeeds with a new payment method.
         */
        @Test
        public void testProceedToCheckout_NewPaymentMethod() {
            String input = "2\n" + // Choose "Use a new payment method"
                          "Visa\n" + // Card type
                          "John Doe\n" + // Cardholder name
                          "1234567890123456\n" + // Card number
                          "12/25\n" + // Expiry date
                          "123\n" + // CVV
                          "yes\n" + // Save payment method
                          "\n"; // Press ENTER to continue (for promptForCheckout)
        
            System.setIn(new ByteArrayInputStream(input.getBytes()));
        
            checkoutBL = new checkoutBusinessLayer(checkoutDL);
        
            boolean result = checkoutBL.proceedToCheckout();
        
            assertTrue(result, "Checkout with new payment method should succeed");
        }
    }

    @Nested
    class FailureCases {
        /**
         * Test: Apply Invalid Discount Code
         * Verifies that an invalid discount code does not change the price.
         */
        @Test
        public void testApplyDiscountCode_InvalidCode() {
            String discountCode = "INVALIDCODE";
            double originalPrice = 100.0;
            double discountedPrice = checkoutBL.ApplyDiscountCode(discountCode, originalPrice);
            assertEquals(100.0, discountedPrice, "Invalid discount code should not change the price");
        }

        /**
         * Test: Proceed to Checkout with Invalid Card Type
         * Verifies that checkout fails with an invalid card type.
         */
        @Test
        public void testProceedToCheckout_InvalidCardType() {
            String input = "2\n" + // Choose "Use a new payment method"
                          "Amex\n" + // Invalid card type (not Visa or MasterCard)
                          "no\n"; // Do not retry after invalid card type
        
            System.setIn(new ByteArrayInputStream(input.getBytes()));
        
            checkoutBL = new checkoutBusinessLayer(checkoutDL);
        
            boolean result = checkoutBL.proceedToCheckout();
        
            assertFalse(result, "Checkout with invalid card type should fail");
        }

        /**
         * Test: Handle Saved Payment Method (No Saved Method)
         * Verifies that checkout fails if no saved payment method exists.
         */
        @Test
        public void testHandleSavedPaymentMethod_NoSavedMethod() {
            src.dataStore.updatePaymentMethod(null);
        
            String input = "1\n"; // Choose "Use a saved payment method"
            System.setIn(new ByteArrayInputStream(input.getBytes()));
        
            checkoutBL = new checkoutBusinessLayer(checkoutDL);
        
            boolean result = checkoutBL.proceedToCheckout();
        
            assertFalse(result, "Checkout should fail if no saved payment method exists");
        }

        /**
         * Test: Apply Empty Discount Code
         * Verifies that an empty discount code does not change the price.
         */
        @Test
        public void testApplyDiscountCode_EmptyCode() {
            String discountCode = "";
            double originalPrice = 100.0;
            double discountedPrice = checkoutBL.ApplyDiscountCode(discountCode, originalPrice);
            assertEquals(100.0, discountedPrice, "Empty discount code should not change the price");
        }
    }
}

