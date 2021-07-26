package com.systemprops.test;

import java.util.Properties;

public class SystemPropertiesTest {
	public static void main(String[] args) {
		Properties props = System.getProperties();
		for(Object propName : props.keySet()) {
			System.out.println(propName + " = " + props.getProperty((String)propName));
		}
	}
}
