package tests.browseMoviesTesting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.primaryUseCases.browseMovies.browseMoviesDataLayer;
import src.dataStore;
import src.dataStore.Movie;
import java.util.List;
import java.util.ArrayList;

public class testBrowsingDL  {

    private dataStore sampleDataStore;
    private browseMoviesDataLayer DL;

    // Setting up the sample data
    // This method is executed before each test
    @Before
    public void setUp() {

        // constructor already initializes the sample data

        sampleDataStore = new dataStore();
        DL = new browseMoviesDataLayer(sampleDataStore);
    }

    // TESTING DATA LAYER METHODS

    // Testing the retrieval of all movies
    @Test
    public void testRetrieveAllMovies() {
        // 4 is the number of movies in the sample data
        List<Movie> movies = DL.movies();
        Assert.assertEquals(4, movies.size());
    }

    // Testing the browsing of all movies
    @Test
    public void testBrowseMovies() {
        int displayedMoviesSize = DL.browseMovies();

        // Expecting all movies to be displayed
        Assert.assertEquals(displayedMoviesSize, DL.movies().size());
    }

    // Testing the retrieval of a single movie by title
    @Test
    public void testSearchMoviesByTitle() {
        // Searching for a movie that exists
        DL.searchMoviesByTitle("Inception");
        // Expecting a match
        Assert.assertTrue(DL.movies().stream().anyMatch(m -> m.getTitle().equalsIgnoreCase("Inception")));

        // Searching for a movie that doesn't exist
        DL.searchMoviesByTitle("Nonexistent Movie");
        // Expecting no matches
        Assert.assertFalse(DL.movies().stream().anyMatch(m -> m.getTitle().equalsIgnoreCase("Nonexistent Movie")));
    }

    // Testing the retrieval of movies by language
    @Test
    public void testSearchMoviesByLanguage() {
        // Searching for English movies
        DL.searchMoviesByLanguage("English");
        Assert.assertTrue(DL.movies().stream().anyMatch(m -> m.getLanguage().equalsIgnoreCase("English")));

        // Searching for a language that doesn't exist in the dataset
        DL.searchMoviesByLanguage("Spanish");
        Assert.assertFalse(DL.movies().stream().anyMatch(m -> m.getLanguage().equalsIgnoreCase("Spanish")));
    }

    // Testing the retrieval of movies by rating
    @Test
    public void testSearchMoviesByRating() {
        // Searching for movies within a specific rating range
        DL.searchMoviesByRating(8.5, 9.0);
        Assert.assertTrue(DL.movies().stream().anyMatch(m -> m.getImdbRating() >= 8.5 && m.getImdbRating() <= 9.0));

        // Searching for movies outside the available rating range
        DL.searchMoviesByRating(5.0, 6.0);
        Assert.assertFalse(DL.movies().stream().anyMatch(m -> m.getImdbRating() >= 5.0 && m.getImdbRating() <= 6.0));
    }
}