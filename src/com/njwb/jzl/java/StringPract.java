package com.njwb.jzl.java;

public class StringPract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;
		char level = score > 90 ? 'A':(score>80?'B':(score>70?'C':(score>60?'D':'E')));
		System.out.println(level);
	}

}
