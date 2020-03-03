package edu.mcdaniel.java2206.lab2.toyotas;

import edu.mcdaniel.java2206.lab2.fords.FordFocus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class  ToyotaCorollaTest {
    private ToyotaCorolla corolla;



    @BeforeEach
    public void setUp(){
        this.corolla = new ToyotaCorolla();
    }

    @Test
    void accel() {
        //Arranage
        double expected = 60.0;

        //Act
        this.corolla.accel(100);

        //Assert
        assertEquals(expected, this.corolla.getAccelerationRate());

    }
        @Test
        void brake () {
            //Arange
            double expected = -50.0;

            //Act
            this.corolla.brake(50.0);

            //Assert
            assertEquals(expected, this.corolla.getAccelerationRate());
        }

        @Test
        void showVehicleState () {
        }
    }