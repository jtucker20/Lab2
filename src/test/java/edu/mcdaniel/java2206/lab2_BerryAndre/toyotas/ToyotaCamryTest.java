package edu.mcdaniel.java2206.lab2_BerryAndre.toyotas;

import edu.mcdaniel.java2206.lab2_BerryAndre.fords.FordF150;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToyotaCamryTest
{

    private ToyotaCamry camry;

    @BeforeEach
    void setUp()
    {
        this.camry = new ToyotaCamry();
    }

    @Test
    void turnOnLights()
    {
        //boolean expected = true;
        this.camry.turnOnLights();
        assertTrue(this.camry.isLightsOn());
    }

    @Test
    void toggleLights()
    {
        this.camry.toggleLights();
        assertTrue(this.camry.isLightsOn());
    }

    @Test
    void isLightsOn()
    {
        this.camry.isLightsOn();
        assertFalse(this.camry.isLightsOn());
    }
}