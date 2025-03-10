/*
Brett Fuller
CSD-402 Assignment 12.3 - 10.2 - redo
3/6/25
*REDO* Changed toString() to the display method, which overrides an abstract version of display().
*/
//This is the class for international divisions. It imports the base division class and extends it.
//The constructor calls the constructor for Division with the division name and account number and then adds
// country and language. It then overrides the toString method to first call the inherited method and then adds the
// information for country and language.
package Divisions;
import Divisions.Division;

public class InternationalDivision extends Division {
    private String country;
    private String language;
    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }
    public String getCountry() {
        return country;
    }
    public String getLanguage() {
        return language;
    }
    @Override
    public String display(){
        String returnString = "International Division\n" + "Division Name: " + super.getDivisionName() + "\nAccount Number: " + super.getAccountNumber() + "\nCountry: " + getCountry() + "\nLanguage: " + getLanguage() + "\n";
        return returnString;
    }
}