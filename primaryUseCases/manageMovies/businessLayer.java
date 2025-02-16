/*
The businessLayer class acts as the intermediary between the presentationLayer (user interface) and the dataLayer (data handling) in the Cinema Management System.
It contains the core logic for managing movies, including adding, updating, deleting, and displaying movies.
This class ensures that business rules (e.g., validation, constraints) are enforced before interacting with the data layer.
*/


package manageMovies;

import java.util.Scanner;

public class businessLayer {
    private dataLayer dataLayer; // Reference to the data layer for interacting with movie data
    private Scanner scanner; // Scanner object for reading user input from the console

    // Constructor to initialize the business layer
    public businessLayer() {
        this.dataLayer = new dataLayer(); // Instantiate the data layer
        this.scanner = new Scanner(System.in); // Initialize the scanner for user input
    }

    // Method to add a new movie
    public void addMovie() {
        System.out.print("\033[1;34mEnter movie title: \033[0m");
        String title = scanner.nextLine();
    
        // Check if a movie with the same title already exists
        if (dataLayer.getMovie(title) != null) {
            System.out.println("\033[1;31mMovie with this title already exists. Operation aborted.\033[0m");
            return; // Stop the operation if the movie exists
        }
    
        // Prompt for 3 main actors
        System.out.println("\033[1;34mEnter 3 main actors:\033[0m");
        String[] actors = new String[3];
        for (int i = 0; i < 3; i++) {
            actors[i] = scanner.nextLine();
        }
    
        // Prompt for movie summary
        System.out.print("\033[1;34mEnter summary: \033[0m");
        String summary = scanner.nextLine();
    
        // Prompt for age restriction
        System.out.print("\033[1;34mEnter age restriction: \033[0m");
        int ageRestriction = scanner.nextInt();
    
        // Prompt for IMDb rating with validation
        double imdbRating;
        while (true) {
            System.out.print("\033[1;34mEnter IMDb rating (0-10): \033[0m");
            imdbRating = scanner.nextDouble();
            scanner.nextLine();
            if (imdbRating >= 0 && imdbRating <= 10) {
                break; // Exit the loop if the rating is valid
            } else {
                System.out.println("\033[1;31mInvalid IMDb rating. Please enter a value between 0 and 10.\033[0m");
            }
        }
    
        // Prompt for language
        System.out.print("\033[1;34mEnter language: \033[0m");
        String language = scanner.nextLine();
    
        // Prompt for duration with validation
        int duration;
        while (true) {
            System.out.print("\033[1;34mEnter duration (in minutes, must be positive): \033[0m");
            duration = scanner.nextInt();
            scanner.nextLine();
            if (duration > 0) {
                break; // Exit the loop if the duration is valid
            } else {
                System.out.println("\033[1;31mInvalid duration. Please enter a positive value.\033[0m");
            }
        }
    
        // Prompt for 5 show times
        System.out.println("\033[1;34mEnter 5 show times:\033[0m");
        String[] showTimes = new String[5];
        for (int i = 0; i < 5; i++) {
            showTimes[i] = scanner.nextLine();
        }
    
        // Prompt for hall type
        System.out.print("\033[1;34mChoose hall type (VIP, 3D, IMAX, Standard): \033[0m");
        String hallType = scanner.nextLine();
    
        // Create the new movie object
        dataLayer.Movie movie = new dataLayer.Movie(title, actors, summary, ageRestriction, imdbRating, language, duration, showTimes, hallType);
    
        // Add movie to the data layer
        if (dataLayer.addMovie(movie)) {
            System.out.println("\033[1;32mMovie added successfully.\033[0m");
        } else {
            System.out.println("\033[1;31mFailed to add movie.\033[0m");
        }
    }

