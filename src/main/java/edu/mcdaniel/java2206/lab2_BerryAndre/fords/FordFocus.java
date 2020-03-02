package edu.mcdaniel.java2206.lab2_BerryAndre.fords;

import edu.mcdaniel.java2206.lab2_BerryAndre.car.CarBaseClass;
import edu.mcdaniel.java2206.lab2_BerryAndre.interfaces.Vehicle;

public class FordFocus extends CarBaseClass implements Vehicle
{
    //Private Assets
    private double accelerationRate;
    private double distance;
    private double brakeRate;

    private boolean lightsOn;

    //Constructors
    public FordFocus()
    {
        super();
        setModel("Focus");
        this.lightsOn = false;
    }

    //Major Methods
    @Override
    public void accel(double percentOfMaxAccel)
    {
        this.accelerationRate = percentOfMaxAccel;
    }


    @Override
    public void brake(double percentOfMaxBrake)
    {
        this.accelerationRate = this.accelerationRate - percentOfMaxBrake;
    }

    @Override
    public void turnOnLights()
    {
        this.lightsOn = true;
    }

    @Override
    public void toggleLights()
    {
        this.lightsOn = !this.lightsOn;
    }

    @Override
    public String showLightsStatus()
    {
        return "The Lights are " + ( (this.lightsOn) ? "On" : "Off");
    }

    @Override
    public String showVehicleState()
    {
        return "This Ford Focus has an acceleration of: " + this.accelerationRate
                + "\nThis vehicle has it's lights " + ((this.lightsOn) ? "On" : "Off");
    }

    //Getters
    public double getAccelerationRate()
    {
        return accelerationRate;
    }

    public double getDistance()
    {
        return distance;
    }

    public boolean isLightsOn()
    {
        return lightsOn;
    }
}
