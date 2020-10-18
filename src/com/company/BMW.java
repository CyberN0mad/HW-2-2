package com.company;

class BMW extends Car implements Drawable  {
    public BMW(Engine engine, Wheel wheel) {
        super(engine, wheel,"BMW-X5");
    }

    @Override
    public String draw() {
        return "\uD83D\uDE99";
    }

}
