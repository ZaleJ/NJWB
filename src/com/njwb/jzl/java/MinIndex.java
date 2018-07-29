package com.njwb.jzl.java;

public class MinIndex {
	
	public static int MinIndexV(int[] a) {
		int min = 0;
		for(int i = 1; i < a.length; i++) {
			if (a[i]<a[min]) {
				min=i;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,1,1,1,1,2,2,0,4,5,67,0,9};
		System.out.println(MinIndexV(a));
	}

}
