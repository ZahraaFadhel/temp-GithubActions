import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        boolean boolean1 = src.primaryUseCases.checkout.checkoutDataLayer.isValidCardNumber("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        boolean boolean1 = src.primaryUseCases.checkout.checkoutDataLayer.isValidCardholderName("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        boolean boolean1 = src.primaryUseCases.checkout.checkoutDataLayer.isValidCardholderName("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass3 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        boolean boolean1 = src.primaryUseCases.checkout.checkoutDataLayer.isValidExpiryDate("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        boolean boolean1 = src.primaryUseCases.checkout.checkoutDataLayer.isValidCardType("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        boolean boolean1 = src.primaryUseCases.checkout.checkoutDataLayer.isValidCardType("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        boolean boolean1 = src.primaryUseCases.checkout.checkoutDataLayer.isValidCVV("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.lang.Class<?> wildcardClass1 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass3 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass2 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        boolean boolean1 = src.primaryUseCases.checkout.checkoutDataLayer.isValidCardNumber("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        boolean boolean1 = src.primaryUseCases.checkout.checkoutDataLayer.isValidCVV("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
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
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = validDiscountCodeList2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = validDiscountCodeList5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = validDiscountCodeList3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        boolean boolean1 = src.primaryUseCases.checkout.checkoutDataLayer.isValidExpiryDate("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass2 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass8 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = validDiscountCodeList1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(validDiscountCodeList1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass6 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = validDiscountCodeList5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass7 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = bookingList3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = validDiscountCodeList3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = validDiscountCodeList8.getClass();
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
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = validDiscountCodeList2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = validDiscountCodeList5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass5 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = validDiscountCodeList6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = validDiscountCodeList5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = validDiscountCodeList5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass9 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass5 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass4 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass6 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = validDiscountCodeList4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass8 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass6 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = validDiscountCodeList2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass7 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = validDiscountCodeList4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
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
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = bookingList1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
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
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass8 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass9 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass6 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass9 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = validDiscountCodeList5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
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
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
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
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass7 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass7 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = bookingList4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = validDiscountCodeList8.getClass();
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
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
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
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
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
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass9 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = validDiscountCodeList7.getClass();
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
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass6 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass7 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
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
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
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
        java.lang.Class<?> wildcardClass10 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = bookingList4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass7 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = bookingList8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = validDiscountCodeList7.getClass();
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
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = validDiscountCodeList4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = bookingList3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(bookingList3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = validDiscountCodeList9.getClass();
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
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass2 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass8 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass8 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
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
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = bookingList5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
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
        java.lang.Class<?> wildcardClass11 = checkoutDataLayer0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = validDiscountCodeList8.getClass();
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
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass8 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass7 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass3 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass7 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
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
        java.lang.Class<?> wildcardClass11 = checkoutDataLayer0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
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
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
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
        java.lang.Class<?> wildcardClass10 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
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
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
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
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = bookingList8.getClass();
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
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = validDiscountCodeList5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass9 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = validDiscountCodeList7.getClass();
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
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = validDiscountCodeList7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = validDiscountCodeList9.getClass();
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
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass6 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = validDiscountCodeList12.getClass();
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
        org.junit.Assert.assertNull(validDiscountCodeList12);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = validDiscountCodeList5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
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
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = validDiscountCodeList7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass9 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
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
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass8 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
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
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
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
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = bookingList6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
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
        java.lang.Class<?> wildcardClass12 = checkoutDataLayer0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
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
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = bookingList5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(bookingList5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
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
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass9 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = validDiscountCodeList7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = validDiscountCodeList8.getClass();
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
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = validDiscountCodeList7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass9 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass3 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
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
        java.lang.Class<?> wildcardClass11 = checkoutDataLayer0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass9 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
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
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = bookingList9.getClass();
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
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = validDiscountCodeList12.getClass();
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
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
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
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass4 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = validDiscountCodeList12.getClass();
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
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = bookingList8.getClass();
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
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass5 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
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
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
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
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
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
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass11 = checkoutDataLayer0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = validDiscountCodeList9.getClass();
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
        org.junit.Assert.assertNull(validDiscountCodeList9);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = validDiscountCodeList7.getClass();
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
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
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
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = bookingList11.getClass();
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
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
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
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = validDiscountCodeList10.getClass();
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
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass8 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = bookingList6.getClass();
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
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass8 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass6 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
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
        java.lang.Class<?> wildcardClass12 = checkoutDataLayer0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass6 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass7 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
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
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass6 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass9 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
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
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
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
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass7 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass9 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass9 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = bookingList8.getClass();
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
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass6 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCode();
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
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
        org.junit.Assert.assertNull(validDiscountCodeList14);
        org.junit.Assert.assertNull(bookingList15);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
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
        org.junit.Assert.assertNull(validDiscountCodeList11);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
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
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass9 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
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
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = validDiscountCodeList10.getClass();
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
        org.junit.Assert.assertNull(validDiscountCodeList10);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = validDiscountCodeList4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
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
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
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
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
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
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = validDiscountCodeList11.getClass();
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
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = validDiscountCodeList9.getClass();
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
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = bookingList7.getClass();
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
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass6 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
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
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass8 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList15 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList16 = checkoutDataLayer0.bookings();
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
        org.junit.Assert.assertNull(bookingList16);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
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
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
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
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = validDiscountCodeList5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = validDiscountCodeList9.getClass();
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
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass7 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass10 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass7 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass7 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass7 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass9 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass8 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass7 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass5 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
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
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
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
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
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
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
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
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
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
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass10 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList15 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList16 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = validDiscountCodeList16.getClass();
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
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
        org.junit.Assert.assertNull(validDiscountCodeList14);
        org.junit.Assert.assertNull(validDiscountCodeList15);
        org.junit.Assert.assertNull(validDiscountCodeList16);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass9 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCode();
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
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass7 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
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
        java.util.List<src.dataStore.Booking> bookingList13 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = bookingList13.getClass();
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
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
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
        java.lang.Class<?> wildcardClass13 = checkoutDataLayer0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass11 = checkoutDataLayer0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList14 = checkoutDataLayer0.validDiscountCode();
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
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = validDiscountCodeList9.getClass();
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
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
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
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
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
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList14 = checkoutDataLayer0.validDiscountCodes();
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
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = validDiscountCodeList9.getClass();
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
        org.junit.Assert.assertNull(validDiscountCodeList9);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
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
        java.util.List<src.dataStore.Booking> bookingList15 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList16 = checkoutDataLayer0.validDiscountCode();
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
        org.junit.Assert.assertNull(bookingList15);
        org.junit.Assert.assertNull(validDiscountCodeList16);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
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
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
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
        java.lang.Class<?> wildcardClass10 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList15 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList16 = checkoutDataLayer0.validDiscountCodes();
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
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass12 = checkoutDataLayer0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
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
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
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
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
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
        java.lang.Class<?> wildcardClass10 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass8 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = bookingList7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
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
        java.util.List<src.dataStore.Booking> bookingList12 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCode();
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
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
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
        java.lang.Class<?> wildcardClass12 = checkoutDataLayer0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = validDiscountCodeList11.getClass();
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
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
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
        java.lang.Class<?> wildcardClass16 = checkoutDataLayer0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
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
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass14 = checkoutDataLayer0.getClass();
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
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
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
        java.lang.Class<?> wildcardClass16 = checkoutDataLayer0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList12 = checkoutDataLayer0.bookings();
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
        org.junit.Assert.assertNull(bookingList12);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
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
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
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
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass7 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = validDiscountCodeList9.getClass();
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
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
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
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCode();
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
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
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
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = validDiscountCodeList5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
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
        java.lang.Class<?> wildcardClass11 = checkoutDataLayer0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
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
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
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
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass8 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
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
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass12 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
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
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
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
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
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
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = validDiscountCodeList12.getClass();
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
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
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
        org.junit.Assert.assertNull(validDiscountCodeList11);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass5 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
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
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
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
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCode();
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
        org.junit.Assert.assertNull(validDiscountCodeList13);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = validDiscountCodeList12.getClass();
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
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
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
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = bookingList8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass10 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass8 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
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
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass7 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass9 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass7 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = validDiscountCodeList7.getClass();
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
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = bookingList9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = validDiscountCodeList9.getClass();
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
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = validDiscountCodeList9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass7 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
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
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
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
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
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
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
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
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList14 = checkoutDataLayer0.validDiscountCodes();
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
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
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
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = validDiscountCodeList12.getClass();
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
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
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
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = validDiscountCodeList6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList15 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass16 = checkoutDataLayer0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
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
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass11 = checkoutDataLayer0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
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
        java.lang.Class<?> wildcardClass11 = checkoutDataLayer0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
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
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = validDiscountCodeList12.getClass();
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
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
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
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
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
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
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
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
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
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
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
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
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
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList16 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList17 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass18 = checkoutDataLayer0.getClass();
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
        org.junit.Assert.assertNull(validDiscountCodeList16);
        org.junit.Assert.assertNull(validDiscountCodeList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCode();
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
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
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
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
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
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCode();
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
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
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
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
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
        java.util.List<src.dataStore.Booking> bookingList12 = checkoutDataLayer0.bookings();
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
        org.junit.Assert.assertNull(bookingList12);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCode();
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
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
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
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList15 = checkoutDataLayer0.validDiscountCodes();
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
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
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
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = validDiscountCodeList6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = validDiscountCodeList14.getClass();
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
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
        org.junit.Assert.assertNull(validDiscountCodeList14);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = validDiscountCodeList12.getClass();
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
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass10 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList16 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList17 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = validDiscountCodeList17.getClass();
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
        org.junit.Assert.assertNull(validDiscountCodeList14);
        org.junit.Assert.assertNull(validDiscountCodeList15);
        org.junit.Assert.assertNull(validDiscountCodeList16);
        org.junit.Assert.assertNull(validDiscountCodeList17);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass8 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = validDiscountCodeList9.getClass();
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
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass10 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass7 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
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
        java.lang.Class<?> wildcardClass13 = checkoutDataLayer0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
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
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = validDiscountCodeList9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass9 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCodes();
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
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = validDiscountCodeList9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = validDiscountCodeList8.getClass();
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
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
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
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
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
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = validDiscountCodeList11.getClass();
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
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
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
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
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
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = bookingList5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(bookingList5);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass9 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
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
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass5 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList13 = checkoutDataLayer0.bookings();
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
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList12 = checkoutDataLayer0.bookings();
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
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCodes();
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
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass11 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
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
        java.lang.Class<?> wildcardClass10 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
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
        java.lang.Class<?> wildcardClass11 = checkoutDataLayer0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
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
        java.util.List<src.dataStore.Booking> bookingList12 = checkoutDataLayer0.bookings();
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
        org.junit.Assert.assertNull(bookingList12);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
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
        java.lang.Class<?> wildcardClass11 = checkoutDataLayer0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
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
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
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
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList15 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList16 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList17 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass18 = checkoutDataLayer0.getClass();
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
        org.junit.Assert.assertNull(validDiscountCodeList16);
        org.junit.Assert.assertNull(validDiscountCodeList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass8 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass9 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
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
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
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
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = validDiscountCodeList5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
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
        java.util.List<src.dataStore.Booking> bookingList13 = checkoutDataLayer0.bookings();
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
        org.junit.Assert.assertNull(bookingList13);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCodes();
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
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCodes();
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
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
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
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
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
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
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
        java.lang.Class<?> wildcardClass12 = checkoutDataLayer0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
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
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
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
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
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
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
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
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass8 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCodes();
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
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass6 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
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
        java.util.List<src.dataStore.Booking> bookingList13 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass14 = checkoutDataLayer0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
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
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(bookingList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass7 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList13 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList14 = checkoutDataLayer0.validDiscountCode();
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
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(validDiscountCodeList14);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
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
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = validDiscountCodeList8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
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
        java.util.List<src.dataStore.Booking> bookingList15 = checkoutDataLayer0.bookings();
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
        org.junit.Assert.assertNull(bookingList15);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = validDiscountCodeList9.getClass();
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
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = validDiscountCodeList8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
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
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
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
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = bookingList9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
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
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
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
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
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
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList15 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList16 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList17 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList18 = checkoutDataLayer0.validDiscountCode();
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
        org.junit.Assert.assertNull(bookingList16);
        org.junit.Assert.assertNull(validDiscountCodeList17);
        org.junit.Assert.assertNull(validDiscountCodeList18);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList16 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList17 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList18 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList19 = checkoutDataLayer0.bookings();
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
        org.junit.Assert.assertNull(validDiscountCodeList16);
        org.junit.Assert.assertNull(validDiscountCodeList17);
        org.junit.Assert.assertNull(validDiscountCodeList18);
        org.junit.Assert.assertNull(bookingList19);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass8 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = validDiscountCodeList10.getClass();
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
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
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
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
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
        org.junit.Assert.assertNull(validDiscountCodeList11);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = validDiscountCodeList9.getClass();
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
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
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
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
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
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass9 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
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
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass8 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
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
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
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
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
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
        java.util.List<src.dataStore.Booking> bookingList12 = checkoutDataLayer0.bookings();
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
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = validDiscountCodeList12.getClass();
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
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
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
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
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
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
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
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
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
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList12 = checkoutDataLayer0.bookings();
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
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.lang.Class<?> wildcardClass9 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = validDiscountCodeList9.getClass();
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
        org.junit.Assert.assertNull(validDiscountCodeList9);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList13 = checkoutDataLayer0.bookings();
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
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(bookingList13);
        org.junit.Assert.assertNull(validDiscountCodeList14);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass10 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
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
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
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
        org.junit.Assert.assertNull(validDiscountCodeList11);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass11 = checkoutDataLayer0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
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
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = validDiscountCodeList9.getClass();
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
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
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
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
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
        java.util.List<src.dataStore.Booking> bookingList14 = checkoutDataLayer0.bookings();
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
        org.junit.Assert.assertNull(bookingList14);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = bookingList8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
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
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
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
        org.junit.Assert.assertNull(validDiscountCodeList11);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass7 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
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
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
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
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass5 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
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
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
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
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
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
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(bookingList12);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList14 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList15 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = bookingList15.getClass();
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
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNull(validDiscountCodeList13);
        org.junit.Assert.assertNull(validDiscountCodeList14);
        org.junit.Assert.assertNull(bookingList15);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = validDiscountCodeList8.getClass();
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
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass12 = checkoutDataLayer0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = bookingList3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(bookingList3);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = bookingList9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass8 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = validDiscountCodeList8.getClass();
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
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList14 = checkoutDataLayer0.bookings();
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
        org.junit.Assert.assertNull(bookingList14);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = bookingList5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(bookingList5);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList11 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList12 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass13 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
        org.junit.Assert.assertNull(validDiscountCodeList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
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
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
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
        java.util.List<src.dataStore.Booking> bookingList15 = checkoutDataLayer0.bookings();
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
        org.junit.Assert.assertNull(bookingList15);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
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
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
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
        java.lang.Class<?> wildcardClass11 = checkoutDataLayer0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
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
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList10 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(bookingList10);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(bookingList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(bookingList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
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
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
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
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
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
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
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
        org.junit.Assert.assertNull(bookingList11);
        org.junit.Assert.assertNull(validDiscountCodeList12);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
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
        java.lang.Class<?> wildcardClass10 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = validDiscountCodeList7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList9 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.lang.Class<?> wildcardClass11 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(bookingList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList9 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList10 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList11 = checkoutDataLayer0.bookings();
        org.junit.Assert.assertNull(validDiscountCodeList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(validDiscountCodeList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(bookingList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
        org.junit.Assert.assertNull(validDiscountCodeList9);
        org.junit.Assert.assertNull(validDiscountCodeList10);
        org.junit.Assert.assertNull(bookingList11);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.lang.Class<?> wildcardClass6 = checkoutDataLayer0.getClass();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(validDiscountCodeList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(validDiscountCodeList4);
        org.junit.Assert.assertNull(bookingList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        org.junit.Assert.assertNull(bookingList1);
        org.junit.Assert.assertNull(bookingList2);
        org.junit.Assert.assertNull(bookingList3);
        org.junit.Assert.assertNull(bookingList4);
        org.junit.Assert.assertNull(validDiscountCodeList5);
        org.junit.Assert.assertNull(validDiscountCodeList6);
        org.junit.Assert.assertNull(validDiscountCodeList7);
        org.junit.Assert.assertNull(validDiscountCodeList8);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
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
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList13 = checkoutDataLayer0.validDiscountCodes();
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
        org.junit.Assert.assertNull(validDiscountCodeList13);
    }
}

