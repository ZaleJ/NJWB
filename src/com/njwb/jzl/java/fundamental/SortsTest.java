package com.njwb.jzl.java.fundamental;

import java.util.Arrays;

public class SortsTest {
	public static void swap(int x, int y) {
		x+=y-(y=x);
		System.out.println(x+"&&"+y);
	}

	public static int[] BoolSort(int[] a) {
		boolean flag = false;
		for(int i = 0; i < a.length-1; i++) {
			for(int j = 0; j < a.length-1-i; j++) {
				if(a[j]>a[j+1]) {
//					swap(a[j], a[j+1]);
					a[j] +=a[j+1]-(a[j+1]=a[j]);
					flag = true;
				}
			}
			if (!flag) {
				break;
			}
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] a = {5,4,3,2,1};
			System.out.println(Arrays.toString(BoolSort(a)));
			
	}

}
