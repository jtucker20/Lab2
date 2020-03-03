package edu.mcdaniel.java2206.lab2.fords;

import edu.mcdaniel.java2206.lab2.toyotas.ToyotaCamry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FordF150Test {
    private FordF150 f150;



    @BeforeEach
    public void setUp(){
         this.f150 = new FordF150();
    }

    @Test
    void accel() {
        //Arranage
        double expected = 45.0;

        //Act
        this.f150.accel( 100);

        //Assert
        assertEquals(expected, this.f150.getAccelerationRate());

    }

    @Test
    void brake() {
        //Arange
        double expected = -50.0;

        //Act
        this.f150.brake(50.0);

        //Assert
        assertEquals(expected, this.f150.getAccelerationRate() );
    }

    @Test
    void showVehicleState() {
    }
}