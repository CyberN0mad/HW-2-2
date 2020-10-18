package com.company;

public class Lexus extends Car implements Drawable {
    public Lexus(Engine engine, Wheel wheel) {
        super(engine, wheel, "Lexus430");
    }

    @Override
    public String draw() {
        return "\uD83D\uDE99";
    }
}
