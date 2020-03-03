package edu.mcdaniel.java2206.lab2.toyotas;

import edu.mcdaniel.java2206.lab2.fords.FordF150;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToyotaCamryTest {
    private ToyotaCamry camry;



    @BeforeEach
    public void setUp(){
        this.camry = new ToyotaCamry();
    }

    @Test
    void accel() {
        //Arranage
        double expected = 60.0;

        //Act
        this.camry.accel( 100);

        //Assert
        assertEquals(expected, this.camry.getAccelerationRate());

    }

    @Test
    void brake() {
        //Arange
        double expected = -50.0;

        //Act
        this.camry.brake(50.0);

        //Assert
        assertEquals(expected, this.camry.getAccelerationRate() );
    }

    @Test
    void showVehicleState() {
    }
}