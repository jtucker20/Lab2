package edu.mcdaniel.java2206.lab2.toyotas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToyotaCamryTest {

    private ToyotaCamry camry;

    @BeforeEach
    void setUp() {
            this.camry = new ToyotaCamry();
    }

    @Test
    void accel() {

        //Arrange
        double expected = 70;

        //Act
        this.camry.accel(70);
        double actual = this.camry.getAccelerationRate();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void brake() {
    }

    @Test
    void turnOnLights() {
    }
}