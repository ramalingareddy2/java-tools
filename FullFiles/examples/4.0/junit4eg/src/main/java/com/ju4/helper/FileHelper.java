package com.ju4.helper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.ju4.exception.ParseException;
import com.ju4.exception.ResourceNotFoundException;

public class FileHelper {

	public long chars(final String inFileLocation) {
		long nChars = 0;
		File inFile = null;

		inFile = new File(inFileLocation);
		try (FileReader fileReader = new FileReader(inFile);) {
			while ((fileReader.read()) != -1) {
				nChars++;
			}
		} catch (FileNotFoundException e) {
			throw new ResourceNotFoundException(e);
		} catch (IOException e) {
			throw new ParseException("error while reading file", e);
		}
		return nChars;
	}
}
