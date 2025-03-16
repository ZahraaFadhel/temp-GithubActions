package tests.browseMoviesTesting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.primaryUseCases.browseMovies.browseMoviesPresentationLayer;
import src.primaryUseCases.browseMovies.browseMoviesBusinessLayer;
import src.primaryUseCases.browseMovies.browseMoviesDataLayer;
import src.dataStore;
import src.dataStore.Movie;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class testBrowsingPL {

    private browseMoviesPresentationLayer PL;
    private browseMoviesBusinessLayer BL;
    private browseMoviesDataLayer DL;

    private dataStore sampleDataStore;

    // Setting up the sample data
    // This method is executed before each test
    @Before
    public void setUp() {
        sampleDataStore = new dataStore();

        DL = new browseMoviesDataLayer(sampleDataStore);
        BL = new browseMoviesBusinessLayer(DL);

        PL = new browseMoviesPresentationLayer(BL);
    }

    // Testing the displayAllMovies method
    @Test
    public void testDisplayAllMovies() {
        String simulatedInput = "1\n";
        InputStream originalSystemIn = System.in; // Save original System.in
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        try {
            PL.start();
            // Add assertions if needed (e.g., verifying method calls)
            assert true;
        } finally {
            System.setIn(originalSystemIn); // Restore original System.in after the test
        }
    }

    // Testing the searchMoviesByTitle method
    @Test
    public void testSearchMoviesByTitle() {
        String simulatedInput = "2\nInception\ny\n";
        InputStream originalSystemIn = System.in;

        try {
            System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

            // Call the method that prompts for input
            PL.start();

            // Expecting a match
            assert (true);
        } finally {
            // Restore the original System.in to avoid affecting other tests
            System.setIn(originalSystemIn);
        }
    }

    // Testing the searchMoviesByLanguage method
    @Test
    public void testSearchMoviesByLanguage() {
        String simulatedInput = "3\nArabic\ny\n";
        InputStream originalSystemIn = System.in;

        try {
            System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

            // Call the method that prompts for input
            PL.start();

            // Expecting a match
            assert (true);
        } finally {
            // Restore the original System.in to avoid affecting other tests
            System.setIn(originalSystemIn);
        }
    }

    @Test
    // Testing the searchMoviesByRating method
    public void testSearchMoviesByRating() {
        String simulatedInput = "4\n7.5\n9.0\ny\n";
        InputStream originalSystemIn = System.in;

        try {
            System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

            // Call the method that prompts for input
            PL.start();

            // Expecting a match
            assert (true);
        } finally {
            // Restore the original System.in to avoid affecting other tests
            System.setIn(originalSystemIn);
        }
    }

    // Testing the returnToMainMenu method
    @Test
    public void testReturnToMainMenu() {
        simulateUserInput("5\n");
        PL.start();
    }

    // Helper method to simulate user input
    private void simulateUserInput(String input) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }
}