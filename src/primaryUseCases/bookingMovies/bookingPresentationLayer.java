package src.primaryUseCases.bookingMovies;

import java.util.Scanner;
import src.helpers.consoleColors;

public class bookingPresentationLayer {

    private bookingBusinessLayer businessLayer;  // Reference to the business logic layer for handling booking operations
    private Scanner scanner;  // Scanner object for reading user input from the console

    // Constructor to initialize the presentation layer
    public bookingPresentationLayer(bookingBusinessLayer businessLayer) {
        this.businessLayer = businessLayer;  // Instantiate the business layer
        this.scanner = new Scanner(System.in);  // Initialize the scanner for user input
    }

    // Method to start the application and display the menu
    public void start() {
        while (true) {
            // Display the main menu for booking operations
            System.out.println(consoleColors.BLUE_BOLD + "\n--- Movie Booking ---" + consoleColors.RESET);
            System.out.println(consoleColors.GREEN_BOLD + "1. Book a Movie" + consoleColors.RESET);
            System.out.println(consoleColors.GREEN_BOLD + "2. View All Bookings" + consoleColors.RESET);
            System.out.println(consoleColors.GREEN_BOLD + "3. Cancel a Booking" + consoleColors.RESET);
            System.out.println(consoleColors.RED_BOLD + "4. Exit" + consoleColors.RESET);
            System.out.println();
            System.out.print(consoleColors.YELLOW_BOLD + "Enter your choice: " + consoleColors.RESET);
            // Validate input to prevent InputMismatchException
            if (!scanner.hasNextInt()) {
                System.out.println(consoleColors.RED_BOLD + "Invalid input. Please enter a number (1-4)." + consoleColors.RESET);
                scanner.next(); // Consume the invalid input
                continue; // Restart the loop
            }
            // Read the user's choice
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            // Perform the selected operation based on the user's choice
            switch (choice) {
                case 1:
                    businessLayer.bookMovie();  // Call business layer to book a movie
                    break;
                case 2:
                    businessLayer.viewBookings();  // Call business layer to view all bookings
                    break;
                case 3:
                    businessLayer.cancelBooking();  // Call business layer to cancel a booking
                    break;
                case 4:
                    System.out.println(consoleColors.YELLOW_BOLD + "\nExiting the system. Goodbye!" + consoleColors.RESET);
                    return;  // Exit the application
                default:
                    System.out.println(consoleColors.RED_BOLD + "Invalid choice. Please try again." + consoleColors.RESET);
            }

            // Ask user if they want to return to the main menu or exit
            returnToMainMenu();
        }
    }

    // Method to prompt the user to return to the main menu
    private void returnToMainMenu() {
        System.out.println(consoleColors.YELLOW_BOLD + "Go Back? (y/n)" + consoleColors.RESET);
        System.out.print(consoleColors.YELLOW_BOLD + "Enter your choice: " + consoleColors.RESET);
        
        
        int choice = scanner.next().charAt(0);
        scanner.nextLine();

        if (choice == 'y' || choice == 'Y') {
            System.out.println(consoleColors.YELLOW_BOLD + "\nReturning to booking menu >>>" + consoleColors.RESET);
        } else if (choice == 'n' || choice == 'N') {
            System.out.println(consoleColors.RED_BOLD + "Exiting the system. Goodbye!" + consoleColors.RESET);
            System.exit(0);
        } else {
            System.out.println(consoleColors.RED_BOLD + "Invalid choice. Returning to main menu." + consoleColors.RESET);
        }
    }
}
