package tests.bookingMoviesTesting;

// Import necessary testing and data handling classes
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.dataStore;
import src.dataStore.Movie;
import src.primaryUseCases.bookingMovies.bookingDataLayer;
import src.dataStore.Booking;
import java.util.List;

/**
 * This class tests the Booking Data Layer functionality to ensure 
 * that movie booking, cancellation, and retrieval operations work correctly.
 */
public class testBookingDL {

    private bookingDataLayer DL; // Instance of the booking data layer
    private dataStore sampleDataStore; // Sample data store to simulate a database

    /**
     * Sets up the test environment before each test runs.
     * This ensures that each test starts with a fresh set of data.
     */
    @Before
    public void setUp() {
        // Initialize a new data store containing predefined movies and bookings
        sampleDataStore = new dataStore();

        // Initialize the Booking Data Layer with the sample data store
        DL = new bookingDataLayer(sampleDataStore);
    }

    /**
     * Tests the creation of a new booking for an existing movie.
     * Ensures that the booking is successfully added to the system.
     */
    @Test
    public void testCreateBooking() {
        // Retrieve an existing movie from the sample data store
        Movie existingMovie = sampleDataStore.getMovies().get(0); // Fetch the first movie (e.g., Inception)

        // Book the existing movie for a specific showtime
        DL.bookMovie(existingMovie, "3:00 PM");

        // Verify that the total number of bookings has increased by one
        Assert.assertEquals(5, sampleDataStore.getBookings().size()); // Assuming initially there were 4 bookings
    }

    /**
     * Tests the cancellation of an existing booking.
     * Ensures that the booking is successfully removed from the system.
     */
    @Test
    public void testCancelBooking() {
        // Retrieve the list of existing bookings
        List<Booking> bookings = sampleDataStore.getBookings();

        // Get the booking ID of the first booking in the list
        String bookingId = bookings.get(0).getBookingId();

        // Cancel the booking using the booking ID
        DL.cancelBooking(bookingId);

        // Verify that the total number of bookings has decreased by one
        Assert.assertEquals(3, sampleDataStore.getBookings().size()); // Assuming initially there were 4 bookings
    }

    /**
     * Tests the retrieval of all bookings in the system.
     * Ensures that the method correctly returns the expected number of bookings.
     */
    @Test
    public void testViewAllBookings() {
        // Retrieve the list of bookings from the data layer
        List<Booking> bookings = DL.bookings();

        // Verify that the total number of bookings matches the expected count
        Assert.assertEquals(4, bookings.size()); // Assuming there were originally 4 bookings
    }
}
