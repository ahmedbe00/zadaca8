package org.ahmedbe00.qamp.zadaci.zadaca8.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<Shape> allShapes=new ArrayList<>();

        final Circle circle=new Circle("Blue",2);
        final Square square=new Square("Red",3);
        final Rectangle rectangle=new Rectangle("White",3,4);
        allShapes.add(circle);
        allShapes.add(square);
        allShapes.add(rectangle);

        for (Shape shapes : allShapes){
            System.out.println(shapes.toString());
        }

    }
}
