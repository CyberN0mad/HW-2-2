package com.company;

public class Mercedes extends Car implements Printable {
    private String country;

    public Mercedes(int year, String model, String country) {
        super(year, model);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public void print() {
        System.out.println("Year : " + getYear() +
                "Model : " + getModel() +
                "Country: " + getCountry());
    }
}
