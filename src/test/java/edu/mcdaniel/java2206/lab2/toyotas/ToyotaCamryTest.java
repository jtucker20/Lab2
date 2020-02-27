package edu.mcdaniel.java2206.lab2.toyotas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToyotaCamryTest {
    //Arrange
    private ToyotaCamry toyotacamry;
    @BeforeEach
    void setUp()
    {
        toyotacamry = new ToyotaCamry();
    }


    @Test
    void accel()
    {
        toyotacamry.accel(30);
        //Assert
        assertEquals(30, toyotacamry.getAccelerationRate());
    }

    @Test
    void brake() {
        //Act
        double before = toyotacamry.getAccelerationRate();
        toyotacamry.brake(30);
        //Assert
        assertEquals(before - 30, toyotacamry.getAccelerationRate());
    }

    @Test
    void showVehicleState() {
        //Act
        String accelMsg = "This vehicle has an acceleration of: ";
        String lightsMsg = "\nThis vehicle has it's lights ";
        boolean lights = toyotacamry.isLightsOn();
        toyotacamry.accel(30);
        toyotacamry.toggleLights();
        //Assert
        String expected = accelMsg + toyotacamry.getAccelerationRate() + lightsMsg + (!(lights) ? "On" : "Off");
        assertEquals(expected, toyotacamry.showVehicleState());
    }
}