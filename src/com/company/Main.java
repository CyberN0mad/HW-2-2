package com.company;

public class Main {

    public static void main(String[] args) {

        createObject("BMW").print();
        createObject("Mercedes").print();
        createObject("Lexus").print();
    }

    public static Printable createObject(String className) {
        Printable printable = null;
        switch (className) {
            case "BMW":
                Bmw bmw = new Bmw(2018, "X5", "Black");
                return bmw;
            case "Mercedes":
                Mercedes mercedes = new Mercedes(2019, "AMG GLC43", "Germany");
                return mercedes;
            case "Lexus":
                Lexus lexus = new Lexus(2016, "LX570", "Auto");
                return lexus;
        }
        return printable;
    }

}
