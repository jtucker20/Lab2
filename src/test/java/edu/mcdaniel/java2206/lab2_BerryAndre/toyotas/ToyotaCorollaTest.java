package edu.mcdaniel.java2206.lab2_BerryAndre.toyotas;

import edu.mcdaniel.java2206.lab2_BerryAndre.fords.FordF150;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToyotaCorollaTest
{

    private ToyotaCorolla corolla;

    @BeforeEach
    void setUp()
    {
        this.corolla = new ToyotaCorolla();
    }

    @Test
    void turnOnLights()
    {
        //boolean expected = true;
        this.corolla.turnOnLights();
        assertTrue(this.corolla.isLightsOn());
    }

    @Test
    void toggleLights()
    {
        this.corolla.toggleLights();
        assertTrue(this.corolla.isLightsOn());
    }

    @Test
    void isLightsOn()
    {
        this.corolla.isLightsOn();
        assertFalse(this.corolla.isLightsOn());
    }
}