package edu.mcdaniel.java2206.lab2_BerryAndre.vehicles;

import edu.mcdaniel.java2206.lab2_BerryAndre.car.CarBaseClass;

public class FordVehicle extends CarBaseClass
{

    private double speed;

    public FordVehicle(){
        super();
        setMake("Ford");
        speed = 0;
    }

    public String displaySpeedAsString(){
        return "This Fords's speed is: " + speed;
    }


    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
