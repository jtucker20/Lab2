package edu.mcdaniel.java2206.lab2;

import edu.mcdaniel.java2206.lab2.car.CarBaseClass;
import edu.mcdaniel.java2206.lab2.interfaces.Vehicle;
import edu.mcdaniel.java2206.lab2.vehicles.FordVehicle;

public class FordFocus extends CarBaseClass {


        private double speed;

        public FordFocus(){
            super();
            setModel("Ford");
            speed=0;


        }

        public String displaySpeedAsString(){
            return "This Ford's speed is: " + speed;
        }


        public double getSpeed() {
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }
}
