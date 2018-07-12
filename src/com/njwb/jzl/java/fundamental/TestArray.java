package com.njwb.jzl.java.fundamental;

import java.util.Arrays;



public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		数组是内存中存放数据时，一串连续的内存空间
		
//		数组的声明方式[]放前面和放后面都可以
		int[] a;
		int b[];
		a = new int[10];	//在数组中存放了10个数据单元    即给数组分配大小
		for(int i = 0; i < a.length; i++) {
			a[i]  = i;
		}
		
		for (int i :a) {
			System.out.println(i);
		}
		
		System.out.println(Arrays.toString(a));
	}

}
