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
    void toggleLight()
    {
        this.camry.toggleLights();
        assertTrue(this.camry.isLightsOn());
    }

    @Test
    void brake()
    {

    }

    @Test
    void showVehicleState()
    {

    }
}