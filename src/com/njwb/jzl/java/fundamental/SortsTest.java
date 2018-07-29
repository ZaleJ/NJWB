package com.njwb.jzl.java.fundamental;

import java.util.Arrays;
import java.util.Scanner;




//不使用循环实现插入数组值
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
		
			// init
			int[] a = {5,4,3,2,1};
			
			//input
			Scanner scanner = new Scanner(System.in);
			int index = scanner.nextInt();
			int indexValue = scanner.nextInt();
			
			
			//generate
			
				//pre
			int[] b = Arrays.copyOf(a, index+1);
			b[index] = indexValue;
			
				//aft
			int[] c = Arrays.copyOfRange(a, index, a.length);
			int[] d = new int[a.length+1];
			//public static native void arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
			System.arraycopy(b, 0, d, 0, b.length);
			System.arraycopy(c, 0, d, index+1, c.length);
			
			System.out.println(Arrays.toString(d));
			
			
			
	}

}
