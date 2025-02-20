package src.primaryUseCases.browseMovies;

import src.primaryUseCases.manageMovies.manageMoviesDataLayer;
public class browseMoviesDataLayer {
    private manageMoviesDataLayer dataLayer;

    // Constructor to initialize with the existing dataLayer
    public browseMoviesDataLayer(manageMoviesDataLayer dataLayer) {
        this.dataLayer = dataLayer;
    }

    // Method to browse all movies
    public void browseMovies() {
        dataLayer.displayMovies(0); // Reuse the displayMovies method
    }

    // Method to search movies by title
    public void searchMoviesByTitle(String title) {
        dataLayer.searchMoviesByTitle(title);
    }

    // Method to search movies by language
    public void searchMoviesByLanguage(String language) {
        dataLayer.searchMoviesByLanguage(language);
    }

    // Method to search movies by IMDb rating range
    public void searchMoviesByRating(double minRating, double maxRating) {
        dataLayer.searchMoviesByRating(minRating, maxRating);
    }
    
}