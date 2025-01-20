/*
Brett Fuller
CSD-402 Assignment 2.2
1/13/25
 */

//I need to be able to get user input and a random number so importing the classes below
import java.util.Scanner;
import java.util.Random;

/*The program should randomly generate the number of 1, 2, or 3 with 1 being Rock, 2 being Paper, and 3 being Scissors.
This will be the computer’s selection in the game. Then, the program should prompt the user to enter a
value of 1, 2, or 3. This will be the user’s selection in the game. Next, the program should display a clear
readable message displaying both the computer’s selection, the user’s selection, and the results of the game played.
 */
public class FullerAssignment2 {
    //This function gets data from the user validating the user entered an int between 1 & 3 and returns the int.
    public static int getRPSFromPlayer(){
        int number = 0;
        boolean valid = false;
        boolean exceptionThrown = false;


        //Loop to check make sure that the user actually enters a number between 1 & 3and prompt them until the do
        while (!valid) {
            System.out.println();
            System.out.println("Welcome a game of Rock Paper Scissors!");
            System.out.printf("In this game upi will sesect a number to represent Rock Paper or Scissors:\n" +
                    "Press 1 for Rock!\n" +
                    "Press 2 for Paper!\n" +
                    "Press 3 for Scissors!\n");
            System.out.print("Please enter a number between 1 and 3: ");
            try {
                Scanner input = new Scanner(System.in);
                number = input.nextInt();
            } catch (java.util.InputMismatchException e) {
                exceptionThrown = true;
            }
            if (!exceptionThrown && number >= 1 && number <= 3){valid =true;}
            else{
                System.out.println("Please enter a valid number between 1 and 3!");
            }
            exceptionThrown = false;
        }

        return number;
    }

    //This function converts a number to the string value for rock, paper, or scissors.
    public static String getRockPaperScissorFromNumber(int number){
        String rps = null;
        switch(number){
            case 1:
                rps = "Rock";
                break;
            case 2:
                rps = "Paper";
                break;
            case 3:
                rps = "Scissors";
                break;
            default:
                System.out.println("Invalid number");
                System.exit(0);
                break;
        }
        return rps;
    }

    //This function checks to see if the player or the computer won the round and returns a string stating the results.
    public static String getGameResults(int playerChoice,int computerChoice){
        String result = null;
        if(playerChoice == computerChoice){
            result = "Tied. Your game ended in a draw.";
        }
        else{
            switch(playerChoice){
                case 1:
                    if (computerChoice == 2){
                        result = "You Lose: Paper covers Rock";
                    }
                    if (computerChoice == 3){
                        result = "You Win!!! Rock breaks Scissors";
                    }
                    break;
                case 2:
                    if (computerChoice == 1){
                        result = "You Win! Paper covers Rock";
                    }
                    if (computerChoice == 3){
                        result = "You Lose: Scissors cut Paper";
                    }
                    break;
                case 3:
                    if (computerChoice == 2){
                        result = "You Win! Scissors cut Paper";
                    }
                    if (computerChoice == 1){
                        result = "You Lose: Rock breaks Scissors";
                    }
            }
        }
        return result;
    }

    //Main method that steps through the necessary steps.
    public static void main(String[] args) {
        Random random = new Random();
        // Generate a random integer between 1 and 3.
        int computerChoice = random.nextInt(1, 4);
        //System.out.println(computerChoice);
        String computerRPS = getRockPaperScissorFromNumber(computerChoice);
        int userNumber = getRPSFromPlayer();
        //System.out.println(userNumber);
        String userRPS = getRockPaperScissorFromNumber(userNumber);
        //System.out.println(userRPS);
        String gameResults = getGameResults(userNumber, computerChoice);
        //Adds line for readability and sets computers anwer to red
        System.out.println("\u001B[31m");
        System.out.printf("Computer Chose: %s\n", computerRPS);
        //Sets players anser to green
        System.out.print("\u001B[32m");
        System.out.printf("You Chose: %s\n", userRPS);
        //Resets text color to default and adds a line for readability
        System.out.println("\u001B[0m");
        System.out.println(gameResults);
        System.out.println();
    }
}

