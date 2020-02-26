package edu.mcdaniel.java2206.lab2_BerryAndre.toyotas;

import edu.mcdaniel.java2206.lab2_BerryAndre.interfaces.Vehicle;
import edu.mcdaniel.java2206.lab2_BerryAndre.vehicles.ToyotaVehicle;

public class ToyotaCorolla extends ToyotaVehicle implements Vehicle {


    //Private Assets
    private double accelerationRate;
    private double distance;

    private boolean lightsOn;
    private double lightsDimPercentage;

    //Constructors
    public ToyotaCorolla(){
        super();
        setModel("Corolla");
        this.lightsOn = false;
    }


    //Major Methods
    @Override
    public void accel(double percentOfMaxAccel) {
        this.accelerationRate = 0.80 * percentOfMaxAccel;
    }

    @Override
    public void brake(double percentOfMaxBrake) {
        this.accelerationRate = this.accelerationRate - percentOfMaxBrake;
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
        if(this.lightsOn) {
            return "The lights are On.";
        } else {
            return "The lights are Off.";
        }
    }

    @Override
    public String showVehicleState() {

        return "This Toyota Corolla has an acceleration of: " + this.accelerationRate
                + "\nThis vehicle has it's lights " + ((this.lightsOn) ? "On" : "Off");
    }

    //Minor Methods
    public void corollaLightsDim(double percentDimming){
        this.lightsDimPercentage = percentDimming;
        System.out.println("Lights have been dimmed to " + this.lightsDimPercentage);

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

    public double getLightsDimPercentage() {
        return lightsDimPercentage;
    }
}
