package com.leetcode.jzl;

import java.util.Arrays;

public class Solution {

	
//	给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
//
//	你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					nums = Arrays.copyOf(nums, 2);
					nums[0] = i;
					nums[1] = j;
					return nums;
				}
			}
		}
		return nums;
	}

	
	
//	给定一个字符串，找出不含有重复字符的最长子串的长度。
	public static int lengthOfLongestSubstring(String s) {
		int MaxLength = 1;
		if (s.length()==1) {
			return 1;
		}
		// i 定义需要检查的数组的开头的下标
		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {
			
			// j 定义需要检查数组的长度
			for (int j = 1; j < s.length()-i; j++) {
				
				// 被检查数组的初始下标为i,长度为j, 则末尾元素下标为i+j-1
				
				//检查数组中的每个元素是否重复
				
				// 从头开始检查, 从i到数组长度末尾
				int index = i;
				int endIndex = i+j-1;
				flag=false;
				for(; index < endIndex-1; index++) {
					
					// 从开始检查元素的后一个元素开始检查对比
					int indexCheck = index+1;
					for(;  indexCheck < endIndex ; indexCheck++) {
						
						//如果检查到重复，循环退出
						if (s.charAt(index) == s.charAt(indexCheck)) {
							flag=true;
							break;
						}
					}
					if (flag) {
						break;
					}
				}
				
				
				
				if (flag && MaxLength < j) {
					MaxLength = j;
					flag=false;
				}
				
			}
		}
		return MaxLength;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("abc"));
	}

}
