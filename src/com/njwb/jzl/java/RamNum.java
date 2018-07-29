package com.njwb.jzl.java;

import java.util.Random;

public class RamNum {

	public static void RamNumCount(int max) {
		int[] nums = new int[max];
		
		Random random = new Random();
		for(int i = 0; i < 100; i++) {
			int r = random.nextInt(10);
			nums[r]++;
		}
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println("数字"+i+"出现次数："+nums[i]);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RamNumCount(10);
	}

}
