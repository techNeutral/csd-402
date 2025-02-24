public class geometricObjects {
    public static void main(String[] args) {

    }
}
abstract class GeometricObjects(){
    private String color = "red";
    protected GeometricObjects() {

    }
    protected  GeometricObjects(String color){
        this.color = color;
    }
    public abstract double getArea(){

    }
    public abstract double getPerimeter(){

    }
}

class Rectangle extends GeometricObjects{
    private double length;
    private double width;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea(){
        return length * width;
    }
    @Override
    public double getPerimeter(){
        return 2 * length * width;
    }
}
class circle extends GeometricObjects{
    private double radius;
    public circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
}


