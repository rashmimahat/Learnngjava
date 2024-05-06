package myLearning;

import java.util.Scanner;

public class CheckStringIgnoreCase {

	public static void main(String[] args) {
		
		 String courseName = "Diploma QA";

	        // Create a Scanner object to read input from the user
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter the course name
	        System.out.print("Enter the course name: ");
	        String userInput = scanner.nextLine();

	        // Check if the user input matches the course name (case insensitive)
	        if (userInput.equalsIgnoreCase(courseName)) {
	            System.out.println("User input matches the course name.");
	        } else {
	            System.out.println("User input does not match the course name.");
	        }

	        // Close the scanner
	        scanner.close();
	    }


	}


