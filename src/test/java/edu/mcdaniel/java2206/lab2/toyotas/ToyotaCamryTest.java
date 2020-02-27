package edu.mcdaniel.java2206.lab2.toyotas;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToyotaCamryTest {
    //Arrange
    private ToyotaCamry tc;
    @BeforeEach
    void setUp()
    {
        tc = new ToyotaCamry();
    }

    @Test

    void accel() {
        //Act
        tc.accel(30);
        //Assert
        assertEquals(30, tc.getAccelerationRate());
    }

    @Test
    void brake() {
        //Act
        //Assert
    }

    @Test
    void turnOnLights() {
    }

    @Test
    void toggleLights() {
    }

    @Test
    void showLightsStatus() {
    }

    @Test
    void showVehicleState() {
    }

    @Test
    void getAccelerationRate() {
    }

    @Test
    void getDistance() {
    }

    @Test
    void isLightsOn() {
    }
}