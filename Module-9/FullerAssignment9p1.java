/*
Brett Fuller
CSD-402 Assignment 9.2 program 1
2/15/25
 */
//Program that shows a list of items (NFL teams) to the user and then asks the user which team they want to see more of
// and then the program show them that element.
import java.util.Scanner;
import java.util.ArrayList;
public class FullerAssignment9p1 {
    //Method to get an integer from the user so they can show what team they want to see again.
    //If I were doing this for real I would limit their inputs to numbers that fall inside of the index range
    //instead of relying on exception handling when getting the entry later.
    //I utilize exception handling to ensure they enter an integer and not some other unexpected value.
    public static int getIntFromUserInput(Scanner input) {
        boolean valid = false;
        boolean exceptionThrown = false;
        int number = 0;
        while (!valid) {
            System.out.println("Please enter the team number for the team you would like to see again: ");
            try {
                number = input.nextInt();
            } catch (java.util.InputMismatchException e) {
                exceptionThrown = true;
                //thank you Stack overflow for ending the horrible infinite loop I was seeing here with input.next()
                //https://stackoverflow.com/questions/22514156/java-why-does-try-catch-block-within-a-loop-executes-only-once/22514393
                input.next();
            }
            if (!exceptionThrown) {
                valid = true;
            } else {
                System.out.println("Please enter a valid integer!");
            }
            exceptionThrown = false;
        }
        return number;
    }
    //Method to return the entry in the array the user selects.
    //Implemented exception handling in case the user enters a number outside of the acceptable range.
    public static void displayTeamFromIndex(ArrayList<String> list, int index){
        boolean exceptionThrown = false;
        String element = null;
        try {
            element = list.get(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
            exceptionThrown = true;
        }
        if(!exceptionThrown){
            System.out.println("team #" + index + " " + element);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Declare my array list and fill it with several (not all) NFL teams.
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Chiefs");
        myList.add("Bills");
        myList.add("Eagles");
        myList.add("Bears");
        myList.add("Commanders");
        myList.add("Lions");
        myList.add("Seahawks");
        myList.add("49ers");
        myList.add("Patriots");
        myList.add("Vikings");
        myList.add("Packers");
        myList.add("Browns");
        myList.add("Ravens");
        myList.add("Steelers");
        myList.add("Giants");
        myList.add("Jets");
        myList.add("Falcons");
        myList.add("Saints");
        //for each loop to display all the teams. I also have an iterator so I can show the index value so the user can
        //ask for the correct entry to be shown again. I wan't sure if you wanted sting comparisons or integer indexes
        //but this made the most sense to me.
        int i = 0;
        for (String team : myList) {
            System.out.println("team #" + i + " " + team);
            i++;
        }
        int number = getIntFromUserInput(input);
        displayTeamFromIndex(myList, number);

    }

}