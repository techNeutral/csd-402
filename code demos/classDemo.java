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
    public void setWidth(int width) {width = width;}
}