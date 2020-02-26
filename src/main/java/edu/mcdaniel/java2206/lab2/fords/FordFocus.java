package edu.mcdaniel.java2206.lab2.fords;

import edu.mcdaniel.java2206.lab2.interfaces.Vehicle;
import edu.mcdaniel.java2206.lab2.vehicles.FordVehicle;

public class FordFocus extends FordVehicle implements Vehicle
{
    //Private Assets
    private double accelerationRate;
    private double timeTraveled;
    private double mph;
    private double distance;
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
        if(this.lightsOn) {
            return "The lights are On.";
        } else {
            return "The lights are Off.";
        }
    }

    @Override
    public String showVehicleState()
    {
        return "This vehicle has an acceleration of: " + this.accelerationRate
                + "\nThis vehicle has it's lights " + ((this.lightsOn) ? "On" : "Off");
    }

    //Minor Methods
    public void timeTraveled()
    {
        this.timeTraveled = distance/mph;
    }

    //Getters
    public double getAccelerationRate()
    {
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

    public double getDistance()
    {
        return distance;
    }

    public boolean isLightsOn()
    {
        return lightsOn;
    }

}
