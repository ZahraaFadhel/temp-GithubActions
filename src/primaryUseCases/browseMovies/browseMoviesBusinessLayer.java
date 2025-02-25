package src.primaryUseCases.browseMovies;

/*
The businessLayer class acts as the intermediary between the presentationLayer (user interface) and the dataLayer (data handling) in the Cinema Management System.
It contains the core logic for browsing movies and searching through them, including browse movies and searching by title, language and rating.
This class ensures that business rules (e.g., validation, constraints) are enforced before interacting with the data layer.
 */

import java.util.Scanner;

public class browseMoviesBusinessLayer {

    private browseMoviesDataLayer dataLayer; // Reference to the data layer for interacting with movie data
    private Scanner scanner; // Scanner object for reading user input from the console

    // Constructor to initialize the business layer
    public browseMoviesBusinessLayer(browseMoviesDataLayer dataLayer) {
        this.dataLayer = dataLayer; // Instantiate the data layer
        this.scanner = new Scanner(System.in); // Initialize the scanner for user input
    }

    // To display available movies
    public void displayMovies() {
        System.out.println("Here are the movies available:");
        dataLayer.browseMovies();
    }

    // To display movies containing a specific keyword
    public void searchMoviesByTitle() {
        System.out.print("Enter the title to search for: ");
        String title = scanner.nextLine();
        dataLayer.searchMoviesByTitle(title);
    }

    // To display movies with a specific language
    public void searchMoviesByLanguage() {
        System.out.print("Enter the language to search for: ");
        String language = scanner.nextLine();
        dataLayer.searchMoviesByLanguage(language);
    }

    // To display movies within a range of ratings
    public void searchMoviesByRating() {
        System.out.print("Enter the minimum IMDb rating: ");
        double minRating = scanner.nextDouble();
        System.out.print("Enter the maximum IMDb rating: ");
        double maxRating = scanner.nextDouble();
        dataLayer.searchMoviesByRating(minRating, maxRating);
    }
}
