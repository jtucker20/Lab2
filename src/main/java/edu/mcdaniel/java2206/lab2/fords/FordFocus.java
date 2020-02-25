package edu.mcdaniel.java2206.lab2.fords;

import edu.mcdaniel.java2206.lab2.interfaces.Vehicle;
import edu.mcdaniel.java2206.lab2.vehicles.FordVehicle;

public class FordFocus extends FordVehicle implements Vehicle {


    //Private Assets
    private double accelerationRate;
    private double distance;

    private boolean lightsOn;

    //Constructors
    public FordFocus(){
        super();
        setModel("Camry");
        this.lightsOn = false;
    }


    @Override
    public void accel(double percentOfMaxAccel) {

    }

    @Override
    public void brake(double percentOfMaxBrake) {

    }

    @Override
    public void turnOnLights() {

    }

    @Override
    public void toggleLights() {

    }

    @Override
    public String showLightsStatus() {
        return null;
    }

    @Override
    public String showVehicleState() {
        return "This vehicle has an acceleration of: " + this.accelerationRate
                + "\nThis vehicle has it's lights " + ((this.lightsOn) ? "On" : "Off");
    }

    //Getters
    public double getAccelerationRate() {
        return accelerationRate;
    }

    public double getDistance() {
        return distance;
    }

    public boolean isLightsOn() {
        return lightsOn;
    }
}
