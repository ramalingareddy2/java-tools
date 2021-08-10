package com.ju4.bean;

public class WordGame {
	public String reverse(String word) {
		StringBuffer buffer = null;

		buffer = new StringBuffer(word);
		buffer = buffer.reverse();
		return buffer.toString();
	}
}
