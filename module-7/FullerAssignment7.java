/*
Brett Fuller
CSD-402 Assignment 7.2
2/6/25
 */

//This assignment is about learning how to use classes and objects along with using getter and setter methods.
//This is done by creating instances of the fan class using multiple constructors and then modifying attribute values
public class FullerAssignment7 {
    public static void main(String[] args) {
        System.out.println();
        //create a fan using the default constructor naming fan1 and then use its toString() method.
        Fan fan1 = new Fan();
        System.out.println("The status of fan1 is: ");
        //Display the status of a fan not using toString() for assignment 7.2
        Fan.displayFanStatus(fan1);
        //create a fan using a constructor that accepts parameter values named fan2 and then use its toString() method.
        Fan fan2 = new Fan(Fan.MEDIUM, true, 4, "red" );
        System.out.println("The status of fan2 is: ");
        //Display the status of a fan not using toString() for assignment 7.2
        Fan.displayFanStatus(fan2);
        //The next several lines of code use the egger and setter methods to update attributes and then retrieve
        // the updated values
        fan2.setColor("blue");
        System.out.println("fan2 Color changed to: " + fan2.getColor());
        fan2.setSpeed(Fan.FAST);
        System.out.println("fan2 Speed changed to: " + fan2.getSpeed());
        fan2.setRadius(8);
        System.out.println("fan2 Radius changed to: " + fan2.getRadius());
        fan1.setOn(true);
        System.out.println("fan1 On state changed to: " + fan1.getOn());
        System.out.println();
        //Call the toString() method to display the new updated status of the fans.
        System.out.println("The current state of the fan1 is:");
        System.out.println(fan1.toString());
        System.out.println();
        System.out.println("The current state of fan2 is:");
        System.out.println(fan2.toString());
        System.out.println();
        //Assignment 7.2 Create Collection of Fans
        Fan[] fans = new Fan[] {fan1, fan2};
        //Assignment 7.2 call method that shows status for a collection of Fans
        Fan.displayFanCollection(fans);
    }
}
//class for a fan to get and set details about it
class Fan{
    //attributes of a fan
    static final int STOPPED = 0;
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private int speed;
    private boolean on;
    private int radius;
    private String color;

    //default constructor with default values from assignment
    Fan(){
        on = false;
        speed = STOPPED;
        color = "white";
    }
    //For 7.2 updated method to use the this keyword.
    //Constructor that accepts values for speed, powerstate, radius, and color
    Fan(int speed, boolean on, int radius, String color){
        //Assign fan speed to constants, I know this was not necessary but I was trying to justify having
        //constants since technically you did not have to use them for the fans.
        if(speed > 4){
            this.speed = FAST;
        }
        else if (speed <= 0) {
            this.speed = STOPPED;
        }
        else if(speed == 1){
            this.speed = SLOW;
        }
        else if(speed == 2){
            this.speed = MEDIUM;
        }
        else if(speed == 3){
            this.speed = FAST;
        }
        else{
            this.speed = STOPPED;
        }
        //rest of assignments
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    //method to get the numeric value of the fan speed
    public int getSpeed() {
        return speed;
    }

    //method to get a more easily human readable string value that matched the value of the constant
    // for the fan speed, not strictly necessary but I thought the to string looked better with it.
    public String getSpeedAsString() {
        String fanSpeed = "";
        if (speed == STOPPED ) {
            fanSpeed = "STOPPED";
        }
        else if(speed == SLOW){
            fanSpeed = "SLOW";
        }
        else if(speed == MEDIUM){
            fanSpeed = "MEDIUM";
        }
        else if(speed == FAST){
            fanSpeed = "FAST";
        }
        return fanSpeed;
    }

    //For 7.2 updated method to use the this keyword.
    //method to update the speed for a fan
    public void setSpeed(int speed) {
        //Assign the fan speeds to the constant and accommodate values that are too high or too low.
        if(speed > 4){
            this.speed = FAST;
        }
        else if (speed <= 0) {
            this.speed = STOPPED;
        }
        else if(speed == 1){
            this.speed = SLOW;
        }
        else if(speed == 2){
            this.speed = MEDIUM;
        }
        else if(speed == 3){
            this.speed = FAST;
        }
        else{
            this.speed = STOPPED;
        }
    }
    //method to get the powerstate of the fan
    public boolean getOn() {
        return on;
    }
    //For 7.2 updated method to use the this keyword.
    //method to update the power state of the fan
    public void setOn(boolean on) {
        this.on = on;
    }
    //method to get the radius of the fan
    public int getRadius() {
        return radius;
    }
    //method to set the radius of a fan thougn this is not an attribute that can physically change on a fan, so I guess
    //it is only really needed if the fan was misconfigured in the first place.
    //For 7.2 updated method to use the this keyword.
    public void setRadius(int radius) {
        this.radius = radius;
    }
    //method to get the color of the fan
    public String getColor() {
        return color;
    }
    //For 7.2 updated method to use the this keyword.
    //method to set the color of the fan
    public void setColor(String color) {
        this.color = color;
    }
    //method to print out the fans status in a human readable format
    public String toString(){
        return "Speed: " + getSpeedAsString() + " or #" + getSpeed() + ", On: " + on + ", Radius: " + radius + ", Color:" +
                " " + color;
    }

    //Assignment 7.2
    //Method to handle a collection of Fans to show status
    //This method iterates through the collection and calls the method that handles a single Fan to show status
    //I originally had basically a copy and paste of the code from displayFanStatus until I thought about it for
    //a second and realized this was a better implementation
    public static void displayFanCollection(Fan[] fans){
        for(int i = 0; i < fans.length; i++){
            System.out.println("The status fan at location " + i + " in the collection is: ");
            fans[i].displayFanStatus(fans[i]);
        }
    }
    //Method to Print the status of a single fan
    public static void displayFanStatus(Fan fan){
        System.out.println("Speed: " + fan.getSpeedAsString() + " or #" + fan.getSpeed());
        System.out.println("On: " + fan.getOn());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
        System.out.println();
    }
}