package com.ju4.helper;

import org.junit.After;
import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;

public class ArrayHelperTest {
	private ArrayHelper arrayHelper;

	@Before
	public void init() {
		arrayHelper = new ArrayHelper();
	}

	@Test
	public void testRemoveDuplicateElements() {
		int[] inArray = { 10, 11, 34, 23, 10, 34, 45 };
		int[] expectedArray = { 10, 11, 34, 23, 45 };
		int[] actualArray = null;

		actualArray = arrayHelper.removeDuplicateElements(inArray);
		assertArrayEquals(expectedArray, actualArray);
	}

	@Test
	public void testRemoveDuplicateElementsWithNoDuplicates() {
		int[] inArray = { 1, 2, 3, 4, 5, 6, 7 };
		int[] expectedArray = { 1, 2, 3, 4, 5, 6, 7 };
		int[] actualArray = null;

		actualArray = arrayHelper.removeDuplicateElements(inArray);
		assertArrayEquals(expectedArray, actualArray);
	}

	@Test
	public void testRemoveDuplicateElementsWithAllDuplicates() {
		int[] inArray = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		int[] expectedArray = { 1 };
		int[] actualArray = null;

		actualArray = arrayHelper.removeDuplicateElements(inArray);
		assertArrayEquals(expectedArray, actualArray);
	}

	@Test
	public void testRemoveDuplicateElementsWithOneElement() {
		int[] inArray = { 1 };
		int[] expectedArray = { 1 };
		int[] actualArray = null;

		actualArray = arrayHelper.removeDuplicateElements(inArray);
		assertArrayEquals(expectedArray, actualArray);
	}

	@Test
	public void testRemoveDuplicateElementInEmptyArray() {
		int[] inArray = {};
		int[] expectedArray = {};
		int[] actualArray = null;

		actualArray = arrayHelper.removeDuplicateElements(inArray);
		assertArrayEquals(expectedArray, actualArray);

	}

	@Test
	public void testGetSumOfElements() {
		int[] inArray = { 1, 2, 3, 4, 5 };
		long expectedSum = 15;
		long actualSum = 0;

		actualSum = arrayHelper.getSumOfElements(inArray);
		assertEquals(expectedSum, actualSum);
	}

	@Test
	public void testGetSumOfElementsWithOneElement() {
		int[] inArray = { 10 };
		long expectedSum = 10;
		long actualSum = 0;

		actualSum = arrayHelper.getSumOfElements(inArray);
		assertEquals(expectedSum, actualSum);
	}

	@Test(expected = NoSuchElementException.class)
	public void testGetSumOfElementsWithEmptyArray() {
		int[] inArray = {};
		// long expectedSum = 0;
		// long actualSum = 0;

		// try {
		arrayHelper.getSumOfElements(inArray);
		/*
		 * } catch (NoSuchElementException e) { System.out.println("exception");
		 * assertEquals(1, 1); return; } assertFalse(true);
		 */
	}

	@After
	public void cleanUp() {
		arrayHelper = null;
	}
}
