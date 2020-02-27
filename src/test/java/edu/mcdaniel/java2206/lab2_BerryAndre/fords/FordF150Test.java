package edu.mcdaniel.java2206.lab2_BerryAndre.fords;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FordF150Test
{

    private FordF150 F150;

    @BeforeEach
    void setUp()
    {
        this.F150 = new FordF150();
    }

    @Test
    void turnOnLights()
    {
        //boolean expected = true;
        this.F150.turnOnLights();
        assertTrue(this.F150.isLightsOn());
    }

    @Test
    void toggleLights()
    {
        this.F150.toggleLights();
        assertTrue(this.F150.isLightsOn());
    }

    @Test
    void isLightsOn()
    {
        this.F150.isLightsOn();
        assertFalse(this.F150.isLightsOn());
    }
}