import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest3 {

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
            System.out.format("%n%s%n", "ErrorTest0.test1");
        src.dataStore.Booking[] bookingArray0 = new src.dataStore.Booking[] {};
        java.util.ArrayList<src.dataStore.Booking> bookingList1 = new java.util.ArrayList<src.dataStore.Booking>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<src.dataStore.Booking>) bookingList1, bookingArray0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double3 = src.primaryUseCases.checkout.checkoutBusinessLayer.calculateTotalPrice((java.util.List<src.dataStore.Booking>) bookingList1);
    }
}

