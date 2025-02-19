/* 
The presentationLayer class is part of the Cinema Management System and serves as the user interface for staff members to manage movies. 
It interacts with the businessLayer to perform operations such as adding, updating, deleting, and displaying movies. 
The class provides a text-based menu-driven interface that allows users to select and execute these operations.
*/

import java.util.Scanner;

public class presentationLayer {
    private businessLayer businessLayer; // Reference to the business logic layer for handling movie operations
    private Scanner scanner; // Scanner object for reading user input from the console

    // Constructor to initialize the presentation layer
    public presentationLayer() {
        this.businessLayer = new businessLayer(); // Instantiate the business layer
        this.scanner = new Scanner(System.in); // Initialize the scanner for user input
    }

    // Method to start the application and display the menu
    public void start() {
        while (true) {
            // Display the main menu with colored text for better readability
            System.out.println("\n\033[1;34m--- Manage Movies ---\033[0m");
            System.out.println("\033[1;32m1. Add Movie\033[0m");
            System.out.println("\033[1;32m2. Update Movie\033[0m");
            System.out.println("\033[1;32m3. Delete Movie\033[0m");
            System.out.println("\033[1;31m4. Return to Main Menu\033[0m");
            System.out.println();
            System.out.print("\033[1;33mEnter your choice: \033[0m");

            // Read the user's choice
            int choice = scanner.nextInt();
            scanner.nextLine();

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
                    System.out.println("\n\033[1;33mReturning to main menu >>>\033[0m");
                    return; // Exit the application
                default:
                    System.out.println("\033[1;31mInvalid choice. Please try again.\033[0m");
            }
        }
    }

    // Main method to start the application
    public static void main(String[] args) {
        presentationLayer app = new presentationLayer(); // Create an instance of the presentation layer
        app.start();
    }
}