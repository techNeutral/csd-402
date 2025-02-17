import java.util.ArrayList;
public class classDemo{
    public static void main(String[] args){
        Rectangle firstRectangle = new Rectangle(4,3);
        Rectangle secondRectangle = new Rectangle(1,2);
        System.out.println("Rectangle 1: length: " + firstRectangle.getLength() + " x Width: " + firstRectangle.getWidth());
        System.out.println("Rectangle 2: length: " + secondRectangle.getLength() + " x Width: " + secondRectangle.getWidth());
        firstRectangle.setLength(12);
        firstRectangle.setWidth(10);
        System.out.println("Rectangle 1: length: " + firstRectangle.getLength() + " x Width: " + firstRectangle.getWidth());
        System.out.println("Rectangle 2: length: " + secondRectangle.getLength() + " x Width: " + secondRectangle.getWidth());
        Vehicle car = new Car(4,3);
        Vehicle plane = new Plane(1,2);
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(car);
        vehicles.add(plane);
        System.out.println(vehicles);

    }

}

class Rectangle{
    private int length;
    private int width;
    Rectangle(){
        length = 4;
        width = 6;
    }
    Rectangle(int l, int w){
        length = l;
        width = w;
    }
    public int getLength() {return length;}
    public void setLength(int length) {this.length = length;}
    public int getWidth() {return width;}
    public void setWidth(int width) {this.width = width;}
}

class Vehicle{
    private int speed;
    public Vehicle(){}
    public Vehicle(int speed){}
    public int getSpeed() {return speed;}
    public void setSpeed(int speed) {this.speed = speed;}
}
class Car extends Vehicle{
    private int seats;
    public Car(){}
    public Car(int speed, int seats){
        super(speed);
        this.seats = seats;
    }
}
class Plane extends Vehicle{
    int altitude;
    public Plane(){}
    public Plane(int speed, int altitude){
        super(speed);
        this.altitude = altitude;
    }
}