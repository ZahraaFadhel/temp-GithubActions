package tests.browseMoviesTesting;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

// Helper class to simulate user input
// used by tests in the Presentation and Business Layers

public class TestUtils {
    // Helper method to simulate user input
    // by setting the input stream to the given string
    public static void simulateUserInput(String input) {
      InputStream in = new ByteArrayInputStream(input.getBytes());
      System.setIn(in);
    }
}

