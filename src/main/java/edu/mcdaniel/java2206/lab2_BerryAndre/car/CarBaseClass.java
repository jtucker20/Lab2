package edu.mcdaniel.java2206.lab2_BerryAndre.car;

import edu.mcdaniel.java2206.lab2_BerryAndre.enums.ColorsOfCars;

public class CarBaseClass {

    private String make;
    private String model;
    private String year;
    private ColorsOfCars color;

    private boolean isOn;

    public CarBaseClass(){
        make = "";
        model = "";
        year = "2020";
        isOn = false;
        color = ColorsOfCars.NONE;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}
