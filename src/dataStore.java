package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import src.helpers.consoleColors;

public class dataStore {
  private static List<Movie> movies; // List to store all movies
  private static List<Booking> bookings; // List to store all bookings
  private static List<HallType> halls; // List to store all hall types

  public dataStore() {
    movies = new ArrayList<>();
    bookings = new ArrayList<>();
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

    halls.add(new HallType("3D", 6.0));
    halls.add(new HallType("VIP",  7.0));
    halls.add(new HallType("IMAX",7.0));
    halls.add(new HallType("Standard",3.5));

       
         // Adding sample bookings
        bookings.add(new Booking(movies.get(0), "1:00 PM"));
        bookings.add(new Booking(movies.get(1), "11:00 AM"));
        bookings.add(new Booking(movies.get(2),  "12:00 PM"));
        bookings.add(new Booking(movies.get(3),  "4:00 PM"));
  }

  public static List<Movie> getMovies() {
    return movies;
  }

  public static void setMovies(List<Movie> m) {
    movies = m;
  }
     // Getters and setters for bookings
     public static List<Booking> getBookings() {
      return bookings;
  }

  public static void setBookings(List<Booking> b) {
      bookings = b;
  }



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

    public String[] getShowTimes() {
      return showTimes;
  }

  public String getHallType(){
    return hallType;
  }

    // Override toString() to display movie details
    @Override
    public String toString() {
      return (consoleColors.GREEN_BOLD + "Title: " + consoleColors.RESET + title +
          consoleColors.BLUE_BOLD + ", Language: " + consoleColors.RESET + language +
          consoleColors.BLUE_BOLD + ", IMDb: " + consoleColors.RESET + imdbRating) +
          consoleColors.BLUE_BOLD + ", Showtimes: " + consoleColors.RESET + String.join(", ", showTimes);
    }
  }

  public static class Booking {

    private String bookingId;
    private Movie movie;
    private String hallType;
    private String showTime; 

    // Static variable to generate a unique booking ID
    private static int idCounter = 1;  // Starts with "B001", increments with each new booking

    // Constructor to initialize a booking object 
    public Booking(Movie movie, String showTime) {
        this.bookingId = generateBookingId();  // Automatically generate the ID
        this.movie = movie;
        this.hallType = movie.getHallType();
        this.showTime = showTime;
    }

    // Method to generate booking IDs ("B001", "B002", "B003", etc.)
    private String generateBookingId() {
        return "B" + String.format("%03d", idCounter++);  // Increment the counter and return the formatted ID
    }

    // Getter for bookingId
    public String getBookingId() {
        return bookingId;
    }

    // Getter for movie title
    public String getMovieTitle() {
        return movie.getTitle();
    }

    // Override toString() to display booking details
    @Override
    public String toString() {
      double price = 0;
      for (HallType h: halls){
        if(movie.getHallType().equalsIgnoreCase(h.hallName)){
          price = h.price;
        }
      }

        return (consoleColors.GREEN_BOLD + "Booking ID: " + consoleColors.RESET + bookingId +
                consoleColors.BLUE_BOLD + ", Movie Title: " + consoleColors.RESET + movie.getTitle() + 
                consoleColors.BLUE_BOLD + ", Show time: " + consoleColors.RESET + showTime +
                consoleColors.BLUE_BOLD + ", Hall Type: " + consoleColors.RESET + movie.hallType +
                consoleColors.BLUE_BOLD + ", Hall Seat Price: " + consoleColors.RESET + price
                );
    }
}

  // Inner class representing different hall types in the cinema
  public static class HallType {
    public String hallName;
    private double price;

    // Constructor to initialize hall details
    public HallType(String hallName, double price) {
      this.hallName = hallName;
      this.price = price;
    }

    // Method to display hall details
    public void displayHallDetails() {
      System.out.println("Hall Type: " + hallName);
      System.out.println("Hall Price: " + price);
      System.out.println("--------------------------------------");
    }

    public String getHallName(){
      return hallName;
    }
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
}