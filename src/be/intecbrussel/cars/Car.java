package be.intecbrussel.cars;

public class Car {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void accelerate() {
        System.out.println("car goes vuuuv");
    }

    public void decelerate() {
        System.out.println("car goes slow");
    }
}
