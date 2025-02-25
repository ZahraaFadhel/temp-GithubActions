package src.primaryUseCases.browseMovies;

import java.util.Scanner;
import src.helpers.consoleColors;
import src.helpers.validation;

public class browseMoviesPresentationLayer {

    private browseMoviesBusinessLayer businessLayer; // Reference to the business logic layer for handling movie
    // operations
    private Scanner scanner; // Scanner object for reading user input from the console

    // Constructor to initialize the presentation layer
    public browseMoviesPresentationLayer(browseMoviesBusinessLayer businessLayer) {
        this.businessLayer = businessLayer; // Instantiate the business layer
        this.scanner = new Scanner(System.in); // Initialize the scanner for user input
    }

    // Method to start the application and display the menu
    public void start() {
        while (true) {
            // Display the main menu with colored text for better readability
            System.out.println(consoleColors.BLUE_BOLD + "\n--- Browse & Search Movies ---" + consoleColors.RESET);
            System.out.println(consoleColors.GREEN_BOLD + "1. Browse Movies" + consoleColors.RESET);
            System.out.println(consoleColors.GREEN_BOLD + "2. Search Movie by title" + consoleColors.RESET);
            System.out.println(consoleColors.GREEN_BOLD + "3. Search Movie by language" + consoleColors.RESET);
            System.out.println(consoleColors.GREEN_BOLD + "4. Search Movie by rating" + consoleColors.RESET);
            System.out.println(consoleColors.RED_BOLD + "5. Return to Main Menu" + consoleColors.RESET);
            System.out.println();
            
            // Read the user's choice
            int choice = validation.getValidIntegerInput("Enter your choice: ");

            if (choice > 5 || choice < 1) {
                System.out.print(consoleColors.RED_BOLD + "Invalid input. Please enter a valid number.\n" + consoleColors.RESET);
                continue;
            }

            // Perform the selected operation based on the user's choice
            switch (choice) {
                case 1:
                    businessLayer.displayMovies(); // Call the business layer to display Movies
                    returnToMainMenu(); // Prompt the user to return to the main menu
                    break;
                case 2:
                    businessLayer.searchMoviesByTitle(); // Call the business layer to search by title
                    returnToMainMenu();
                    break;
                case 3:
                    businessLayer.searchMoviesByLanguage(); // Call the business layer to search by language
                    returnToMainMenu();
                    break;
                case 4:
                    businessLayer.searchMoviesByRating(); // Call the business layer to search by rating
                    returnToMainMenu();
                    break;
                case 5:
                    System.out.println(consoleColors.YELLOW_BOLD + "\nReturning to main menu >>>" + consoleColors.RESET);
                    return;
                default:
                    System.out.println(consoleColors.RED_BOLD + "Invalid choice. Please try again." + consoleColors.RESET);
            }
        }
    }

    // Method to prompt the user to return to the main menu
    private void returnToMainMenu() {
        System.out.println(consoleColors.YELLOW_BOLD + "Go Back? (y/n)" + consoleColors.RESET);
        System.out.print(consoleColors.YELLOW_BOLD + "Enter your choice: " + consoleColors.RESET);

        int choice = scanner.next().charAt(0);
        scanner.nextLine();

        if (choice == 'y' || choice == 'Y') {
            System.out.println(consoleColors.YELLOW_BOLD + "\nReturning to browsing menu >>>" + consoleColors.RESET);
            return; // Return to the main menu
        } else if (choice == 'n' || choice == 'N') {
            // Exit the system
            System.out.println(consoleColors.RED_BOLD + "Exiting the system. Goodbye!" + consoleColors.RESET);
            System.exit(0);
        } else {
            System.out.println(consoleColors.RED_BOLD + "Invalid choice. Returning to main menu." + consoleColors.RESET);
            return; // Return to the main menu
        }
    }

    // Main method to start the application
    // public static void main(String[] args) {
    //   manageMoviesDataLayer dataLayer = new manageMoviesDataLayer(); // Create an instance of the data layer
    //   browseMoviesPresentationLayer app = new browseMoviesPresentationLayer(dataLayer); // Create an instance of the
    //                                                                                     // presentation layer
    //   app.start();
    // }
}
