package com.courses.tdd.Calculator;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * Unit test for Calculator
 */
public class CalculatorTest {
	private Calculator calc;
	private static final double OPERAND_A = 5d;
	private static final double OPERAND_B = 4d;
	
	@Before
	public void setUp () {
		calc = new Calculator();
	}
	
	@Test
	public void calc_IsCreatedAndInitialized () {
		assertEquals(0.0d, calc.getResult(), 0.0d);
	}
	
	@Test
	public void add_2Values_ValidOperation () {
		double result = calc.add(OPERAND_A, OPERAND_B);
		assertEquals(OPERAND_A + OPERAND_B, result, 0d);
		assertEquals(OPERAND_A + OPERAND_B, calc.getResult(), 0d);
	}

	@Test
	public void subtract_2Values_ValidOperation () {
		double result = calc.subtract(OPERAND_A, OPERAND_B);
		assertEquals(OPERAND_A - OPERAND_B, result, 0d);
		assertEquals(OPERAND_A - OPERAND_B, calc.getResult(), 0d);
	}

	@Test
	public void multiply_2Values_ValidOperation () {
		double result = calc.multiply(OPERAND_A, OPERAND_B);
		assertEquals(OPERAND_A * OPERAND_B, result, 0d);
		assertEquals(OPERAND_A * OPERAND_B, calc.getResult(), 0d);
	}

	@Test
	public void divide_2Values_ValidOperation () throws DivideByZeroException{
		double result = calc.divide(OPERAND_A, OPERAND_B);
		assertEquals(OPERAND_A / OPERAND_B, result, 0d);
		assertEquals(OPERAND_A / OPERAND_B, calc.getResult(), 0d);
	}
	
	@Test(expected=DivideByZeroException.class)
	public void divide_By_Zero_Exception () throws DivideByZeroException{
		double result = calc.divide(OPERAND_A, 0.0d);
		fail("Divide by zero should have failed. Result = " + result);
	}
}
