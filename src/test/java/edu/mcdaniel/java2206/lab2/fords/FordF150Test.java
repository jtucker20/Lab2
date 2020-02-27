package edu.mcdaniel.java2206.lab2.fords;

import edu.mcdaniel.java2206.lab2.toyotas.ToyotaCamry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FordF150Test {

    private FordF150 F150;

    @BeforeEach
    public void setUp(){
        this.F150 = new FordF150();
    }

    @Test
    void accel() {
        //Arrange
        double expected = 70.0;

        //Act
        this.F150.accel(70.0);

        //Assert
        assertEquals(expected, this.F150.getAccelerationRate());
    }

    @Test
    void brake() {
        //Arrange
        double expected = -50.0;

        //Act
        this.F150.brake(50.0);

        //Assert
        assertEquals(expected, this.F150.getAccelerationRate());
    }

    @Test
    void showVehicleState() {
        //Arrange


        //Act


        //Assert

    }

}