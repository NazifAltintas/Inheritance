package be.intecbrussel.geometry;

public class Square extends Rectangle {
    public final String DESCRIPTION="square";

    @Override
    public void setLength(double length) {
        setSide(length);

    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);

    }
}
