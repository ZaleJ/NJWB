package com.njwb.jzl.java;

import java.util.Arrays;

public class OnlyOne {
	
	public static int[] ClearOne(int[] a) {
		for(int i = 0; i < a.length-1; i++) {
			for(int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					a[j] = 0;
				}
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,1,1,2,3,2,2,3,3};
		a = ClearOne(a);
		System.out.println(Arrays.toString(a));
	}

}
