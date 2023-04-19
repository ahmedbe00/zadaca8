package org.ahmedbe00.qamp.zadaci.zadaca8.task2;

public class Rectangle extends Shape {
    private double sideA;
    private double sideB;
    protected Rectangle(final String color,final double sideA,final double sideB){
        super(color);
        this.sideA=sideA;
        this.sideB=sideB;
    }
    protected final double getArea(){
        return sideA * sideB;
    }
    protected final double getCircumference(){
        return 2 * sideA + 2 * sideB;
    }
}
