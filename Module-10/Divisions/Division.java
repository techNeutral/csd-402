/*
Brett Fuller
CSD-402 Assignment 10.2
2/23/25
*/
//This is the abstract class for division. It provides base functionality for the two child classes of domestic and
//international.

package Divisions;

public abstract class Division {
    private String divisionName;
    private int accountNumber;
    protected Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }
    public String getDivisionName() {
        return divisionName;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public String toString(){
        String returnString = "Division Name: " + this.getDivisionName() + "\nAccount Number: " + this.getAccountNumber();
        return returnString;
    }
}