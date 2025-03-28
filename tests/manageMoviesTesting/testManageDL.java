package tests.manageMoviesTesting;

/**
 * This class contains unit tests for the manageMoviesDataLayer class.
 * It verifies the functionality of adding, deleting, retrieving, and displaying movies
 * while ensuring data integrity within the data store.
*/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.dataStore;
import src.dataStore.Movie;
import src.primaryUseCases.manageMovies.*;
import static org.junit.jupiter.api.Assertions.*;


class testManageDL {
    private manageMoviesDataLayer dataLayer;
    private dataStore store;

    // Sets up the test environment before each test case
    // Initializes the data store and data layer instance
    @BeforeEach
    void setUp() {
        store = new dataStore();
        dataLayer = new manageMoviesDataLayer(store);
    }

    // Tests if a valid movie can be added successfully
    // Ensures that the movie is added and the movie list size increases
    @Test
    void testAddMovieValid() {
        Movie movie = new Movie("New Movie", new String[]{"Actor 1", "Actor 2", "Actor 3"}, "Summary", 
                                13, 8.0, "English", 120, new String[]{"10:00 AM"}, "Standard");
        assertTrue(dataLayer.addMovie(movie));
        assertEquals(5, dataLayer.getMovies().size());
    }

    
    // Tests if adding a movie with an invalid rating (above 10.0) fails
    @Test
    void testAddMovieInvalidRating() {
        Movie movie = new Movie("Invalid Movie", new String[]{"Actor 1", "Actor 2", "Actor 3"}, "Summary", 
                                13, 11.0, "English", 120, new String[]{"10:00 AM"}, "Standard");
        assertFalse(dataLayer.addMovie(movie));
    }

    // Tests if an existing movie can be deleted successfully
    // Ensures that the movie is removed and the movie list size decreases
    @Test
    void testDeleteMovie() {
        assertTrue(dataLayer.deleteMovie("Avatar"));
        assertEquals(3, dataLayer.getMovies().size());
    }

    // Tests if a movie can be retrieved correctly by its title
    // Ensures the retrieved movie is not null and has the correct title
    @Test
    void testGetMovie() {
        Movie movie = dataLayer.getMovie("Inception");
        assertNotNull(movie);
        assertEquals("Inception", movie.getTitle());
    }

    // Tests if the displayMovies method runs without throwing exceptions
    @Test
    void testDisplayMovies() {
        assertDoesNotThrow(() -> dataLayer.displayMovies(1));
    }
}