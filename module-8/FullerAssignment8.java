/*
Brett Fuller
CSD-402 Assignment 8.2
2/15/25
 */

//This program populates an arrayList with integers and then calls a method in a class to find the max value in the list.

import java.util.ArrayList;
import java.util.Scanner;
public class FullerAssignment8{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 1;
        //Declare two array lists, the first one to fill out the second to test an empty list
        ArrayList<Integer> myArrayList = new ArrayList<>();
        ArrayList<Integer> emptyArrayList = new ArrayList<>();

        //looping structure that will loop until the number 0 is entered.
        // Per instructions the number 0 is added to the list when entered.
        while(number != 0) {
            //variables needed for exception handling in user input
            boolean valid = false;
            boolean exceptionThrown = false;
            while (!valid) {
                System.out.println("Please enter an integer to add to the list! Enter 0 to exit!");
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
            myArrayList.add(number);
        }
        //lines of code to get and print the highest value in the list
        System.out.println();
        System.out.println("The max value in the array list is:");
        System.out.println(FullerArrayListTest.max(myArrayList));
        System.out.println();
        System.out.println("Testing an empty array list:");
        System.out.println("The max value in the array list is:");
        System.out.println(FullerArrayListTest.max(emptyArrayList));

    }
}

//Class that accepts an array list of integers and returns the max value through the max method
class FullerArrayListTest{
    public static Integer max(ArrayList<Integer> list){
        //by setting max at 0 and returning that value I return the highest value even if the list is empty
        Integer max = 0;
        //code that finds the max value only executes if there are elements in the list.
        if(list.size() > 0){
            for (Integer i : list){
                if (max < i){
                    max = i;
                }
            }
        }
        return max;
    }
}