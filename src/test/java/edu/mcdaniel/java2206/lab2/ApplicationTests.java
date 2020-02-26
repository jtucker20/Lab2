package edu.mcdaniel.java2206.lab2;

import edu.mcdaniel.java2206.lab2.toyotas.ToyotaCamry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	private ToyotaCamry ToyotaCamryClass;

	@BeforeEach
	void setUp()
	{

		ToyotaCamryClass = new ToyotaCamry();

	}

	@Test
	void accel()
	{
		//Arrange

		//Act

		//Assert


	}

}
