/*
  The dataStore class manages the storage of movie data and cinema hall types.
  It contains a list of movies currently available in the cinema and different hall types.

    - The Movie inner class represents individual movies with attributes such as title, actors, language, and IMDb rating.
    - The HallType inner class defines different types of cinema halls, including VIP and standard seating details.
    - The class initializes sample movie and hall data for demonstration purposes.
*/

package src;

import java.util.ArrayList;
import java.util.List;

import src.helpers.consoleColors;

public class dataStore {
  private static List<Movie> movies; // List to store all movies
  private static List<HallType> halls; // List to store all hall types

  // Constructor to initialize movies and hall types
  public dataStore() {
    movies = new ArrayList<>();
    halls = new ArrayList<>();

    // Adding 4 sample movies for demonstration
    movies.add(new Movie("Inception", new String[] { "Leonardo DiCaprio", "Joseph Gordon-Levitt", "Ellen Page" },
        "A thief who enters the dreams of others.", 13, 8.8, "English", 148,
        new String[] { "10:00 AM", "1:00 PM", "4:00 PM", "7:00 PM", "10:00 PM" }, "IMAX"));

    movies.add(new Movie("Avatar", new String[] { "Sam Worthington", "Zoe Saldana", "Sigourney Weaver" },
        "A marine on an alien planet.", 13, 7.9, "English", 162,
        new String[] { "11:00 AM", "2:00 PM", "5:00 PM", "8:00 PM", "11:00 PM" }, "3D"));

    movies.add(new Movie("The Godfather", new String[] { "Marlon Brando", "Al Pacino", "James Caan" },
        "The rise of a mafia family.", 18, 9.2, "English", 175,
        new String[] { "12:00 PM", "3:00 PM", "6:00 PM", "9:00 PM", "12:00 AM" }, "Standard"));

    movies.add(new Movie("The Message", new String[] { "Anthony Quinn", "Irene Papas", "Michael Ansara" },
        "The story of Islam's prophet Muhammad.", 13, 8.2, "Arabic", 178,
        new String[] { "1:00 PM", "4:00 PM", "7:00 PM", "10:00 PM" }, "Standard"));

    // Initialize cinema halls
    createHalls();
  }

  // Getter method to retrieve the list of movies
  public static List<Movie> getMovies() {
    return movies;
  }

  // Setter method to update the list of movies
  public static void setMovies(List<Movie> m) {
    movies = m;
  }

  // Inner class representing a Movie
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

    // Getter and setter methods for movie attributes
    public String getTitle() {
      return title;
    }

    public void setTitle(String title) {
      this.title = title;
    }

    public String getSummary() {
      return summary;
    }

    public void setSummary(String summary) {
      this.summary = summary;
    }

    public int getAgeRestriction() {
      return ageRestriction;
    }

    public void setAgeRestriction(int ageRestriction) {
      this.ageRestriction = ageRestriction;
    }

    public double getImdbRating() {
      return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
      this.imdbRating = imdbRating;
    }

    public String getLanguage() {
      return language;
    }

    public void setLanguage(String language) {
      this.language = language;
    }

    public int getDuration() {
      return duration;
    }

    public void setDuration(int duration) {
      this.duration = duration;
    }

    // Override toString() to display movie details in a formatted manner
    @Override
    public String toString() {
      return (consoleColors.GREEN_BOLD + "Title: " + consoleColors.RESET + title +
          consoleColors.BLUE_BOLD + ", Language: " + consoleColors.RESET + language +
          consoleColors.BLUE_BOLD + ", IMDb: " + consoleColors.RESET + imdbRating);
    }
  }

  // Inner class representing different hall types in the cinema
  public static class HallType {
    private String hallName;
    private int numVipSeats;
    private double vipSeatPrice;
    private int numStandardSeats;
    private double standardSeatPrice;

    // Constructor to initialize hall details
    public HallType(String hallName, int numVipSeats, double vipSeatPrice, int numStandardSeats, double standardSeatPrice) {
      this.hallName = hallName;
      this.numVipSeats = numVipSeats;
      this.vipSeatPrice = vipSeatPrice;
      this.numStandardSeats = numStandardSeats;
      this.standardSeatPrice = standardSeatPrice;
    }

    // Method to display hall details
    public void displayHallDetails() {
      System.out.println("Hall Type: " + hallName);
      System.out.println("VIP Seats: " + numVipSeats + " | Price: " + vipSeatPrice + " BHD");
      System.out.println("Standard Seats: " + numStandardSeats + " | Price: " + standardSeatPrice + " BHD");
      System.out.println("--------------------------------------");
    }
  }

  // Method to initialize different hall types
  public void createHalls() {
    halls.add(new HallType("3D Hall", 15, 8.0, 30, 6.0));
    halls.add(new HallType("VIP Hall", 10, 10.0, 20, 7.0));
    halls.add(new HallType("IMAX Hall", 10, 9.0, 15, 7.0));
    halls.add(new HallType("Standard Hall", 20, 6.0, 40, 3.5));
  }

  // Getter method to retrieve the list of halls
  public static List<HallType> getHalls() {
    return halls;
  }

  // Method to display all hall details
  public static void displayAllHalls() {
    for (HallType hall : halls) {
      hall.displayHallDetails();
    }
  }

  // Main method to test the functionality
  public static void main(String[] args) {
    dataStore store = new dataStore(); // Create an instance of dataStore
    displayAllHalls(); // Display details of all halls
  }
}
