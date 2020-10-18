package com.company;

public class Engine {
    private int engineVol;
    private String companyName;

    public Engine(int engineVol, String companyName) {
        this.engineVol = engineVol;
        this.companyName = companyName;
    }

    public int getEngineVol() {
        return engineVol;
    }

    public void setEngineVol(int engineVol) {
        this.engineVol = engineVol;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
