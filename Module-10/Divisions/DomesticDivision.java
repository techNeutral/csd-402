/*
Brett Fuller
CSD-402 Assignment 12.3 - 10.2 - redo
3/6/25
*REDO* Changed toString() to the display method, which overrides an abstract version of display().
*/
//This is the class for domestic divisions. It imports the base division class and extends it.
//The constructor calls the constructor for Division with the division name and account number and then adds the state
//field. It then overrides the toString method to first call the inherited method and then add the information for state.

package Divisions;
import Divisions.Division;

public class DomesticDivision extends Division{
    private String state;
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }
    public String getState() {
        return state;
    }
    @Override
    public String display() {
        String returnString = "Domestic Division\n" + "Division Name: " + super.getDivisionName() + "\nAccount Number: " + super.getAccountNumber() + "\nState: " + getState() + "\n";
        return returnString;
    }
}