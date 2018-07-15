package com.njwb.jzl.java;

import java.util.Scanner;

class Judeg{
	private int higher;
	private int lower;
	private int average;
	public Judeg(int a ) {
		higher = 0;
		lower = 0;
		average = a;
	}
	
	public void judeing() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			int score = scanner.nextInt();
			if (score < 0) {
				System.out.println("高于平均分有"+higher+"人");
				
				break;
			}
			if (score>100) {
				System.out.println("最高分为100，输入失败");
				continue;
			}
			if (score<average) {
				lower++;
			}else {
				higher++;
			}
		}
	}
	
	
	
	
}

public class ScoreJudge {
	public static void main(String[] args) {
		Judeg judeg = new Judeg(60);
		judeg.judeing();
	}
}
