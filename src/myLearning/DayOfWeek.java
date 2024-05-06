package myLearning;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number between 1 and 7
        System.out.print("Enter a number between 1 and 7: ");
        
        // Read the integer input from the user
        int dayNumber = scanner.nextInt();

        // Determine the day of the week based on the input
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day number";
                break;
        }

        // Print the day of the week
        System.out.println("Day of the week: " + dayName);

        // Close the scanner
        scanner.close();
    }
}
