package com.mc.bean;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	Calculator calculator;

	@Override
	protected void setUp() throws Exception {
		calculator = new Calculator();
	}

	public void testAddWithPositiveNumbers() throws Exception {
		int a = 10;
		int b = 20;
		int expectedSum = 30;
		int actualSum = 0;

		actualSum = calculator.add(a, b);
		Assert.assertEquals(expectedSum, actualSum);
	}

	public void testAddWithNegativeNumbers() throws Exception {
		int a = -10;
		int b = -20;
		int expectedSum = -30;
		int actualSum = 0;

		actualSum = calculator.add(a, b);
		Assert.assertEquals(expectedSum, actualSum);
	}

	@Override
	protected void tearDown() throws Exception {
		calculator = null;
	}

}
