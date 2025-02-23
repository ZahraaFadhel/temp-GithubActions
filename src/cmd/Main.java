package src.cmd;
/*
 * This is the main entry point for a cinema management system.
 * It provides users (customers & admins) with a menu to browse movies, book tickets, proceed to checkout,
 * and manage movie listings. The system takes user input and navigates to the 
 * appropriate use case based on their selection.
 * 
 * Features:
 * - Browse and search for movies.
 * - Book tickets for movies.
 * - Checkout and complete booking.
 * - Manage movies through an admin interface.
 * - Exit the system.
 * 
 * The system uses the consoleColors class for colored terminal output.
 */

import java.util.Scanner;
import src.primaryUseCases.browseMovies.*;
import src.primaryUseCases.manageMovies.*;
import src.primaryUseCases.manageMovies.manageMoviesDataLayer;
import src.dataStore;
import src.helpers.consoleColors;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    dataStore globalDataStore = new dataStore();
    manageMoviesDataLayer manageDataLayer = new manageMoviesDataLayer(globalDataStore);
    manageMoviesBusinessLayer manageBusinessLayer = new manageMoviesBusinessLayer(manageDataLayer);
    manageMoviesPresentationLayer usecase4 = new manageMoviesPresentationLayer(manageBusinessLayer);
    browseMoviesDataLayer browseDataLayer = new browseMoviesDataLayer(globalDataStore);
    browseMoviesBusinessLayer businessLayer = new browseMoviesBusinessLayer(browseDataLayer);
    browseMoviesPresentationLayer usecase1 = new browseMoviesPresentationLayer(businessLayer);

    while (true) {
      // Display the main menu options with colors
      System.out.println("\n" + consoleColors.CYAN_BOLD + "--- Cinema Management System ---" + consoleColors.RESET);
      System.out.println(consoleColors.GREEN_BOLD + "1. Browse Movies & Search" + consoleColors.RESET);
      System.out.println(consoleColors.GREEN_BOLD + "2. Booking Movies" + consoleColors.RESET);
      System.out.println(consoleColors.GREEN_BOLD + "3. Checkout" + consoleColors.RESET);
      System.out.println(consoleColors.GREEN_BOLD + "4. Manage Movies" + consoleColors.RESET);
      System.out.println(consoleColors.RED_BOLD + "5. Exit" + consoleColors.RESET);
      System.out.println();

      // Prompt the user for input
      System.out.print(consoleColors.YELLOW_BOLD + "Enter your choice: " + consoleColors.RESET);
      int choice = scanner.nextInt(); // Read user input
      scanner.nextLine();

      // Process user input based on menu selection
      switch (choice) {
        case 1:
        // Navigate to the browse movies section
       
        usecase1.start();
        break;
        case 2:
          System.out.println("Booking Movies Use Case");
          return;
        case 3:
          System.out.println("Checkout Use Case");
          return;
        case 4:
          // Navigate to the movie management section
          usecase4.start();
          break;
        case 5:
          // Exit the system
          System.out.println(consoleColors.RED_BOLD + "Exiting the system. Goodbye!" + consoleColors.RESET);
          return;
        default:
          // Handle invalid input
          System.out.println(consoleColors.RED_BOLD + "Invalid choice. Please try again." + consoleColors.RESET);
      }

    }
  }
}