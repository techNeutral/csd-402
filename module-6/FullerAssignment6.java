/*
Brett Fuller
CSD-402 Assignment 6.2
1/31/25
 */

//This assignment is about learning how to use classes and objects along with using getter and setter methods.
//This is done by creating instances of the fan class using multiple constructors and then modifying attribute values
public class FullerAssignment6 {
    public static void main(String[] args) {
        System.out.println();
        //create a fan using the default constructor naming fan1 and then use its toString() method.
        Fan fan1 = new Fan();
        System.out.println("The current state of the fan1  is:");
        System.out.println(fan1.toString());
        System.out.println();
        //create a fan using a constructor that accepts parameter values named fan2 and then use its toString() method.
        Fan fan2 = new Fan(Fan.MEDIUM, true, 4, "red" );
        System.out.println("The current state of fan2 is:");
        System.out.println(fan2.toString());
        System.out.println();
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
    //Constructor that accepts values for speed, powerstate, radius, and color
    Fan(int fanSpeed, boolean fanOn, int fanRadius, String fanColor){
        //Assign fan speed to constants, I know this was not necessary but I was trying to justify having
        //constants since technically you did not have to use them for the fans.
        if(fanSpeed > 4){
            speed = FAST;
        }
        else if (fanSpeed <= 0) {
            speed = STOPPED;
        }
        else if(fanSpeed == 1){
            speed = SLOW;
        }
        else if(fanSpeed == 2){
            speed = MEDIUM;
        }
        else if(fanSpeed == 3){
            speed = FAST;
        }
        else{
            fanSpeed = STOPPED;
        }
        //rest of assignments
        on = fanOn;
        radius = fanRadius;
        color = fanColor;
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

    //method to update the speed for a fan
    public void setSpeed(int fanSpeed) {
        //Assign the fan speeds to the constant and accommodate values that are too high or too low.
        if(fanSpeed > 4){
            speed = FAST;
        } else if (fanSpeed < 0) {
            speed = STOPPED;
        }
        else if(fanSpeed == 0){
            speed = STOPPED;
        }
        else if(fanSpeed == 1){
            speed = SLOW;
        }
        else if(fanSpeed == 2){
            speed = MEDIUM;
        }
        else if(fanSpeed == 3){
            speed = FAST;
        }
        else{
            speed = fanSpeed;
        }
    }
    //method to get the powerstate of the fan
    public boolean getOn() {
        return on;
    }
    //method to update the power state of the fan
    public void setOn(boolean fanOn) {
        on = fanOn;
    }
    //method to get the radius of the fan
    public int getRadius() {
        return radius;
    }
    //method to set the radius of a fan thougn this is not an attribute that can physically change on a fan, so I guess
    //it is only really needed if the fan was misconfigured in the first place.
    public void setRadius(int fanRadius) {
        radius = fanRadius;
    }
    //method to get the color of the fan
    public String getColor() {
        return color;
    }
    //method to set the color of the fan
    public void setColor(String fanColor) {
        color = fanColor;
    }
    //method to print out the fans status in a human readable format
    public String toString(){
        return "Speed: " + getSpeedAsString() + " or #" + getSpeed() + ", On: " + on + ", radius: " + radius + ", Color: " + color;
    }
}