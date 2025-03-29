import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList14 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
        org.junit.Assert.assertNull(validDiscountCodeList14);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList14 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList15 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList16 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
        org.junit.Assert.assertNull(validDiscountCodeList14);
        org.junit.Assert.assertNull(bookingList15);
        org.junit.Assert.assertNull(validDiscountCodeList16);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = validDiscountCodeList8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass8 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass12 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass8 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass14 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass8 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass13 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = validDiscountCodeList3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList14 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList15 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList16 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = bookingList16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
        org.junit.Assert.assertNull(bookingList14);
        org.junit.Assert.assertNull(validDiscountCodeList15);
        org.junit.Assert.assertNull(bookingList16);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = validDiscountCodeList8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList14 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
        org.junit.Assert.assertNull(validDiscountCodeList14);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass7 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList14 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList15 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList16 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
        org.junit.Assert.assertNull(validDiscountCodeList14);
        org.junit.Assert.assertNull(validDiscountCodeList15);
        org.junit.Assert.assertNull(bookingList16);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass11 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = validDiscountCodeList10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList14 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList15 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
        org.junit.Assert.assertNull(validDiscountCodeList14);
        org.junit.Assert.assertNull(validDiscountCodeList15);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass14 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass9 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass9 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList13 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = bookingList13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList12 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(bookingList12);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = bookingList11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList13 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList14 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(validDiscountCodeList14);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList14 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList15 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList16 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList17 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
        org.junit.Assert.assertNull(bookingList14);
        org.junit.Assert.assertNull(validDiscountCodeList15);
        org.junit.Assert.assertNull(validDiscountCodeList16);
        org.junit.Assert.assertNull(validDiscountCodeList17);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass6 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass9 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList13 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass11 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList13 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList14 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList15 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList16 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(validDiscountCodeList14);
        org.junit.Assert.assertNull(bookingList15);
        org.junit.Assert.assertNull(bookingList16);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass11 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = validDiscountCodeList6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList12 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = validDiscountCodeList11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = validDiscountCodeList11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList13 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass14 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList14 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
        org.junit.Assert.assertNull(validDiscountCodeList14);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass6 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = bookingList9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = bookingList10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = bookingList7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList14 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
        org.junit.Assert.assertNull(validDiscountCodeList14);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList13 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass9 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass9 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList14 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
        org.junit.Assert.assertNull(validDiscountCodeList14);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = validDiscountCodeList6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass12 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass10 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList13 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList14 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(validDiscountCodeList14);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = bookingList7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList14 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
        org.junit.Assert.assertNull(validDiscountCodeList14);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass7 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList12 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList12 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList14 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList15 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
        org.junit.Assert.assertNull(validDiscountCodeList14);
        org.junit.Assert.assertNull(validDiscountCodeList15);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = validDiscountCodeList8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = validDiscountCodeList10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList12 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = bookingList12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(bookingList12);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList13 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList14 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList15 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList16 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList17 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(validDiscountCodeList14);
        org.junit.Assert.assertNull(validDiscountCodeList15);
        org.junit.Assert.assertNull(validDiscountCodeList16);
        org.junit.Assert.assertNull(validDiscountCodeList17);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = validDiscountCodeList7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass10 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = validDiscountCodeList6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList14 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList15 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
        org.junit.Assert.assertNull(validDiscountCodeList14);
        org.junit.Assert.assertNull(validDiscountCodeList15);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass12 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList14 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList15 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
        org.junit.Assert.assertNull(validDiscountCodeList14);
        org.junit.Assert.assertNull(validDiscountCodeList15);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = validDiscountCodeList10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList14 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
        org.junit.Assert.assertNull(bookingList14);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = validDiscountCodeList13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList13 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass12 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList13 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList12 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList14 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList15 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList16 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
        org.junit.Assert.assertNull(validDiscountCodeList14);
        org.junit.Assert.assertNull(bookingList15);
        org.junit.Assert.assertNull(validDiscountCodeList16);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass12 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList13 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList14 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList15 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList16 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList17 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(validDiscountCodeList14);
        org.junit.Assert.assertNull(validDiscountCodeList15);
        org.junit.Assert.assertNull(validDiscountCodeList16);
        org.junit.Assert.assertNull(bookingList17);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = validDiscountCodeList11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList14 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
        org.junit.Assert.assertNull(validDiscountCodeList14);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = validDiscountCodeList8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList14 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass15 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
        org.junit.Assert.assertNull(validDiscountCodeList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList12 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList13 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList14 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList15 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(validDiscountCodeList14);
        org.junit.Assert.assertNull(bookingList15);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass12 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList12 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = validDiscountCodeList13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList13 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList12 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(bookingList12);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(bookingList3);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList12 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass13 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass10 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
}

