package edu.mcdaniel.java2206.lab2.fords;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FordF150Test {
    //Arrange
    private FordF150 fordF150;
    @BeforeEach
    void setUp()
    {
        fordF150 = new FordF150();
    }


    @Test
    void accel()
    {
        fordF150.accel(30);
        //Assert
        assertEquals(30, fordF150.getAccelRate());
    }

    @Test
    void brake() {
        //Act
        double before = fordF150.getAccelRate();
        fordF150.brake(30);
        //Assert
        assertEquals(before - 30, fordF150.getAccelRate());
    }

    @Test
    void showVehicleState() {
        //Act
        String accelMsg = "This vehicle has an acceleration of: ";
        String lightsMsg = "\nThis vehicle's headlights are ";
        boolean lights = fordF150.getLights();
        fordF150.accel(30);
        fordF150.toggleLights();
        //Assert
        String expected = accelMsg + fordF150.getAccelRate() + lightsMsg + (!(lights) ? "On" : "Off");
        assertEquals(expected, fordF150.showVehicleState());
    }
}