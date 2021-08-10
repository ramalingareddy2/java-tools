package com.ju4.bean;

import junit.framework.Assert;
import junit.framework.TestCase;

public class WordGameTest extends TestCase {
	WordGame wordGame;

	@Override
	protected void setUp() throws Exception {
		wordGame = new WordGame();
	}

	public void testReverse() {
		String inWord = "Java";
		String expectedWord = "avaJ";
		String actualWord = null;

		actualWord = wordGame.reverse(inWord);
		Assert.assertEquals(expectedWord, actualWord);
	}

	@Override
	protected void tearDown() throws Exception {
		wordGame = null;
	}

}
