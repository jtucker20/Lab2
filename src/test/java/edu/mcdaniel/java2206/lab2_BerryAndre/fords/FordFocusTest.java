package edu.mcdaniel.java2206.lab2_BerryAndre.fords;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FordFocusTest
{

    private FordFocus Focus;

    @BeforeEach
    void setUp()
    {
        this.Focus = new FordFocus();
    }

    @Test
    void accel()
    {
        double expected = 70.0;

        this.Focus.accel(70.0);

        assertEquals(expected, this.Focus.getAccelerationRate());
    }

    @Test
    void brake()
    {
        double expected = -50.0;

        this.Focus.brake(50.0);

        //assertEquals(expected, this.Focus.getBrakeRate());
    }

    @Test
    void showVehicleState()
    {
        String expected = "This Ford Focus has an acceleration of: 0.0\n" +
                "This vehicle has it's lights Off";

        this.Focus.showVehicleState();

        assertEquals(expected, this.Focus.showVehicleState());
    }
}