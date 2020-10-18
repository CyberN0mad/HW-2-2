package com.company;

public class Main {

    public static void main(String[] args) {
        BMW bmw =new BMW(new Engine(4,"BMW"),
                new Wheel("250/SS","Das Auto"));
        System.out.println(bmw.draw());
        System.out.println(bmw.getInfo());
        Lexus lexus = new Lexus(new Engine(4,"Toyota"),
                new Wheel("265/CAONI","JapanWheels"));
        System.out.println(lexus.draw());
        System.out.println(lexus.getInfo());
    }
}
