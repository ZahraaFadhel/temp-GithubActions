package tests.browseMoviesTesting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.primaryUseCases.browseMovies.browseMoviesBusinessLayer;
import src.primaryUseCases.browseMovies.browseMoviesDataLayer;
import src.dataStore;
import src.dataStore.Movie;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class testBrowsingBL {

    private browseMoviesBusinessLayer BL;
    private browseMoviesDataLayer DL;
    private dataStore sampleDataStore;

    // Setting up the sample data
    // This method is executed before each test
    @Before
    public void setUp() {
        // constructor already initializes the sample data
        sampleDataStore = new dataStore();

        DL = new browseMoviesDataLayer(sampleDataStore);
        BL = new browseMoviesBusinessLayer(DL);
    }

    // Testing the business layer methods

    // Testing the display of all movies
    @Test
    public void testDisplayAllMovies() {
        // Retrieve movies through business layer
        int displayedMoviesSize = BL.displayMovies();

        // Ensure all movies are displayed
        Assert.assertEquals(displayedMoviesSize, DL.movies().size());
    }

    // Testing the display of movies by title
    @Test
    public void testSearchMoviesByTitle() {
        // Simulate user input: "Inception" followed by a newline
        String simulatedInput = "Inception\n";
        InputStream originalSystemIn = System.in;
        
        try {
            System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
            
            // Call the method that prompts for input
            BL.searchMoviesByTitle(new Scanner(System.in));

            // Expecting a match
            Assert.assertTrue(DL.movies().stream().anyMatch(m -> m.getTitle().equalsIgnoreCase("Inception")));
        } finally {
            // Restore the original System.in to avoid affecting other tests
            System.setIn(originalSystemIn);
        }
    }

    // Testing the display of movies by language
    @Test
    public void testSearchMoviesByLanguage() {
        // Simulate user input: "English" followed by a newline
        String simulatedInput = "English\n";
        InputStream originalSystemIn = System.in;
        
        try {
            System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
            
            // Call the method that prompts for input
            BL.searchMoviesByLanguage(new Scanner(System.in));

            // Expecting a match
            Assert.assertTrue(DL.movies().stream().anyMatch(m -> m.getLanguage().equalsIgnoreCase("English")));
        } finally {
            // Restore the original System.in to avoid affecting other tests
            System.setIn(originalSystemIn);
        }
    }

    // Testing the display of movies by rating
    @Test
    public void testSearchMoviesByRating() {
        // Simulate user input: "8.5" followed by a newline, then "9.0" followed by a newline
        String simulatedInput = "8.5\n9.0\n";
        InputStream originalSystemIn = System.in;
        
        try {
            System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
            
            // Call the method that prompts for input
            BL.searchMoviesByRating(new Scanner(System.in));

            // Expecting a match
            Assert.assertTrue(DL.movies().stream().anyMatch(m -> m.getImdbRating() >= 8.5 && m.getImdbRating() <= 9.0));
        } finally {
            // Restore the original System.in to avoid affecting other tests
            System.setIn(originalSystemIn);
        }
    }

}
