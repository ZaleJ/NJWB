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
		for (int i : a) {
			System.out.println(i);
		}
		for(int i = 0; i < a.length; i++) {
			a[i]  = i;
		}
		
		for (int i :a) {
			System.out.println(i);
		}
		
		System.out.println(Arrays.toString(a));
		
		int[] c = {1,2,3};
		int[] d = {1,2,3};
		int e = 1;
		int f = 1;
		System.out.println(c==d);
		


		//超简洁的交换，通过运算符优先级实现
		int x = Integer.MAX_VALUE;
		int y = Integer.MAX_VALUE-1;
		x = x + y - (y = x);
		System.out.println(x+"%%"+y);
		
		
		//同样通过运算符优先级进行
		x = Integer.MAX_VALUE;
		y = Integer.MAX_VALUE-1;
		y = x + (x=y)*0;
		System.out.println(x+"%%"+y);
		
		
		
		//使用异或与运算符优先级实现
		x = Integer.MAX_VALUE;
		y = Integer.MAX_VALUE-1;
		x ^= y ^ (y=x);
		System.out.println(x+"%%"+y);
	}

}
