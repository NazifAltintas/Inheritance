package be.intecbrussel.geometry;

public class GeometryApp {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5);
        rectangle.setWidth(15);

        System.out.println(rectangle.getLength() + "--*--" + rectangle.getWidth());


        Square square = new Square();
        square.setLength(8);
        square.setWidth(8);
        square.setSide(45);

        System.out.println(square.getLength() + "-*-" + square.getWidth());


    }


}
