package org.ahmedbe00.qamp.zadaci.zadaca8.task1;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        final Fish fish = new Fish();
        final Pegasus pegasus = new Pegasus();
        final Submarine submarine = new Submarine();
        final Plane plane = new Plane();
        final Duck duck = new Duck();

        final List<Interfaces.Swim> swimmingThings = new LinkedList<>();
        final List <Interfaces.Flight> flyingThings = new ArrayList<>();

        swimmingThings.add(fish);
        swimmingThings.add(submarine);
        swimmingThings.add(duck);

        flyingThings.add(plane);
        flyingThings.add(duck);
        flyingThings.add(pegasus);

        for (Interfaces.Flight flight : flyingThings){
            System.out.println(flight.Fly());

        }
        for (Interfaces.Swim swim: swimmingThings){
            System.out.println(swim.Swim());

        }



    }
}
