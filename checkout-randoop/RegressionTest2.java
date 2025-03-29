import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        java.util.List<src.dataStore.Booking> bookingList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double1 = src.primaryUseCases.checkout.checkoutBusinessLayer.calculateTotalPrice(bookingList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because the return value of \"src.dataStore.getBookings()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = null;
        src.primaryUseCases.checkout.checkoutBusinessLayer checkoutBusinessLayer1 = new src.primaryUseCases.checkout.checkoutBusinessLayer(checkoutDataLayer0);
        boolean boolean2 = checkoutBusinessLayer1.proceedToCheckout();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = checkoutBusinessLayer1.proceedToCheckout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.clear()\" because \"src.dataStore.bookings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

