package com.njwb.jzl.java;

import java.util.Scanner;

public class ArrayClass {
	
	public static void backSort(){
		int[] a = {1,3,5,7,9,11,13,15,17,19};
		for(int i = a.length-1; i >=0; i--){
			System.out.println(a[i]);
		}
	}

	
	
//	.编写一个程序，提示用户输入学生数量 姓名和他们的成绩，并按照成绩的降序来打印学生的姓名。
	public static void stus(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入学生数量： ");
		int stuNum = scanner.nextInt();
		String[][] stuNames = new String[stuNum][2];
		try {
			for (int i = 0; i < stuNum; i++) {
				System.out.println("请输入学生"+(i+1)+"姓名");
				stuNames[i][0] = scanner.next();
				System.out.println("请输入学生"+(i+1)+"成绩");
				stuNames[i][1] = scanner.next();
				Double.parseDouble(stuNames[i][1]);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("输入异常");
			return;
		}
		
		String  temp = null;
		for (int i = 0; i < stuNames.length-1; i++) {
			for (int j = i; j < stuNames.length-1; j++) {
				if(Double.parseDouble(stuNames[j][1])>Double.parseDouble(stuNames[j+1][1])){
					temp = stuNames[j][1];
					stuNames[j][1] = stuNames[j+1][1];
					stuNames[j+1][1] = temp;
				}
			}
		}
		for (String[] strings : stuNames) {
			System.out.println("姓名：" + strings[0]);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stus();
	}

}
