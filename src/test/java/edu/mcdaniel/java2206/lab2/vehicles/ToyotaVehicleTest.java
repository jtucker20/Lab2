package edu.mcdaniel.java2206.lab2.vehicles;

import edu.mcdaniel.java2206.lab2.toyotas.ToyotaCamry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToyotaVehicleTest {
    private ToyotaVehicle vehicle;

    @BeforeEach
    void setUp() {
            this.vehicle = new ToyotaVehicle();
    }

    @Test
    void displaySpeedAsString() {
        //Arrange
        double expected = 80;

        //Act
        this.vehicle.displaySpeedAsString ( 80);
        double actual = this.vehicle.getAccelerationRate();
        // Assert
        assertEquals(expected, actual);

    }

    @Test
    void getSpeed() {
    }

    @Test
    void setSpeed() {
    }
}