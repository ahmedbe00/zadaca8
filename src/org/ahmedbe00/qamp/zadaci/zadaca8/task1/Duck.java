package org.ahmedbe00.qamp.zadaci.zadaca8.task1;

public class Duck implements Interfaces.Swim, Interfaces.Flight {
    @Override
    public String Fly() {
        return "Flies with wings";
    }

    @Override
    public String Swim() {
        return "Kinda floats";
    }
}
