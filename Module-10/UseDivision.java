/*
Brett Fuller
CSD-402 Assignment 10.2
2/23/25

 This program demonstrates Abstract classes by creating an abstract class and extending it in two other classes.
 I then demonstrate metod overrides by overriding the toString class to display the correct information for each
 type of object. I'm not sure if this was required for the assignment but it said there were supposed to be
 4 different files so I created a package to contain the three division classes and I import it below
 */

import Divisions.*;
//This code creates 4 objects 2 of each type and then uses the toString method for each of them.
class UseDivision {
    public static void main(String[] args) {
        InternationalDivision iDivision1 = new InternationalDivision("Vancouver", 3501, "Canada", "English");
        InternationalDivision iDivision2 = new InternationalDivision("Paris", 3502, "France", "French");
        DomesticDivision dDivision1 = new   DomesticDivision("Omaha", 4501, "Nebraska");
        DomesticDivision dDivision2 = new   DomesticDivision("San Francisco", 4502, "California");
        System.out.println();
        System.out.println("Divisions:\n");
        System.out.println(iDivision1);
        System.out.println(iDivision2);
        System.out.println(dDivision1);
        System.out.println(dDivision2);
    }
}