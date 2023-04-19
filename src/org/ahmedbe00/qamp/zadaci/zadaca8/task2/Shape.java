package org.ahmedbe00.qamp.zadaci.zadaca8.task2;

public abstract class  Shape {
    private final String color;
    protected Shape(final String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "color: " + color + ", area: " + getArea() + ", circumference: " + getCircumference();
}

    protected abstract double getCircumference();

    protected abstract double getArea();
}
