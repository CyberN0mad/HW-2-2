package com.company;

public class Wheel {
    private String  wheelSize;
    private String companyName;

    public Wheel(String  wheelSize, String companyName) {
        this.wheelSize = wheelSize;
        this.companyName = companyName;
    }

    public String  getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(String  wheelSize) {
        this.wheelSize = wheelSize;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
