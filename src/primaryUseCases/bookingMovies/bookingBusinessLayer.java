package src.primaryUseCases.bookingMovies;

import java.util.List;
import java.util.Scanner;
import src.helpers.consoleColors;
import src.dataStore;
import src.dataStore.Movie;
import src.dataStore.Booking;
import src.dataStore.HallType;

public class bookingBusinessLayer {
    private bookingDataLayer dataLayer;
    private Scanner scanner;

    // Constructor to initialize with the BookingdataLayer and Scanner
    public bookingBusinessLayer(bookingDataLayer dataLayer) {
        this.dataLayer = dataLayer;  // Instance of the BookingdataLayer
        this.scanner = new Scanner(System.in);  // Scanner to take input from the user
    }

    // Display the list of movies
    public void displayMovies() {
        System.out.println("Here are the movies available:");
        dataLayer.movies().forEach(movie -> System.out.println(movie));
    }

    // Book a movie
    public void bookMovie() {
        System.out.print("Enter the movie title to book: ");
        String movieTitle = scanner.nextLine().toLowerCase().trim();

        List<Movie> movies = dataStore.getMovies();
        Movie selectedMovie = null; // Variable to store the matched hall type

for (Movie m : movies) {
    if (m.getTitle().equalsIgnoreCase(movieTitle)) {  // Use .equals() for String comparison
        selectedMovie = m;
        break;  // Exit loop once we find a match
    }
}

if(selectedMovie == null){
    System.out.println("Invalid movie title.");
    return;
}

        System.out.print("Enter the showtime: ");
        String showTime = scanner.nextLine();



        // Check if the selected showtime exists
        boolean validShowtime = false;
        for (String time : selectedMovie.getShowTimes()) {
            if (time.equalsIgnoreCase(showTime)) {
                validShowtime = true;
                break;
            }
        }

        if (!validShowtime) {
            System.out.println(consoleColors.RED_BOLD + "Invalid showtime selected!" + consoleColors.RESET);
            return;
        }


// Check if a valid hall type was found before booking
    dataLayer.bookMovie(selectedMovie, showTime);  // Pass selectedHall
    }

    // View all bookings
    public void viewBookings() {
        System.out.println("Here are the current bookings:");
        dataLayer.viewBookings();
    }

    // Cancel a booking by booking ID
    public void cancelBooking() {
        System.out.print("Enter the booking ID to cancel: ");
        String bookingId = scanner.nextLine();
        dataLayer.cancelBooking(bookingId);  // Delegate to data layer to cancel the booking
    }
}
