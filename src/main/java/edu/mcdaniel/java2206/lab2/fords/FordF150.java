package edu.mcdaniel.java2206.lab2.fords;

import edu.mcdaniel.java2206.lab2.interfaces.Vehicle;
import edu.mcdaniel.java2206.lab2.vehicles.FordVehicle;

public class FordF150 extends FordVehicle implements Vehicle {


    //Private Assets
    private double accelerationRate;
    private double distance;

    private boolean lightsOn;
    //private double lightsDimPercentage;

    //Constructors
    public FordF150(){
        super();
        setModel("F150");
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
        this.accelerationRate = 0.45 * percentOfMaxAccel;

    }

    @Override
    public void brake(double percentOfMaxBrake) {
        this.accelerationRate = this.accelerationRate - percentOfMaxBrake;

    }

    @Override
    public void turnOnLights() {
        this.lightsOn = false;

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

    //Minor Methods
    //public boolean corollaLightsDim(double percentDimming){
       // this.lightsDimPercentage = percentDimming;
      ///  System.out.println("Lights have been dimmed to " + this.lightsDimPercentage);


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

   //public boolean getLightsDimPercentage(){
       // return lightsDimPercentage;

}
