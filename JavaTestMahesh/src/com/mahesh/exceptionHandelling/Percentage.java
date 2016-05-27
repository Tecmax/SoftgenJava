package com.mahesh.exceptionHandelling;

public class Percentage {
	private final int value;

	/**
	 * A percentage value must be between 0 and 100 inclusive.
	 * 
	 * @param value
	 *            the percentage value
	 */
	public Percentage(int value) {
		if (value < 0 || value > 100) {
			throw new IllegalArgumentException();
		}
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
