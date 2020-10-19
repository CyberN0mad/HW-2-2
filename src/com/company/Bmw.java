package com.company;

public class Bmw extends Car implements Printable {
    private String color;

    public Bmw(int year, String model, String color) {
        super(year, model);
        this.color =color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void print() {
        System.out.println("Year: " + getYear() +
                "Model: " + getModel() +
                "Color: " + getColor());
    }
}






