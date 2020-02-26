package edu.mcdaniel.java2206.lab2.interfaces;

public interface Vehicle {

    void accel(double percentOfMaxAccel);
    void brake(double percentOfMaxBrake);

    void turnOnLights();
    void toggleLights();
    void timeTraveled();

    String showLightsStatus();

    String showVehicleState();

}
