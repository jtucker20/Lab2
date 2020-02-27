package edu.mcdaniel.java2206.lab2.fords;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FordFocusTest {

    //Arrange
    private FordFocus fordfocus;
    @BeforeEach
    void setUp()
    {
        fordfocus = new FordFocus();
    }


    @Test
    void accel()
    {
        fordfocus.accel(30);
        //Assert
        assertEquals(30, fordfocus.getAccelRate());
    }

    @Test
    void brake() {
        //Act
        double before = fordfocus.getAccelRate();
        fordfocus.brake(30);
        //Assert
        assertEquals(before - 30, fordfocus.getAccelRate());
    }

    @Test
    void showVehicleState() {
        //Act
        String accelMsg = "This vehicle has an acceleration of: ";
        String lightsMsg = "\nThis vehicle's headlights are ";
        boolean lights = fordfocus.getLights();
        fordfocus.accel(30);
        fordfocus.toggleLights();
        //Assert
        String expected = accelMsg + fordfocus.getAccelRate() + lightsMsg + (!(lights) ? "On" : "Off");
        assertEquals(expected, fordfocus.showVehicleState());
    }
}