    // Method to update an existing movie
    public void updateMovie() {
        System.out.println("\033[1;34mAvailable Movies:\033[0m");
        dataLayer.displayMovies(1); // Display all available movies before updating
        
        // Prompt for the movie title to update
        System.out.print("\033[1;34mEnter the movie title to update: \033[0m");
        String title = scanner.nextLine();
    
        // Retrieve the movie from the data layer
        dataLayer.Movie movie = dataLayer.getMovie(title);
        if (movie == null) {
            System.out.println("\033[1;31mMovie not found.\033[0m");
            return;
        }
    
        // Show current movie details
        System.out.println("\033[1;34mCurrent Movie Details:\033[0m");
        dataLayer.displayMovies(1);
    
        // Prompt for the field to update
        System.out.println("\033[1;34mSelect field to update:\033[0m");
        System.out.println("1. Title\n2. Summary\n3. Age Restriction\n4. IMDb Rating\n5. Language\n6. Duration");
        System.out.print("\033[1;34mEnter choice: \033[0m");
        int option = scanner.nextInt();
        scanner.nextLine();
    
        // Update the selected field with validation
        switch (option) {
            case 1:
                System.out.print("\033[1;34mEnter new title: \033[0m");
                movie.setTitle(scanner.nextLine());
                break;
            case 2:
                System.out.print("\033[1;34mEnter new summary: \033[0m");
                movie.setSummary(scanner.nextLine());
                break;
            case 3:
                System.out.print("\033[1;34mEnter new age restriction: \033[0m");
                movie.setAgeRestriction(scanner.nextInt());
                scanner.nextLine(); // Consume newline
                break;
            case 4:
                // Validate IMDb rating (must be between 0 and 10)
                double newImdbRating;
                while (true) {
                    System.out.print("\033[1;34mEnter new IMDb rating (0-10): \033[0m");
                    newImdbRating = scanner.nextDouble();
                    scanner.nextLine();
                    if (newImdbRating >= 0 && newImdbRating <= 10) {
                        movie.setImdbRating(newImdbRating);
                        break; // Exit the loop if the rating is valid
                    } else {
                        System.out.println("\033[1;31mInvalid IMDb rating. Please enter a value between 0 and 10.\033[0m");
                    }
                }
                break;
            case 5:
                System.out.print("\033[1;34mEnter new language: \033[0m");
                movie.setLanguage(scanner.nextLine());
                break;
            case 6:
                // Validate duration (must be positive)
                int newDuration;
                while (true) {
                    System.out.print("\033[1;34mEnter new duration (in minutes, must be positive): \033[0m");
                    newDuration = scanner.nextInt();
                    scanner.nextLine();
                    if (newDuration > 0) {
                        movie.setDuration(newDuration);
                        break; // Exit the loop if the duration is valid
                    } else {
                        System.out.println("\033[1;31mInvalid duration. Please enter a positive value.\033[0m");
                    }
                }
                break;
            default:
                System.out.println("\033[1;31mInvalid option.\033[0m");
                return;
        }
    
        System.out.println("\033[1;32mMovie updated successfully.\033[0m");
    }        

    // Method to delete a movie
    public void deleteMovie() {
        System.out.println("\033[1;34mAvailable Movies:\033[0m");
        dataLayer.displayMovies(1); // Show all movies before deletion
    
        // Prompt for the movie title or substring to delete
        System.out.print("\033[1;34mEnter movie title or substring to delete: \033[0m");
        String title = scanner.nextLine();
    
        // Attempt to delete the movie
        if (dataLayer.deleteMovie(title)) {
            System.out.println("\033[1;32mMovie deleted successfully.\033[0m");
        } else {
            System.out.println("\033[1;31mNo movie found with that title.\033[0m");
        }
    }    

    // Method to display movies
    public void showMovies() {
        System.out.println("\033[1;34m1. Show all movies\033[0m");
        System.out.println("\033[1;34m2. Show by language\033[0m");
        System.out.print("\033[1;33mEnter your choice: \033[0m");
    
        int option = scanner.nextInt();
        scanner.nextLine();
    
        // Display movies based on the selected option
        if (option == 1) {
            dataLayer.displayMovies(1); // Show all movies
        } else if (option == 2) { // Filter by language
            System.out.print("\033[1;34mEnter language (English/Arabic): \033[0m");
            String language = scanner.nextLine();
            dataLayer.displayMoviesByLanguage(language);
        } else {
            System.out.println("\033[1;31mInvalid choice. Please try again.\033[0m");
        }
    }
}