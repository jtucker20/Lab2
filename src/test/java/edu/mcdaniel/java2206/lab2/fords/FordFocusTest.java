package edu.mcdaniel.java2206.lab2.fords;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FordFocusTest {
    private FordFocus focus;



    @BeforeEach
    public void setUp(){
        this.focus = new FordFocus();
    }

    @Test
    void accel() {
        //Arranage
        double expected = 80.0;

        //Act
        this.focus.accel( 100);

        //Assert
        assertEquals(expected, this.focus.getAccelerationRate());

    }

    @Test
    void brake() {
        //Arange
        double expected = -50.0;

        //Act
        this.focus.brake(50.0);

        //Assert
        assertEquals(expected, this.focus.getAccelerationRate() );
    }

    @Test
    void showVehicleState(){
    }
}