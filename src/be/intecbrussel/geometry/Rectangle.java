package be.intecbrussel.geometry;
public class Rectangle {

    public final String DESCRIPTION="rectangle";
    private double length; // default = 0
    private double width; // default = 0
    private double area;
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
        area = this.length * this.width;
    }

    public Rectangle(){
        this(1, 1);
        System.out.println("This is a constructor without params.");
    }

    public Rectangle(double side) {
        this(side, side);
        System.out.println("This is a constructor with 1 param.");
    }

    public void setLength(double length) {
        boolean length2IsNegative = length < 0;
        if (length2IsNegative) {
            this.length = -length;
        } else {
            this.length = length;
        }
    }

    public void setWidth(double width2) {
        if (width2 < 0) {
            width = -width2;
        } else {
            width = width2;
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        double area = length * width;
        return area;
    }

    public double getCircumference() {
        double circumference = (length * 2) + (width * 2);
        return circumference;
    }
}