/*
Brett Fuller
CSD-402 Assignment 12.3 - 10.2 - redo
3/6/25
*REDO* Changed toString() to the abstract display method to be overridden by child classes.
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
    public abstract String display();
}