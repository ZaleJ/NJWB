package com.njwb.jzl.java.fundamental;

import java.util.Scanner;

public class StringPract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;
		char level = score > 90 ? 'A' : (score > 80 ? 'B' : (score > 70 ? 'C' : (score > 60 ? 'D' : 'E')));
		System.out.println(level);
		Scanner scanner = new Scanner(System.in);
		String string = "ss";
		switch (string) {
			default:
				System.out.println("yeye");
				break;
			case "ss":
				System.out.println("heiheihei");
				break;
		}
		
		
		
		
	}

}
