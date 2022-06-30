package Q13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		assertEquals(-10, Calculator.addition(5, -15));
		assertEquals(15, Calculator.substraction(20,5));
		assertEquals(75, Calculator.multiplication(5, 15));
		assertEquals(2, Calculator.cubeRoot(8));
		assertEquals(11, Calculator.squareRoot(121));
		
	}
	
	@Test
	void divide()
	{
		//assertEquals(3, Calculator.division(15, 3));
		
		try {
			assertEquals(5, Calculator.division(15, 0
					));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmatic Exception is occured for division : "+e);
		}
	}
	
	@Test
	void modulus()
	{
		try
		{
			assertEquals(3, Calculator.modulus(15, 0));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmatic exception is occured for modulus : "+ e);
			
		}
	}
	
	@Test
	
	void power()
	{
		try
		{
			assertEquals(25, Calculator.power(5,0));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception is occured for power : "+e);
		}
	}

}
