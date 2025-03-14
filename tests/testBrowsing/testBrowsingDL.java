package tests.testBrowsing;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.primaryUseCases.browseMovies.browseMoviesDataLayer;
import src.dataStore;
import src.dataStore.Movie;
import java.util.List;
import java.util.ArrayList;

public class testBrowsingDL {

    private dataStore sampleDataStore;
    private browseMoviesDataLayer DL;

    // Setting up the sample data
    // This method is executed before each test
    @Before
    public void setUp() {
        sampleDataStore = new dataStore();
        List<Movie> sampleMovies = new ArrayList<>();

        sampleMovies.add(new Movie("Inception", new String[] { "Leonardo DiCaprio" },
                "A mind-bending thriller", 13, 8.8, "English", 148, new String[] { "12:00 PM", "6:00 PM" }, "IMAX"));

        sampleMovies.add(new Movie("Parasite", new String[] { "Song Kang-ho" },
                "A dark satire of social inequality", 15, 8.6, "Korean", 132, new String[] { "2:00 PM", "8:00 PM" },
                "Standard"));

        sampleMovies.add(new Movie("Interstellar", new String[] { "Matthew McConaughey" },
                "A sci-fi epic exploring space and time", 10, 8.7, "English", 169,
                new String[] { "4:00 PM", "10:00 PM" }, "4DX"));

        sampleMovies.add(new Movie("Amélie", new String[] { "Audrey Tautou" },
                "A whimsical romantic comedy", 12, 8.3, "French", 122, new String[] { "5:00 PM", "9:00 PM" },
                "Standard"));

        sampleDataStore.setMovies(sampleMovies);
        DL = new browseMoviesDataLayer(sampleDataStore);
    }

    // Testing the data layer methods

    // Testing the retrieval of all movies
    @Test
    public void testRetrieveAllMovies() {
        List<Movie> movies = DL.movies();
        Assert.assertEquals(4, movies.size());
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