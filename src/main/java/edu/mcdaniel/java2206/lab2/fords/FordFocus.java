package edu.mcdaniel.java2206.lab2.fords;

import edu.mcdaniel.java2206.lab2.interfaces.Vehicle;
import edu.mcdaniel.java2206.lab2.vehicles.FordVehicle;

public class FordFocus extends FordVehicle implements Vehicle
{
    //Private Assets
    private double accelRate;
    private double distance;

    private boolean headlightsOn;
    //Constructor
    public FordFocus()
    {
        super();
        setModel("Focus");
        this.headlightsOn = false;
        this.distance = 0;
        this.accelRate = 0;
    }
    //Major Methods
    @Override
    public void accel(double percentOfMaxAccel)
    {
        this.accelRate = percentOfMaxAccel;
    }
    @Override
    public void brake(double percentOfMaxBrake)
    {
        this.accelRate = this.accelRate  - percentOfMaxBrake;
    }
    @Override
    public void toggleLights()
    {
        this.headlightsOn = !(this.headlightsOn);
    }
    @Override
    public String showLightsStatus()
    {
        return "The Lights are " + ( (this.headlightsOn) ? "On" : "Off");
    }

    @Override
    public String showVehicleState()
    {
        return "This vehicle has an acceleration of: " + this.accelRate
                + "\nThis vehicle's headlights are " + ((this.headlightsOn) ? "On" : "Off");
    }
    //Getters
    public double getAccelRate()
    {
        return this.accelRate;
    }
    public double getDistance()
    {
        return this.distance;
    }
    public boolean getLights()
    {
        return this.headlightsOn;
    }
}
