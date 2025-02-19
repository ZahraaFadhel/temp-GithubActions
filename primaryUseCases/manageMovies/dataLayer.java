/*
The dataLayer class is responsible for managing the data of movies in the Cinema Management System.
It stores a list of Movie objects and provides methods to add, retrieve, delete, and display movies.
The class ensures data integrity by validating movie attributes (e.g., IMDb rating and duration) before adding them to the list.
It also provides functionality to filter and display movies based on specific criteria, such as language
*/

import java.util.ArrayList;
import java.util.List;

public class dataLayer {
    private List<Movie> movies; // List to store all movies

    // Constructor to initialize the data layer with sample movies
    public dataLayer() {
        movies = new ArrayList<>();
        // Adding 4 sample movies for demonstration
        movies.add(new Movie("Inception", new String[]{"Leonardo DiCaprio", "Joseph Gordon-Levitt", "Ellen Page"}, 
            "A thief who enters the dreams of others.", 13, 8.8, "English", 148, 
            new String[]{"10:00 AM", "1:00 PM", "4:00 PM", "7:00 PM", "10:00 PM"}, "IMAX"));

        movies.add(new Movie("Avatar", new String[]{"Sam Worthington", "Zoe Saldana", "Sigourney Weaver"}, 
            "A marine on an alien planet.", 13, 7.9, "English", 162, 
            new String[]{"11:00 AM", "2:00 PM", "5:00 PM", "8:00 PM", "11:00 PM"}, "3D"));

        movies.add(new Movie("The Godfather", new String[]{"Marlon Brando", "Al Pacino", "James Caan"}, 
            "The rise of a mafia family.", 18, 9.2, "English", 175, 
            new String[]{"12:00 PM", "3:00 PM", "6:00 PM", "9:00 PM", "12:00 AM"}, "Standard"));

        movies.add(new Movie("The Message", new String[]{"Anthony Quinn", "Irene Papas", "Michael Ansara"}, 
            "The story of Islam's prophet Muhammad.", 13, 8.2, "Arabic", 178, 
            new String[]{"1:00 PM", "4:00 PM", "7:00 PM", "10:00 PM"}, "Standard"));
    }

    // Method to add a movie to the list
    public boolean addMovie(Movie movie) {
        // Validate IMDb rating and duration before adding the movie
        if (movie.getImdbRating() < 0 || movie.getImdbRating() > 10) {
            System.out.println("\033[1;31mInvalid IMDb rating. Must be between 0 and 10.\033[0m");
            return false;
        }
        if (movie.getDuration() <= 0) {
            System.out.println("\033[1;31mInvalid duration. Must be a positive value.\033[0m");
            return false;
        }

        // Check if a movie with the same title already exists
        for (Movie m : movies) {
            if (m.getTitle().equalsIgnoreCase(movie.getTitle())) {
                System.out.println("\033[1;31mMovie with this title already exists.\033[0m");
                return false; // Movie already exists
            }
        }

        // Add the movie to the list
        movies.add(movie);
        return true;
    }

    // Method to retrieve a movie by title
    public Movie getMovie(String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                return movie;
            }
        }
        return null; // Movie not found
    }

    // Method to delete a movie by title or substring
    public boolean deleteMovie(String title) {
        // Remove movies whose titles contain the given substring (case-insensitive)
        return movies.removeIf(movie -> movie.getTitle().toLowerCase().contains(title.toLowerCase()));
    }

    // Method to display all movies or filter by language
    public void displayMovies(int option) {
        if (movies.isEmpty()) {
            System.out.println("\033[1;31mNo movies available.\033[0m");
            return;
        }

        // Display all movies
        for (Movie movie : movies) {
            System.out.println(movie);
        }
        System.out.println();
    }

    // Inner Movie class to represent a movie
    public static class Movie {
        private String title, summary, language, hallType;
        private String[] actors, showTimes;
        private int ageRestriction, duration;
        private double imdbRating;

        // Constructor to initialize a movie object
        public Movie(String title, String[] actors, String summary, int ageRestriction, double imdbRating, 
                     String language, int duration, String[] showTimes, String hallType) {
            this.title = title;
            this.actors = actors;
            this.summary = summary;
            this.ageRestriction = ageRestriction;
            this.imdbRating = imdbRating;
            this.language = language;
            this.duration = duration;
            this.showTimes = showTimes;
            this.hallType = hallType;
        }

        // Getters and setters for movie attributes
        public String getTitle() { return title; }
        public void setTitle(String title) { this.title = title; }
        public String getSummary() { return summary; }
        public void setSummary(String summary) { this.summary = summary; }
        public int getAgeRestriction() { return ageRestriction; }
        public void setAgeRestriction(int ageRestriction) { this.ageRestriction = ageRestriction; }
        public double getImdbRating() { return imdbRating; }
        public void setImdbRating(double imdbRating) { this.imdbRating = imdbRating; }
        public String getLanguage() { return language; }
        public void setLanguage(String language) { this.language = language; }
        public int getDuration() { return duration; }
        public void setDuration(int duration) { this.duration = duration; }

        // Override toString() to display movie details
        @Override
        public String toString() {
            return "\033[1;32mTitle:\033[0m " + title + ", \033[1;34mLanguage:\033[0m " + language + ", \033[1;33mIMDb:\033[0m " + imdbRating;
        }
    }
}