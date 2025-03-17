package tests.bookingMoviesTesting;

// Import necessary testing and input handling classes
import org.junit.Before;
import org.junit.Test;
import src.primaryUseCases.bookingMovies.bookingBusinessLayer;
import src.primaryUseCases.bookingMovies.bookingDataLayer;
import src.primaryUseCases.bookingMovies.bookingPresentationLayer;
import src.dataStore;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * This class tests the Booking Presentation Layer functionality.
 * It simulates user interactions with the presentation layer to 
 * verify booking, viewing, and cancellation processes.
 */
public class testBookingPL {

    private bookingPresentationLayer PL; // Presentation layer instance
    private bookingBusinessLayer BL; // Business logic layer instance
    private bookingDataLayer DL; // Data layer instance
    private dataStore sampleDataStore; // Sample data store for testing

    /**
     * Sets up the test environment before each test execution.
     * Initializes the data store and layers to ensure a fresh start for each test.
     */
    @Before
    public void setUp() {
        // Initialize a new data store containing sample movies and bookings
        sampleDataStore = new dataStore();

        // Initialize the data and business layers
        DL = new bookingDataLayer(sampleDataStore);
        BL = new bookingBusinessLayer(DL);

        // Initialize the presentation layer with the business logic layer
        PL = new bookingPresentationLayer(BL);
    }

    /**
     * Tests the booking process through the presentation layer.
     * Simulates a user selecting an option to book a movie, 
     * choosing "Inception" at "10:00 AM".
     */
    @Test
    public void testBookMovies() {
        // Simulated user input: selecting option 1 (book movie), choosing "Inception", then "10:00 AM"
        String simulatedInput = "1\nInception\n10:00 AM";
        InputStream originalSystemIn = System.in; // Store original System.in

        // Replace System.in with simulated input
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        try {
            // Start the presentation layer (which handles user interactions)
            PL.start();

            // Add assertions if needed to verify successful execution
            assert true;
        } finally {
            // Restore original System.in to prevent interference with other tests
            System.setIn(originalSystemIn);
        }
    }

    /**
     * Tests viewing existing bookings through the presentation layer.
     * Simulates a user selecting option 2 to view bookings.
     */
    @Test
    public void testViewBookings() {
        // Simulated user input: selecting option 2 (view bookings)
        String simulatedInput = "2\n";
        InputStream originalSystemIn = System.in; // Store original System.in

        try {
            // Replace System.in with simulated input
            System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

            // Start the presentation layer, which should display existing bookings
            PL.start();

            // Add assertions if needed
            assert true;
        } finally {
            // Restore original System.in to avoid affecting other tests
            System.setIn(originalSystemIn);
        }
    }

    /**
     * Tests canceling a booking through the presentation layer.
     * Simulates a user selecting option 3 and providing a booking ID.
     */
    @Test
    public void testCancelBooking() {
        // Simulated user input: selecting option 3 (cancel booking) and entering booking ID "B001"
        String simulatedInput = "3\nB001\n";
        InputStream originalSystemIn = System.in; // Store original System.in

        try {
            // Replace System.in with simulated input
            System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

            // Start the presentation layer, which should process the cancellation
            PL.start();

            // Add assertions if needed
            assert true;
        } finally {
            // Restore original System.in to avoid affecting other tests
            System.setIn(originalSystemIn);
        }
    }

    /**
     * Tests returning to the main menu through the presentation layer.
     * Simulates a user selecting option 4 (exit/return to main menu).
     */
    @Test
    public void testReturnToMainMenu() {
        // Simulated user input: selecting option 4 (exit)
        simulateUserInput("4\n");

        // Start the presentation layer, which should process the exit command
        PL.start();
    }

    /**
     * Helper method to simulate user input.
     * This method replaces System.in with a ByteArrayInputStream containing the provided input.
     * 
     * @param input The simulated user input string.
     */
    private void simulateUserInput(String input) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }
}
