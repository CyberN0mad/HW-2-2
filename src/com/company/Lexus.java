package com.company;

public class Lexus extends Car implements Printable {
    private String transmission;

    public Lexus(int year, String model, String transmission) {
        super(year, model);
        this.transmission = transmission;
    }

    public String getTransmission() {
        return transmission;
    }

    @Override
    public void print() {
        System.out.println("Year : " + getYear() +
                "Model : " + getModel() +
                "Transmission: " + getTransmission ());
    }
}
