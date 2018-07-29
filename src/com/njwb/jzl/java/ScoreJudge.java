package com.njwb.jzl.java;

import java.util.Scanner;

public class ScoreJudge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] Nums = new int[1000];
		for(int i = 0; i < 1000; i++) {
			Nums[i] = -1;
		}
		int i = 0;
		for (; i < 1000; i++) {
			Nums[i] = input.nextInt();
			if (Nums[i] < 0) {
				break;
			}
		}
		int sum = 0;
		for (int j = 0; j < i; j++) {
			sum += Nums[j];
		}
		double r = sum / i;
		int higher = 0;
		int lower = 0;
		for (int n = 0; n < i; n++) {
			if (Nums[n] >= r) {
				higher++;
			} else {
				lower++;
			}
		}
		System.out.println("大于或等于平均数的个数:" + higher);
		System.out.println("小于平均数的个数:" + lower);
		for (int j : Nums) {
			if (j>0) {
				System.out.print(j+" ");
			}
		}
	}

}