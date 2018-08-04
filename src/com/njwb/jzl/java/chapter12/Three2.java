package com.njwb.jzl.java.chapter12;

public class Three2 {
	public void test() throws MyException{
		if (1+1==2) {
			throw new MyException("this is bull shit.");
		}
	}
	public static void main(String[] args) {
		try {
			new Three2().test();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
