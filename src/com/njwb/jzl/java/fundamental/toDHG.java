package com.njwb.jzl.java.fundamental;

public class toDHG {
	public static void plusBack(int n ) {
		//先决判断
		if (n<0) {
			return;
		}
		
		//初始化
		int[] a = new int[n*2-1];
		if (n>1) {
			a[0]=1;
			a[1]=2;
		}else {
			a[0]=1;
			System.out.print(a[0]);
			System.out.println();
			return;
		}
		
		//前半段赋值
		for (int i = 2; i < n ; i++) {
			a[i] = a[i-1]+a[i-2];
		}
		
		
		//后半段赋值
		for(int i = n; i < 2*n-1; i++) {
			a[i] = a[2*n-i-2];	
		}
		
		
		//打印
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i < 11; i++) {
			plusBack(i);
		}
		
	}

}
