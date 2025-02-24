package src.helpers;

/**
 * Utility class for ANSI escape codes to add colors to console output. Used
 * throughout the project for consistent and maintainable text styling.
 */
public class consoleColors {

    public static final String RESET = "\033[0m";  // Reset to default color
    public static final String BLUE_BOLD = "\033[1;34m";
    public static final String GREEN_BOLD = "\033[1;32m";
    public static final String DARK_GREEN_BOLD = "\033[1;38;5;28m";
    public static final String RED_BOLD = "\033[1;31m";
    public static final String YELLOW_BOLD = "\033[1;33m";
    public static final String CYAN_BOLD = "\033[1;36m";
}
