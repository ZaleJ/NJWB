package com.njwb.jzl.java;

import java.util.Scanner;

//3.编写一个程序，使它能够读入10个整数，并且存储其中互不相同的数，最后将这10个数输出。


//无重复int型字符串类
class NoRepeatArray{
	int[] arr;	//数据字符串
	int len = 10;	// 默认数据长度
	public NoRepeatArray() {	// 无参构造方法
		arr = new int[len];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MAX_VALUE-i;
		}
	}
	
	public void reInit() {		// 重新初始化
		arr = new int[len];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MAX_VALUE-i;
		}
	}
	
	
	public boolean setAllValue() {		// 重置并设置默认值规定的所有数值
		reInit();
		Scanner scanner = new Scanner(System.in);
		int input  = Integer.MAX_VALUE;;
		try {
			for (int i = 0; i <len; i++) {
			
				input = scanner.nextInt();
				if (isRepeat(input)) {
					System.out.println("有重复数据，请重新输入：");
					scanner = new Scanner(System.in);
					reInit();
					i=-1;
					continue;
					
				}else {
					arr[i] = input;
				}

			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);
			return false;
		}
		
		return true;
	}
	
	// 根据下标赋值
	public boolean setValueByIndex(int index, int value) {
		if (index>-1 && index <arr.length && (!isRepeat(value))) {
			arr[index] = value;
			System.out.println("插入单个值成功！");
			return true;
		}else {
			System.out.println("插入单个值失败！");
			return false;
		}
		
	}
	
	// 根据下标获取值
	public int getValueByIndex(int index) {
		return arr[index];
	}
	
	// 检查元素在数组中是否是否重复
	public boolean isRepeat(int i) {
		for (int j : arr) {
			if (i==j) {
				return true;
			}
		}
		return false;
	}
	
	
	// 展示数组内容
	@Override
	public String toString() {
		String string = "[";
		
		for (int i : arr) {
			string+=i+" ";
		}
		string+="]";
		return string;
	}
	
	
	// 获取数组长度
	public int getLength() {
		return arr.length;
	}
	
	
	
	
	
	
	
}

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 初始化
		NoRepeatArray noRepeatArray = new NoRepeatArray();
		System.out.println("请输入10 个数据， 以空格分隔， 以回车结束");
		noRepeatArray.setAllValue();
		System.out.println(noRepeatArray);
		
		Scanner scanner = new Scanner(System.in);
		int index = Integer.MAX_VALUE;
		int value = Integer.MAX_VALUE;
		
		// 循环验证下标条件和值条件
		while(true) {
			System.out.println("请输入要插入数据的下标：");
			try {
				scanner = new Scanner(System.in);
				index = scanner.nextInt();
				if (index<noRepeatArray.getLength() && index>-1) {
					System.out.println("请输入要插入数据的值：");
					value = scanner.nextInt();
					if (!noRepeatArray.isRepeat(value)) {
						noRepeatArray.setValueByIndex(index, value);
						break;
					}
				}
				System.out.println("条件不满足，请重新输入");
				
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println(e);
			}
			
		}
		
		
		// 打印输出
		System.out.println(noRepeatArray);
	}

}
