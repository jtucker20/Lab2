package edu.mcdaniel.java2206.lab2.toyotas;

import edu.mcdaniel.java2206.lab2.interfaces.Vehicle;
import edu.mcdaniel.java2206.lab2.vehicles.ToyotaVehicle;

public class ToyotaCamry extends ToyotaVehicle implements Vehicle {

    //Private Assets
    private double accelerationRate;
    private double timeTraveled;
    private double mph;
    private double distance;
    private boolean lightsOn;

    //Constructors
    public ToyotaCamry(){
        super();
        setModel("Camry");
        this.lightsOn = false;
    }

    //Major Methods
    @Override
    public void accel(double percentOfMaxAccel) {
        this.accelerationRate = percentOfMaxAccel;
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
        return "The Lights are " + ( (this.lightsOn) ? "On" : "Off");
    }

    @Override
    public String showVehicleState() {
        return "This vehicle has an acceleration of: " + this.accelerationRate
                + "\nThis vehicle has it's lights " + ((this.lightsOn) ? "On" : "Off" + "\nthis vehicle's time traveled is " + this.timeTraveled);
    }

    //Minor Methods
    public void timeTraveled()
    {
        this.timeTraveled = distance/mph;
    }

    //Getters
    public double getAccelerationRate() {
        return accelerationRate;
    }

    public double getTimeTraveled()
    {
        return timeTraveled;
    }

    public double getMph()
    {
        return mph;
    }

    public double getDistance() {
        return distance;
    }

    public boolean isLightsOn() {
        return lightsOn;
    }
}
