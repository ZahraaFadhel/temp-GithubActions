package src.primaryUseCases.manageMovies;

/* 
The presentationLayer class is part of the Cinema Management System and serves as the user interface for staff members to manage movies. 
It interacts with the businessLayer to perform operations such as adding, updating, deleting, and displaying movies. 
The class provides a text-based menu-driven interface that allows users to select and execute these operations.
 */
import java.util.Scanner;
import src.helpers.consoleColors;
import src.helpers.validation;
public class manageMoviesPresentationLayer {

    private manageMoviesBusinessLayer businessLayer; // Reference to the business logic layer for handling movie operations
    private Scanner scanner; // Scanner object for reading user input from the console

    // Constructor to initialize the presentation layer
    public manageMoviesPresentationLayer(manageMoviesBusinessLayer businessLayer) {
        this.businessLayer = businessLayer; // Instantiate the business layer
        this.scanner = new Scanner(System.in); // Initialize the scanner for user input
    }

    // Method to start the application and display the menu
    public void start() {
        while (true) {
            // Display the main menu with colored text for better readability
            System.out.println(consoleColors.BLUE_BOLD + "\n--- Manage Movies ---" + consoleColors.RESET);
            System.out.println(consoleColors.GREEN_BOLD + "1. Add Movie" + consoleColors.RESET);
            System.out.println(consoleColors.GREEN_BOLD + "2. Update Movie" + consoleColors.RESET);
            System.out.println(consoleColors.GREEN_BOLD + "3. Delete Movie" + consoleColors.RESET);
            System.out.println(consoleColors.RED_BOLD + "4. Return to Main Menu" + consoleColors.RESET);
            System.out.println();
            
            // Read the user's choice
            int choice = validation.getValidIntegerInput("Enter your choice: ");

            if (choice > 4 || choice < 1) {
                System.out.print(consoleColors.RED_BOLD + "Invalid input. Please enter a valid number.\n" + consoleColors.RESET);
                continue;
            }

            // Perform the selected operation based on the user's choice
            switch (choice) {
                case 1:
                    businessLayer.addMovie(); // Call the business layer to add a movie
                    break;
                case 2:
                    businessLayer.updateMovie(); // Call the business layer to update a movie
                    break;
                case 3:
                    businessLayer.deleteMovie(); // Call the business layer to delete a movie
                    break;
                case 4:
                    System.out.println(consoleColors.YELLOW_BOLD + "\nReturning to main menu >>>" + consoleColors.RESET);
                    return; // Exit the application
                default:
                    System.out.println(consoleColors.RED_BOLD + "Invalid choice. Please try again." + consoleColors.RESET);
            }
        }
    }
}
