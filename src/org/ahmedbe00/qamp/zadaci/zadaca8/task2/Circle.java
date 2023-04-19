package org.ahmedbe00.qamp.zadaci.zadaca8.task2;

public class Circle extends Shape {
    private double radius;
    protected Circle(final String color,final double radius){
        super(color);
        this.radius=radius;
    }
    protected final double getArea(){
        return radius * radius * Math.PI;
    }
    protected final double getCircumference(){
        return 2 * radius * Math.PI;
    }
}
