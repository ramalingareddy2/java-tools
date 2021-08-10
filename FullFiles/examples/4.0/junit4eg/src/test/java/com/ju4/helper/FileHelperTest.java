package com.ju4.helper;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class FileHelperTest {
	FileHelper fileHelper;
	File dataFile;
	File oneCharFile;
	File emptyFile;

	@Before
	public void init() throws IOException {
		fileHelper = new FileHelper();
		dataFile = FileManager.createTempFileWithData("data-",
				"JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation Framework JUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation FrameworkJUnit is an Unit Test Automation Framework");
		oneCharFile = FileManager.createTempFileWithData("singlechar-", "J");
		emptyFile = FileManager.createTempFileWithData("empty-", "");
	}

	@Test(timeout = 2)
	public void testCharsWithDataFile() {
		long expectedChars = 42;
		long actualChars = 0;

		actualChars = fileHelper.chars(dataFile.getAbsolutePath());
		assertEquals(expectedChars, actualChars);
	}

	@Test
	public void testCharsWithSingleCharFile() {
		long expectedChars = 1;
		long actualChars = 0;

		actualChars = fileHelper.chars(oneCharFile.getAbsolutePath());
		assertEquals(expectedChars, actualChars);
	}

	@Test
	public void testCharsWithEmptyFile() {
		long expectedChars = 0;
		long actualChars = 0;

		actualChars = fileHelper.chars(emptyFile.getAbsolutePath());
		assertEquals(expectedChars, actualChars);
	}

	@After
	public void cleanUp() {
		dataFile.delete();
		oneCharFile.delete();
		emptyFile.delete();
	}
}
