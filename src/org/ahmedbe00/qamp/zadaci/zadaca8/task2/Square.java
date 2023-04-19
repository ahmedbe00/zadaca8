package org.ahmedbe00.qamp.zadaci.zadaca8.task2;

public class Square extends  Shape {
    private double side;
    protected Square(final String color,final double side){
        super(color);
        this.side=side;
    }
    protected final double getArea(){
        return side * side;
    }
    protected final double getCircumference(){
        return 4 * side;
    }
}
