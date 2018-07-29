package com.njwb.jzl.java;

import java.util.Scanner;

class Student {		// 学生类
	private String Name;	// 学生姓名
	private double Score;	// 学生分数
	
	public Student(){		// 无参构造方法
		Name = "no";
		Score = 999;
	}
	
	public void setScore(double score) {		// 设置分数方法
		this.Score = score; 
	}
	public double getScore() {		// 获取分数方法
		return this.Score;
	}
	public String getName() {		// 获取姓名方法
		return Name;
	}
	
	public void setName(String name) {		// 设置姓名方法
		this.Name = name;
	}
	
	public void show() {		// 展示方法
		System.out.println("姓名： "+ this.Name+"\n成绩："+this.Score);
	}
}


public class SortStu {
	
	// 该方法返回一个经过分数从大到小排序后的Student类数组
	public static Student[] Sort(Student[] students) {
		for(int i = 0; i < students.length-1; i++) {
			for(int j = 0; j < students.length-i-1; j++) {
				if (students[j].getScore() < students[j+1].getScore()) {
					Student s = students[j];
					students[j] = students[j+1];
					students[j+1] = s;
				}
			}
		}
		return students;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 初始化
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生数量: ");
		int stuNum = scanner.nextInt();
		Student[] students = new Student[stuNum];
		
		
		for (int i = 0; i < students.length; i++) {
			
			// 输入姓名
			System.out.println("请输入学生#"+(i+1)+"的姓名： ");
			String nameStr = scanner.next();
			students[i] = new Student();
			students[i].setName(nameStr);
			
			// 输入成绩
			System.out.println("请输入学生#"+(i+1)+"的成绩： ");
			double d = scanner.nextDouble();
			students[i].setScore(d);
			
		}
		
		// 排序
		students = Sort(students);
		
		// 输出
		for (Student student : students) {
			student.show();
		}

		
		
		
	}

}
