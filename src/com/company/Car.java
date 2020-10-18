package com.company;

abstract class Car {
    private Engine engine;
    private Wheel wheel;
    private String carName;

    public Car(Engine engine, Wheel wheel, String carName) {
        this.engine = engine;
        this.wheel = wheel;
        this.carName = carName;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
    public String getInfo(){
        return "Model: "+ carName +
                " Engine -"+" {Vol-"+ engine.getEngineVol()+",Company:"+ engine.getCompanyName()+"}"+
                " Wheel -"+" {Wheel size-"+wheel.getWheelSize()+",Company:"+wheel.getCompanyName()+"}";



    }
}
