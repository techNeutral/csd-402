/*
Brett Fuller
CSD-402 Assignment 9.2 program 2
2/15/25
 */
//This program tests files in java. It will create a file if there is not one there and then write 10 random integers
//to the file and if the file is there it will append the integers. It then closes the file then reads the file and prints
//the data to the screen
import java.util.Scanner;
import java.io.*;
import java.util.Random;
public class FullerAssignment9p2 {
    public static void main(String[] args) {
        //code to either open or create the file
        java.io.File file = new java.io.File("files/data.file");
        Random random = new Random();
        int number = random.nextInt();
        Scanner reader;
        PrintWriter writer;
        //code to write to the file with exception handline in case the file does not exist or it cannot be written to.
        try{
            writer = new PrintWriter(new FileOutputStream(file, true));
            System.out.println();
            System.out.println("Write to the file at " + file.getAbsolutePath());
            for (int i = 0; i < 10; i++) {
                writer.print(random.nextInt());
                writer.print(" ");
            }
            //colse the file
            writer.close();
        }
        catch(IOException ioe){

            System.out.println("IOException has been thrown. - 1");
        }
        //open the file to read from it, includes error handling in case file is not there or cannot be read from.
        try{
            System.out.println();
            System.out.println("Reading file from " + file.getAbsolutePath());
            System.out.println();
            reader = new Scanner(file);

            while(reader.hasNext()){
                //print the contents to the screen
                System.out.print(reader.next() + " ");
            }
            //close the file
            reader.close();
        }
        catch(IOException ioe){

            System.out.println("IOException has been thrown. - 2");
        }
        System.out.println("\n");
    }
}