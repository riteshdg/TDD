package com.courses.tdd.Calculator;

public class DivideByZeroException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DivideByZeroException (String message) {
		super(message);
	}
}
