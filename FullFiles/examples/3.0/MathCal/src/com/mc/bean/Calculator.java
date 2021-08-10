package com.mc.bean;

public class Calculator {
	public int add(int a, int b) throws Exception {
		if (a < 0) {
			throw new Exception("negative");
		}
		return a + b;
	}
}
