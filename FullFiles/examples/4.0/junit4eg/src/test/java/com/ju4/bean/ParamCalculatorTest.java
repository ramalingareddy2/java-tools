package com.ju4.bean;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParamCalculatorTest {
	int a;
	int b;
	int expectedSum;
	Calculator calculator;

	public ParamCalculatorTest(int a, int b, int expectedSum) {
		this.a = a;
		this.b = b;
		this.expectedSum = expectedSum;
	}

	@Parameters
	public static List<Integer[]> getParameters() {
		return Arrays.asList(new Integer[][] { { 10, 20, 30 }, { -10, -20, -30 }, { -10, 20, 10 }, { 0, 0, 0 } });
	}

	@Before
	public void init() {
		calculator = new Calculator();
	}

	@Test
	public void testAdd() {
		int actualSum = 0;

		actualSum = calculator.add(a, b);
		assertEquals(expectedSum, actualSum);
	}

	@After
	public void cleanUp() {
		calculator = null;
	}

}
