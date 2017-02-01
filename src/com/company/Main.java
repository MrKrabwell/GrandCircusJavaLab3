package com.company;

import java.util.Scanner;

public class Main {

    /*****************************************************
     * This method asks the user for their integer input *
     *****************************************************/
    public static long getUserInteger() {
        // Variable declarations
        Scanner scnr = new Scanner(System.in);    // Scanner object for user input
        String junkText = "";                     // String object to throw away
        long userInteger = 0;                     // User inputted integer

        // Prompt user and get integer
        System.out.print("Enter an integer: ");
        userInteger = scnr.nextInt();
        junkText = scnr.nextLine();
        System.out.println("");

        // Return user Integer
        return userInteger;
    }

    /************************************************************************************
     * This method prints the square and cube of the number from 1 to the input number  *
     ************************************************************************************/
    public static void printSquareCubeNumbers(long number) {
        // Variable declarations
        byte columnWidthInt = 14;                                // Variable to hold the width of each column

        // Print heading
        System.out.format("%-" + columnWidthInt + "s", "Number");
        System.out.format("%-" + columnWidthInt + "s", "Squared");
        System.out.format("%-" + columnWidthInt + "s", "Cubed");
        System.out.println("");
        System.out.format("%-" + columnWidthInt + "s", "======");
        System.out.format("%-" + columnWidthInt + "s", "=======");
        System.out.format("%-" + columnWidthInt + "s", "======");
        System.out.println("");

        // Iterate from 1 to number, this loops prints each row
        for (int i = 1; i <= number; i++) {

            // Print the number before squaring or cubing
            System.out.format("%-" + columnWidthInt + "d", i);

            // Print the number squared
            System.out.format("%-" + columnWidthInt + "d",(long)Math.pow(i,2));

            // Print the number cubed
            System.out.format("%-" + columnWidthInt + "d", (long)Math.pow(i,3));

            // Next row
            System.out.println("");
        }

        // Print newline for clarity
        System.out.println("");

        return;
    }

    /************************************************************************
     * This method asks the user if they want to continue the program or no *
     * **********************************************************************/
    public static boolean askUserToContinue() {
        // Variable declarations
        String userInput = "";                  // User input string
        Scanner scan = new Scanner(System.in);  // Scanner object for user input

        // Prompt user to enter yes or no
        System.out.print("Continue? (y/n): ");
        userInput = scan.nextLine();

        // Validate whether user input is ok, and continue asking until right
        while (!userInput.equalsIgnoreCase("y") &&
                !userInput.equalsIgnoreCase("yes") &&
                !userInput.equalsIgnoreCase("n") &&
                !userInput.equalsIgnoreCase("no")) {
            System.out.print("That is not a valid input.  Please try again. ");
                    System.out.print("Do you want to continue? (y/n): ");
            userInput = scan.nextLine();
        }

        // Return true if user says yes, and false if user says no
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            System.out.println("");
            return true;
        } else {
            return false;
        }
    }

    /****************************
     * This is the main program *
     ****************************/
    public static void main(String[] args) {
	    // Variable declarations
        boolean continueProgram = true;     // boolean to continue program or not
        long integerNumber = 0;             // holds the integer to square and cube

        // Welcome message
        System.out.println("Learn your squares and cubes!\n");

        // Keep the program running until user decides to quit
        while (continueProgram) {
            // Get the integer input from the user
            integerNumber = getUserInteger();

            // Print the square and cube
            printSquareCubeNumbers(integerNumber);

            // Ask the user if they want to continue
            continueProgram = askUserToContinue();
        }

        // Exit message
        System.out.println("Goodbye!");

    }
}
