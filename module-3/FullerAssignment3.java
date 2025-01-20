/*
Brett Fuller
CSD-402 Assignment 3.2
1/13/25
 */
//Create a pyramid out of powers of 2
public class FullerAssignment3 {
    public static void main(String[] args) {
        int i = 0;
        //blank line for readability
        System.out.println();
        //loop for the maximimu power of 2
        while (i < 7) {
            //variables for where to start and end the pyramid and power to start on for 2
            int startPosition = 6;
            int endPosition = 13;
            int lowerPowers = 0;
            //loop for the last line in the pyramid
            int j = 0;
            while (j < 13) {
                startPosition = startPosition - i;
                while (j < startPosition) {
                    System.out.print("   ");
                    j++;
                }
                endPosition = endPosition - (6 - i);
                int powerCount = 0;
                while (j < endPosition) {
                    double power = Math.pow(2, lowerPowers);
                    if(power < 10 ){System.out.printf("%.0f  ", power);}
                    else {System.out.printf("%.0f ", power);}
                    if (powerCount < i){lowerPowers++;}
                    else {lowerPowers--;}
                    powerCount++;
                    j++;
                }
                // Final two cases that ensure the @ sign aligns properly.
                if(j == 12) {
                    System.out.println("   @");
                    System.out.println();
                }
                else if (j == 13) {
                    System.out.println("@");
                    System.out.println();
                }
                else{
                    System.out.print("   ");
                }

                j++;
            }
            i++;
        }

    }
}