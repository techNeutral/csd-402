/*
Brett Fuller
CSD-402 Assignment 1.3
1/11/25
 */

import java.util.Scanner;

public class FullerAssignment1 {

    //Get values from users requires a string to prompt the user returns a double
    //I felt compelled to validate that the user entered a number, though not so much
    // that I worried about water being unable to be warmer than boiling unless pressurized.
    //So I consulted the following thread on stack overflow for help with the try catch and looping block
    //https://stackoverflow.com/questions/21783914/how-to-call-recursively-a-method-in-a-try-catch-block
    public static Double getNumber(String prompt) {
        double number = 0;
        boolean valid = false;
        boolean exceptionThrown = false;

        //Loop to check make sure that the user actually enters a number and prompt them until the do
        while (!valid) {
            System.out.print(prompt);
            try {
                Scanner input = new Scanner(System.in);
                number = input.nextDouble();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Please enter a valid number!");
                exceptionThrown = true;
            }
            if (!exceptionThrown){valid =true;}
            exceptionThrown = false;
        }

        return number;
    }

    public static void main(String[] args) {
        //initialize variables
        double waterMass;
        double initialTemperature;
        double finalTemperature;
        double Q;

        //Printing a blank line for readability
        System.out.println();

        //Call the function to get the values for the variables needed to calculate the required energy
        waterMass = getNumber("Please enter the mass in kilograms of the water: ");
        initialTemperature = getNumber("Please enter the starting temperature of the water: ");
        finalTemperature = getNumber("Please enter the final temperature of the water: ");

        //formula provided in the assignment
        Q = waterMass * (finalTemperature - initialTemperature) * 4184;

        //Printing a blank line for readability
        System.out.println();

        //Print the value of Q and then a description of what I am printing
        System.out.print(Q);
        System.out.println(" Joules are required to heat the water!");

    }
}