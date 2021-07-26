package com.lookuppincode.helper;

import java.io.IOException;
import java.util.Properties;

public class PincodeLocator {
	public static void main(String[] args) throws IOException {
		String pincode = null;
		String stateName = null;
		Properties props = null;

		if (args.length != 1) {
			throw new RuntimeException("ERROR: please pass state name to find the pincode");
		}
		stateName = args[0];
		props = new Properties();
		props.load(PincodeLocator.class.getClassLoader().getResourceAsStream("pincodes.properties"));
		if (props.size() == 0) {
			throw new RuntimeException("ERROR: empty properties file located");
		}
		if (props.containsKey(stateName) == false) {
			throw new RuntimeException("ERROR: please pass a valid statename without spaces");
		}
		pincode = props.getProperty(stateName);
		System.out.println("state name : " + stateName + " pincode : " + pincode);
	}
}
