package com.njwb.jzl.java.fundamental;

import java.util.Scanner;

public class TestWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner scanner = new Scanner(System.in);
		//
		// int i = scanner.nextInt();
		// int temp = 1;
		// int i1 = 1;
		// int i2 = 2;
		// int i3 = 3;
		// while(temp<i) {
		// if (temp==1) {
		// System.out.print(1+ " ");
		// System.out.println();
		// temp++;
		// continue;
		// }
		// if (temp==2) {
		// System.out.print(1+ " "+2+" ");
		// System.out.println();
		// temp++;
		// continue;
		// }
		// System.out.print(1+ " ");
		// System.out.print(1+ " "+2+" ");
		// for(int j = 2 ; j < temp+1; j++) {
		// System.out.print(i1+i2+" ");
		// i3 = i1;
		// i1=i2;
		// i2=i3+i1;
		// }
		// i1=1;
		// i2=2;
		//
		// System.out.println();
		// temp++;
		// }

		Scanner scanner = new Scanner(System.in);
		String answer = "hello world";
		while (!scanner.next().equals(answer)) {

			System.out.println("wrong answer");

		}

		System.out.println("right");
		
		
		System.out.println();
		
		
//		String s1String = new String("123");
//		String s2String = new String("123");
//		System.out.println(s1String+s2String);
//		System.out.println(s1String==s2String);
//		s1String="123";
//		s2String="123";
//		System.out.println(s1String==s2String);

	}

}
