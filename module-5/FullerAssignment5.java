/*
Brett Fuller
CSD-402 Assignment 5.2
1/31/25
 */

/*In this assignment we write methods for finding the location of the largest and smallest values in
two dimensional arrays of integers and doubles. This particular assignment more than any other illustrates the
 challenges of having a strongly typed language. Aside from changing a couple of variable names for clarity the
 only real difference in the code for any of these is changing the symbol for > to < when doing greater or less than
 comparisons. Hopefully we later learn how to write a single method that can handle an int, or double or any other
 type because this seems like a nightmare, in order to maintain what basically boils down to 4 nearly identical methods.
 */
public class FullerAssignment5{
    //method to find the location of the first instance of the largest value, and return that in an array.
    public static int [ ] locateLargest (double [ ][ ] arrayParam){
        int i = 0;
        int arrayLength = arrayParam.length;
        int arrayHeight = 0;
        int largestIndex[] = {0,0};
        //looping structure for x values
        while(i < arrayLength){
            int j = 0;
            arrayHeight = arrayParam[i].length;
            //looping structure for y values this gives us our actual x,y values and then we compare values to store
            //the location of the highesyt value in largestIndex
            while(j < arrayHeight){
                if(arrayParam[i][j] > arrayParam[largestIndex[0]][largestIndex[1]]){
                    largestIndex[0] = i;
                    largestIndex[1] = j;
                    System.out.println("Largest value has been updated: "
                            + arrayParam[largestIndex[0]][largestIndex[1]]);
                }
                j++;
            }

            i ++;
        }
        System.out.println(
                "The locatkon of the first instance of the highest value " +
                        "is at: " + largestIndex[0] + ", " + largestIndex[1]);
        return largestIndex;
    }
    //indentical method to the one above there are no changes in the code except for in the expected type
    // it finds the location of the first instance of the largest value, and return that in an array.
    public static int [ ] locateLargest (int [ ][ ] arrayParam){
        int i = 0;
        int arrayLength = arrayParam.length;
        int arrayHeight = 0;
        int largestIndex[] = {0,0};
        //looping structure for x values
        while(i < arrayLength){
            int j = 0;
            arrayHeight = arrayParam[i].length;
            //looping structure for y values this gives us our actual x,y values and then we compare values to store
            //the location of the highesyt value in largestIndex
            while(j < arrayHeight){
                if(arrayParam[i][j] > arrayParam[largestIndex[0]][largestIndex[1]]){
                    largestIndex[0] = i;
                    largestIndex[1] = j;
                    System.out.println("Largest value has been updated: "
                            + arrayParam[largestIndex[0]][largestIndex[1]]);
                }
                j++;
            }

            i ++;
        }
        System.out.println(
                "The locatkon of the first instance of the highest value " +
                        "is at: " + largestIndex[0] + ", " + largestIndex[1]);
        return largestIndex;
    }
    //Nearly identical to the methods above with the only notable exception being renaming a variable for clairty and
    // changing the > symbol in the comparison to a >
    // it finds the location of the first instance of the smallest value, and return that in an array.
    public static int [ ] locateSmallest (double [ ][ ] arrayParam){
        int i = 0;
        int arrayLength = arrayParam.length;
        int arrayHeight = 0;
        int smallestIndex[] = {0,0};
        //looping structure for x values
        while(i < arrayLength){
            int j = 0;
            arrayHeight = arrayParam[i].length;
            // looping structure for y values this gives us our actual x,y values and then we compare values to store
            //the location of the smallest value in smallestIndex
            while(j < arrayHeight){
                if(arrayParam[i][j] < arrayParam[smallestIndex[0]][smallestIndex[1]]){
                    smallestIndex[0] = i;
                    smallestIndex[1] = j;
                    System.out.println("Smallest value has been updated: "
                            + arrayParam[smallestIndex[0]][smallestIndex[1]]);
                }
                j++;
            }

            i ++;
        }
        System.out.println(
                "The locatkon of the first instance of the lowest value " +
                        "is at: " + smallestIndex[0] + ", " + smallestIndex[1]);
        return smallestIndex;
    }
    //indentical method to the one above there are no changes in the code except for in the expected type.
    // it finds the location of the first instance of the smallest value, and return that in an array.
    public static int [ ] locateSmallest (int [ ][ ] arrayParam) {
        int i = 0;
        int arrayLength = arrayParam.length;
        int arrayHeight = 0;
        int smallestIndex[] = {0, 0};
        //looping structure for x values
        while (i < arrayLength) {
            int j = 0;
            arrayHeight = arrayParam[i].length;
            // looping structure for y values this gives us our actual x,y values and then we compare values to store
            //the location of the smallest value in smallestIndex
            while (j < arrayHeight) {
                if (arrayParam[i][j] < arrayParam[smallestIndex[0]][smallestIndex[1]]) {
                    smallestIndex[0] = i;
                    smallestIndex[1] = j;
                    System.out.println("Smallest value has been updated: "
                            + arrayParam[smallestIndex[0]][smallestIndex[1]]);
                }

                j++;
            }

            i++;
        }
        System.out.println(
                "The locatkon of the first instance of the lowest value " +
                        "is at: " + smallestIndex[0] + ", " + smallestIndex[1]);

        return smallestIndex;
    }
    public static void main(String[] args){
        //Creation of a 2 dimensional integer array
        int [ ][ ] intArray = new int[][]{
                new int[] {3,2,5, 7},
                new int[] {7,3,1},
        };
        //creation of a 2 dimensional double array
        double [ ][ ] doubleArray = new double[][]{
                new double[] {5.5, 3.3, 7.89, 4.4},
                new double[] {7.5, 10.3, 4.7, 0.2, 5.4},
        };
        System.out.println();
        int [] largestInt = locateLargest(intArray);
        System.out.println();
        int [] largestDouble = locateLargest(doubleArray);
        System.out.println();
        int [] smallestInt = locateSmallest(intArray);
        System.out.println();
        int [] smallestDouble = locateSmallest(doubleArray);
    }
}