package edu.mcdaniel.java2206.lab2.vehicles;

import edu.mcdaniel.java2206.lab2.car.CarBaseClass;

public class FordVehicle extends CarBaseClass {
    private double speed;

    public FordVehicle() {
            super();
            speed = 0;
        setMake("Ford");
    }
    public String displaySpeedAsString(){
        return "This Toyota's speed is: " + speed;
    }
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
