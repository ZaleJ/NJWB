package com.njwb.jzl.java.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DogZoon {
	private List<Dog> listDog = new ArrayList<Dog>();
	
	@Override
	public String toString() {
		StringBuffer sBuffer = new StringBuffer();
		for (Dog dog : listDog) {
			sBuffer.append(dog);
		}
		
		return sBuffer.toString();
	}
	
	public int count() {
		return listDog.size();
	}
	
	public void show() {
		System.out.println("共计有"+count()+"条狗");
		System.out.println("分别是：");
		System.out.println(toString());
		
		
		
	}
	
	
//	2、在第一题基础上扩充以下几部分功能		
//	删除指定位置的狗狗，如第一个狗狗
//	删除指定的狗狗，如删除feifeiDog对象
//	判断集合中是否包含指定狗狗
//	注；使用List接口提供的remove()、contains()方法
	
	public void add(Dog dog) {
		this.listDog.add(dog);
	}
	
	public Dog remove(int position) {
		return listDog.remove(position);
	}
	
	public Dog get(int position) {
		return listDog.get(position);
	}
	
	public boolean isContains(Dog dog) {
		if (listDog.contains(dog)) {
			return true;
		}
		return false;
	}
//	
//	3、在集合（头部、尾部）添加、获取、删除狗狗对象
//	注：插入、删除操作频繁时，可使用LinkedList来提高效率
	
	public boolean remove(Dog dog) {
		return listDog.remove(dog);
	}
	
	public void addFirst(Dog dog) {
		listDog.add(0, dog);
		
	}
	
	public void addLast(Dog dog) {
		listDog.add(listDog.size(), dog);
	}
	
	

	public static void main(String[] args) {
//		1、存储多条狗狗信息，获取狗狗总数，逐条打印出各条狗狗信息 ？（使用ArrayList）
		DogZoon dogZoon = new DogZoon();
		dogZoon.add(new Dog("呆逼", "哈士奇"));
		dogZoon.add(new Dog("沙雕", "泰迪"));
		dogZoon.add(new Dog("狗蛋龙", "拉布拉多"));
		dogZoon.add(new Dog("战狼", "wolf"));
		
		
//		5、向集合中存入一串整数，然后遍历输出；（使用TreeSet）
		Set<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(12);
		treeSet.add(33);
		treeSet.add(24);
		treeSet.add(15);
		
		
		for (Integer integer : treeSet) {
			System.out.println(integer);
		}
//		6、在第五题的基础上在插入一条数据，然后输出
		treeSet.add(26);
		
		for (Integer integer : treeSet) {
			System.out.println(integer);
		}
		

	}
	
	

}
