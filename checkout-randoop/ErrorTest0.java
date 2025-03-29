import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
            System.out.format("%n%s%n", "ErrorTest0.test001");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        src.primaryUseCases.checkout.checkoutDataLayer.printShoppingCart();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList5 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList1 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList7 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList8 = checkoutDataLayer0.bookings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCodes();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList2 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList3 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList4 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.Booking> bookingList6 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList7 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList8 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = checkoutDataLayer0.getDiscountPercentageByCode("");
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = checkoutDataLayer0.isValidDiscountCode("hi!");
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
        src.primaryUseCases.checkout.checkoutDataLayer checkoutDataLayer0 = new src.primaryUseCases.checkout.checkoutDataLayer();
        java.util.List<src.dataStore.Booking> bookingList1 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList2 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList3 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.Booking> bookingList4 = checkoutDataLayer0.bookings();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList5 = checkoutDataLayer0.validDiscountCode();
        java.util.List<src.dataStore.ValidDiscountCode> validDiscountCodeList6 = checkoutDataLayer0.validDiscountCode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = checkoutDataLayer0.isValidDiscountCode("");
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = checkoutDataLayer0.getDiscountPercentageByCode("hi!");
    }
}

