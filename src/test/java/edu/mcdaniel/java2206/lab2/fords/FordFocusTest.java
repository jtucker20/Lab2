package edu.mcdaniel.java2206.lab2.fords;

import edu.mcdaniel.java2206.lab2.toyotas.ToyotaCamry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FordFocusTest {

    private FordFocus focus;

    @BeforeEach
    public void setUp(){
        this.focus = new FordFocus();
    }

    @Test
    void accel() {
        //Arrange
        double expected = 70.0;

        //Act
        this.focus.accel(70.0);

        //Assert
        assertEquals(expected, this.focus.getAccelerationRate());
    }

    @Test
    void brake() {
        //Arrange
        double expected = -50.0;

        //Act
        this.focus.brake(50.0);

        //Assert
        assertEquals(expected, this.focus.getAccelerationRate());
    }

    @Test
    void showVehicleState() {
        //Arrange


        //Act


        //Assert

    }

}