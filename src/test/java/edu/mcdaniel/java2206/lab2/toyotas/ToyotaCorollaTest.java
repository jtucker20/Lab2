package edu.mcdaniel.java2206.lab2.toyotas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToyotaCorollaTest {

    private ToyotaCorolla corolla;

    @BeforeEach
    public void setUp(){
        this.corolla = new ToyotaCorolla();
    }

    @Test
    void accel() {
        //Arrange
        double expected = 70.0;

        //Act
        this.corolla.accel(70.0);

        //Assert
        assertEquals(expected, this.corolla.getAccelerationRate());
    }

    @Test
    void brake() {
        //Arrange
        double expected = -50.0;

        //Act
        this.corolla.brake(50.0);

        //Assert
        assertEquals(expected, this.corolla.getAccelerationRate());
    }

    @Test
    void showVehicleState() {
        //Arrange


        //Act


        //Assert

    }


}