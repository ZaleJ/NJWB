package com.njwb.jzl.java;

import java.util.Arrays;

public class CharArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c1 = {'w','o','w'};
		char[] c2 = {'s','h','i','T'};
		c1=Arrays.copyOf(c2, 4);
		System.out.println(c1);
	}

}
