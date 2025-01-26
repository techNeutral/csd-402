/*
Brett Fuller
CSD-402 Assignment 4.2
1/24/25
 */
//Program that demonstrates method overloading in Java.
public class FullerAssignment4 {
    //method that accepts an array of shorts prints out the array elements and returns the average.
    public static short average(short[] array){
        System.out.print("Elements in an Array of shorts: { ");
        int i = 0;
        int length = array.length;
        short total = 0;
        while(i < length){
            total = (short) (total + array[i]);
            System.out.print(array[i]);
            i++;
            if(i < length){System.out.print(", ");}
            else{System.out.print(" }");}
        }
        System.out.println();
        short average = (short) (total/length);
        return average;
    }
    //method that accepts an array of ints prints out the array elements and returns the average.
    public static int average(int[] array){
        int i = 0;
        int length = array.length;
        int total = 0;
        System.out.print("Elemnts in an Integer Array: { ");
        while(i < length){
            total = total + array[i];
            System.out.print(array[i]);
            i++;
            if(i < length){System.out.print(", ");}
            else{System.out.print(" }");}
        }
        System.out.println(); //for Readability
        int average = total/length;
        return average;
    }

    //method that accepts an array of longs prints out the array elements and returns the average.
    public static long average(long[] array){
        System.out.print("Elements in an Array of longs: { ");
        int i = 0;
        int length = array.length;
        long total = 0;
        while(i < length){
            total = (long) (total + array[i]);
            System.out.print(array[i]);
            i++;
            if(i < length){System.out.print(", ");}
            else{System.out.print(" }");}
        }
        System.out.println();
        long average = (long) (total/length);
        return average;
    }

    //method that accepts an array of doubles prints out the array elements and returns the average.
    public static double average(double[] array){
        System.out.print("Elements in an Array of doubles: { ");
        int i = 0;
        int length = array.length;
        double total = 0;
        while(i < length){
            total = (double) (total + array[i]);
            System.out.print(array[i]);
            i++;
            if(i < length){System.out.print(", ");}
            else{System.out.print(" }");}
        }
        System.out.println();
        double average = (double) (total/length);
        return average;
    }

    //main method that executes the code
    public static void main(String[] args) {
        //declare the four types of arrays of differing lengths and value types to illustrate the differences
        int[] intArray = {2, 4, 6, 8, 10};// 30 / 5 = 6
        short[] shortArray = {-10, -8, -4, 2, 4, 6, 8, 10, 20};
        long[] longArray = {-100000000000000000l, -8, -4, 2, 4, 6, 800, 100000000000000000l, 20, 34, 40, 60};
        double[] doubleArray = {2.2, 4.4, 5.5, 6.6, 8.8, 10.24};

        //blank line for readability
        System.out.println();

        //call the method for shorts
        short shortAvg = average(shortArray);
        System.out.println("Average value of array elements: " + shortAvg);
        System.out.println();

        //call the method for ints
        int intAvg = average(intArray);
        System.out.println("Average value of array elements: " + intAvg);
        System.out.println();

        //call the method for longs
        long longAvg = average(longArray);
        System.out.println("Average value of array elements: " + longAvg);
        System.out.println();

        //call the method for doubles
        double doubleAvg = average(doubleArray);
        System.out.println("Average value of array elements: " + doubleAvg);
        System.out.println();
    }
}