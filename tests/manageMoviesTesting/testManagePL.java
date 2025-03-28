package tests.manageMoviesTesting;

/**
 * This class contains unit tests for the manageMoviesPresentationLayer class.
 * It ensures that the presentation layer correctly handles user choices
 * and interacts with the business layer without throwing exceptions.
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Scanner;
import src.primaryUseCases.manageMovies.*;


class testManagePL {
    private manageMoviesPresentationLayer presentationLayer;
    private manageMoviesBusinessLayer businessLayer;

    // Sets up the test environment before each test case
    // Initializes a mock business layer and creates an instance of the presentation layer
    @BeforeEach
    void setUp() {
        // Initialize an anonymous class to override business layer methods for testing
        businessLayer = new manageMoviesBusinessLayer() {
            @Override
            public void addMovie() {
                System.out.println("Test: addMovie() executed.");
            }

            @Override
            public void updateMovie() {
                System.out.println("Test: updateMovie() executed.");
            }

            @Override
            public void deleteMovie() {
                System.out.println("Test: deleteMovie() executed.");
            }
        };

        // Initialize the presentation layer with the mock business layer and a scanner
        Scanner scanner = new Scanner(System.in);
        presentationLayer = new manageMoviesPresentationLayer(businessLayer, scanner);
    }

    // Tests if handleChoice(1) calls addMovie without throwing an exception
    @Test
    void testHandleChoice_AddMovie() {
        assertDoesNotThrow(() -> presentationLayer.handleChoice(1));
    }

    // Tests if handleChoice(2) calls updateMovie without throwing an exception
    @Test
    void testHandleChoice_UpdateMovie() {
        assertDoesNotThrow(() -> presentationLayer.handleChoice(2));
    }

    // Tests if handleChoice(3) calls deleteMovie without throwing an exception
    @Test
    void testHandleChoice_DeleteMovie() {
        assertDoesNotThrow(() -> presentationLayer.handleChoice(3));
    }

    // Tests if handleChoice with an invalid choice (e.g., 5) does not throw an exception
    @Test
    void testHandleChoice_InvalidChoice() {
        assertDoesNotThrow(() -> presentationLayer.handleChoice(5));
    }

    // Tests if handleChoice(4) (returning to the main menu) does not throw an exception
    @Test
    void testHandleChoice_ReturnToMainMenu() {
        assertDoesNotThrow(() -> presentationLayer.handleChoice(4));
    }
}