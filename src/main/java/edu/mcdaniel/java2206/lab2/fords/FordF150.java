package edu.mcdaniel.java2206.lab2.fords;

import edu.mcdaniel.java2206.lab2.interfaces.Vehicle;
import edu.mcdaniel.java2206.lab2.vehicles.FordVehicle;

public class FordF150 extends FordVehicle implements Vehicle {


    //Private Assets
    private double accelerationRate;
    private double distance;

    private boolean lightsOn;

    //Constructors
    public FordF150(){
        super();
        setModel("Camry");
        this.lightsOn = false;
    }


    @Override
    public String WreckReport() {
        return "this Vehicle has been in" + getNumberOfWrecks() + "wrecks.";
    }
    @Override
    public String getWreckReportForFord() {
        return "This Toyota has been in" + getNumberOfWrecks() + "wrecks.";
    }

    @Override
    public void accel(double percentOfMaxAccel) {

    }

    @Override
    public void brake(double percentOfMaxBrake) {

    }

    @Override
    public void turnOnLights() {
        this.lightsOn = true;

    }

    @Override
    public void toggleLights() {
        this.lightsOn = !this.lightsOn;
    }

    @Override
    public String showLightsStatus() {
        return "The Lights are " + ( (this.lightsOn) ? "On" : "Off");

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
