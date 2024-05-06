package myLearning;

import java.util.Scanner;

public class OddEven {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter 1st number: ");
	        int number1 = scanner.nextInt();
	        
	        System.out.print("Enter 2nd number: ");
	        int number2 = scanner.nextInt();
	        
	        if (number1 % 2 == 0) {
	            System.out.println(number1 + " is even.");
	        } else {
	            System.out.println(number2 + " is odd.");
	        }
	        
	        if (number2 % 2 != 0) {
	            System.out.println(number2 + " is odd.");
	        } else {
	            System.out.println(number1+ " is even.");
	        }

	       
	    }
}