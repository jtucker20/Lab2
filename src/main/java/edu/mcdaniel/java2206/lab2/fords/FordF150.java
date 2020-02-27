package edu.mcdaniel.java2206.lab2.fords;

import edu.mcdaniel.java2206.lab2.enums.ColorsOfCars;
import edu.mcdaniel.java2206.lab2.interfaces.Vehicle;
import edu.mcdaniel.java2206.lab2.vehicles.FordVehicle;

public class FordF150 extends FordVehicle implements Vehicle {


    //Private Assets
        private double accelerationRate;
        private double distance;
        private final ColorsOfCars color;

        private boolean lightsOn;

        //Constructors
        public FordF150(){
            super();
            setModel("F150");
            this.lightsOn = false;
            this.color = ColorsOfCars.ORANGE;
        }

        //Major Methods
        @Override
        public void accel(double percentOfMaxAccel) {
            this.accelerationRate = 0.70 * percentOfMaxAccel;
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
            return "This Ford F150 has an acceleration of: " + this.accelerationRate
                    + "\nThis Ford F150 has it's lights " + ((this.lightsOn) ? "On" : "Off");
        }

        public String showColorOfCar(){
            return "This Ford F150 is: " + this.color;
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


