package tests.bookingMoviesTesting;

// Import necessary testing and input classes
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.primaryUseCases.bookingMovies.bookingBusinessLayer;
import src.primaryUseCases.bookingMovies.bookingDataLayer;
import src.dataStore;
import java.util.Scanner;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * This class tests the Booking Business Layer functionality to ensure 
 * that movie booking and cancellation operations work correctly.
 */
public class testBookingBL {

    private bookingBusinessLayer BL; // Business logic layer instance
    private bookingDataLayer DL; // Data layer instance
    private dataStore sampleDataStore; // Sample data store for testing

    /**
     * Sets up the sample data before each test execution.
     * This ensures that each test starts with a fresh set of data.
     */
    @Before
    public void setUp() {
        // Initialize a new data store
        sampleDataStore = new dataStore();

        // Create data layer instance using sample data store
        DL = new bookingDataLayer(sampleDataStore);

        // Create business layer instance using data layer
        BL = new bookingBusinessLayer(DL);
    }

    /**
     * Tests the method that retrieves and displays all existing bookings.
     */
    @Test
    public void testViewBookings() {
        int displayedBookingsSize = BL.viewBookings(); // Fetch booking count from business layer

        // Assert that the displayed booking count matches the actual number of bookings
        Assert.assertEquals(displayedBookingsSize, DL.bookings().size());
    }

    /**
     * Tests the process of booking a movie and then canceling the booking.
     * It ensures that the booking system correctly adds and removes bookings.
     */
    @Test
    public void testBookMovies() {
        // Simulate user input for movie booking: "Avatar" at "11:00 AM"
        String simulatedInput = "Avatar\n11:00 AM\n";
        InputStream originalSystemIn = System.in; // Store original System.in

        // Array to store the generated booking ID (must be effectively final for lambda use)
        final String[] bookingId = { "" };

        try {
            // Replace System.in with simulated user input
            System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

            // Call the bookMovie method, which expects user input
            bookingId[0] = BL.bookMovie(new Scanner(System.in));

            // Verify that the new booking exists in the system
            Assert.assertTrue("Booking should exist in the system",
                    DL.bookings().stream().anyMatch(b -> b.getBookingId().equals(bookingId[0])));

        } finally {
            // Restore original System.in to prevent interference with other tests
            System.setIn(originalSystemIn);
        }

        // Now, simulate user input for canceling the newly added booking
        simulatedInput = bookingId[0]; // Provide booking ID as input for cancellation
        originalSystemIn = System.in; // Store original System.in

        try {
            // Replace System.in with simulated input for canceling booking
            System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

            // Call the cancelBooking method, which expects user input
            BL.cancelBooking(new Scanner(System.in));

            // Validate that the booking has been removed by checking the size of the bookings list
            Assert.assertEquals(4, DL.bookings().size()); // Assuming there were initially 5 bookings
        } finally {
            // Restore original System.in to avoid affecting other tests
            System.setIn(originalSystemIn);
        }
    }

    /**
     * Tests the cancellation of a booking after it has been added.
     * Ensures that the system correctly removes a specific booking.
     */
    @Test
    public void testCancelBooking() {
        // Simulated user input to book a movie: "The Godfather" at "9:00 PM"
        String simulatedInput = "The Godfather\n9:00 PM";
        InputStream originalSystemIn = System.in; // Store original System.in

        // Array to store the booking ID (must be effectively final)
        final String[] bookingId = { "" };

        try {
            // Replace System.in with simulated user input
            System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

            // Call the bookMovie method, which expects user input
            bookingId[0] = BL.bookMovie(new Scanner(System.in));

            // Verify that the booking has been successfully added
            Assert.assertTrue("Booking should exist in the system",
                    DL.bookings().stream().anyMatch(b -> b.getBookingId().equals(bookingId[0])));
        } finally {
            // Restore original System.in to prevent interference with other tests
            System.setIn(originalSystemIn);
        }

        // Simulate user input to cancel the booking by providing the booking ID
        simulatedInput = bookingId[0];
        originalSystemIn = System.in;

        try {
            // Replace System.in with simulated input for canceling booking
            System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

            // Call the cancelBooking method, which expects user input
            BL.cancelBooking(new Scanner(System.in));

            // Validate that the booking count is reduced to 4 (assuming initially 5)
            Assert.assertEquals(4, DL.bookings().size());
        } finally {
            // Restore original System.in to avoid affecting other tests
            System.setIn(originalSystemIn);
        }
    }
}
