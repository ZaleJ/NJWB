package com.njwb.jzl.java.chapter12;

public class Three1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			int[] a = new int[3];
			int s = a[3];		
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
