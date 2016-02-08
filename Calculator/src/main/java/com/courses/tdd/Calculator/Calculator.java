package com.courses.tdd.Calculator;

/**
 * Hello world!
 *
 */
public class Calculator {
	private double result;
	
	public Calculator () {
		result = 0.0;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public double add(double operandA, double operandB) {
		// TODO Auto-generated method stub
		result = operandA + operandB;
		return result;
	}

	public double subtract(double operandA, double operandB) {
		// TODO Auto-generated method stub
		result = operandA - operandB;
		return result;
	}

	public double multiply(double operandA, double operandB) {
		// TODO Auto-generated method stub
		result = operandA * operandB;
		return result;
	}

	public double divide(double operandA, double operandB) {
		// TODO Auto-generated method stub
		if (operandB == 0.0d)
			throw new ArithmeticException("Exception: Divide by zero not allowed");
		result = operandA / operandB;
		return result;
	}
	
	/*
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }
    */
}
