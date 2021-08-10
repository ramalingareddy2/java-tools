package com.ju4.bean;

import org.junit.After;
import org.junit.AfterClass;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	Calculator calculator;

	@BeforeClass
	public static void startUp() {
		System.out.println("startUp()");
	}

	@Before
	public void initialize() {
		System.out.println("initialize()");
		calculator = new Calculator();
	}

	@Test
	public void testAddWithPositiveNumbers() {
		int a = 10;
		int b = 20;
		int expectedSum = 30;
		int actualSum = 0;
		System.out.println("testAddWithPositiveNumbers()");
		actualSum = calculator.add(a, b);
		assertEquals(expectedSum, actualSum);
	}

	@Test
	public void testAddWithNegativeNumbers() {
		int a = -10;
		int b = -20;
		int expectedSum = -30;
		int actualSum = 0;
		System.out.println("testAddWithNegativeNumbers()");
		actualSum = calculator.add(a, b);
		assertEquals(expectedSum, actualSum);
	}

	@After
	public void cleanUp() {
		System.out.println("cleanUp()");
		calculator = null;
	}

	@AfterClass
	public static void shutDown() {
		System.out.println("shutdown()");
	}
}
