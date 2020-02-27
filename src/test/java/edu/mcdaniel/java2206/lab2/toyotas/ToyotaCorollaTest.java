package edu.mcdaniel.java2206.lab2.toyotas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToyotaCorollaTest {

    //Arrange
    private ToyotaCorolla toyotacorolla;
    @BeforeEach
    void setUp()
    {
        toyotacorolla = new ToyotaCorolla();
    }


    @Test
    void accel()
    {
        toyotacorolla.accel(30);
        //Assert
        assertEquals(30*.80, toyotacorolla.getAccelerationRate());
    }

    @Test
    void brake() {
        //Act
        double before = toyotacorolla.getAccelerationRate();
        toyotacorolla.brake(30);
        //Assert
        assertEquals(before - 30, toyotacorolla.getAccelerationRate());
    }

    @Test
    void showVehicleState() {
        //Act
        String accelMsg = "This vehicle has an acceleration of: ";
        String lightsMsg = "\nThis vehicle has it's lights ";
        boolean lights = toyotacorolla.isLightsOn();
        toyotacorolla.accel(30);
        toyotacorolla.toggleLights();
        //Assert
        String expected = accelMsg + toyotacorolla.getAccelerationRate() + lightsMsg + (!(lights) ? "On" : "Off");
        assertEquals(expected, toyotacorolla.showVehicleState());
    }
}