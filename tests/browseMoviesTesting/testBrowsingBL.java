package tests.browseMoviesTesting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.primaryUseCases.browseMovies.browseMoviesBusinessLayer;
import src.primaryUseCases.browseMovies.browseMoviesDataLayer;
import src.dataStore;
import java.util.Scanner;
public class testBrowsingBL {

    private browseMoviesBusinessLayer BL;
    private browseMoviesDataLayer DL;
    private dataStore sampleDataStore;

    // Setup the business layer, data layer, and sample data store before each test
    @Before
    public void setUp() {
        sampleDataStore = new dataStore();
        DL = new browseMoviesDataLayer(sampleDataStore);
        BL = new browseMoviesBusinessLayer(DL);
    }

    // TEST CASES FOR BUSINESS LAYER
    // Ensure they communicates with the data layer correctly


    // Test to ensure all movies in the data store are receieved in the business layer
    // from the data layer
    @Test
    public void testDisplayAllMovies() {
        int displayedMoviesSize = BL.displayMovies();
        Assert.assertEquals("Displayed movies count does not match stored movies", 
                            displayedMoviesSize, DL.movies().size());
    }

    // Test search functionality for existing movie by title 
    @Test
    public void testSearchExistingMovieByTitle() {
        TestUtils.simulateUserInput("Inception\n"); 
        BL.searchMoviesByTitle(new Scanner(System.in));
        Assert.assertTrue("Movie 'Inception' should be found", 
                          DL.movies().stream().anyMatch(m -> m.getTitle().equalsIgnoreCase("Inception")));
    }

    // Test search functionality for nonexistent movie by title
    @Test
    public void testSearchNonexistentMovieByTitle() {
        TestUtils.simulateUserInput("Nonexistent Movie\n");
        BL.searchMoviesByTitle(new Scanner(System.in));
        Assert.assertFalse("Movie 'Nonexistent Movie' should not be found", 
                           DL.movies().stream().anyMatch(m -> m.getTitle().equalsIgnoreCase("Nonexistent Movie")));
    }

    // Test search functionality for existing movie by language
    @Test
    public void testSearchMoviesByExistingLanguage() {
        TestUtils.simulateUserInput("English\n"); 
        BL.searchMoviesByLanguage(new Scanner(System.in));
        Assert.assertTrue("At least one English movie should exist", 
                          DL.movies().stream().anyMatch(m -> m.getLanguage().equalsIgnoreCase("English")));
    }

    // Test search functionality for nonexistent movie by language
    @Test
    public void testSearchMoviesByNonexistentLanguage() {
        TestUtils.simulateUserInput("Spanish\n"); 
        BL.searchMoviesByLanguage(new Scanner(System.in));
        Assert.assertFalse("No Spanish movies should exist", 
                           DL.movies().stream().anyMatch(m -> m.getLanguage().equalsIgnoreCase("Spanish")));
    }

    // Test search functionality for valid rating range
    @Test
    public void testSearchMoviesByValidRatingRange() {
        TestUtils.simulateUserInput("8.5\n9.0\n");
        BL.searchMoviesByRating(new Scanner(System.in));
        Assert.assertTrue("Movies should exist within rating range 8.5 - 9.0", 
                          DL.movies().stream().anyMatch(m -> m.getImdbRating() >= 8.5 && m.getImdbRating() <= 9.0));
    }

    // Test search functionality for invalid rating range
    @Test
    public void testSearchMoviesByInvalidRatingRange() {
        TestUtils.simulateUserInput("-2.0\n-1.0\n");
        BL.searchMoviesByRating(new Scanner(System.in));
        Assert.assertFalse("No movies should exist within rating range 1.0 - 2.0", 
                           DL.movies().stream().anyMatch(m -> m.getImdbRating() >= 1.0 && m.getImdbRating() <= 2.0));
    }

}
