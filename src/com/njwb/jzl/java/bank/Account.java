package com.njwb.jzl.java.bank;

import java.sql.Savepoint;
import java.util.Scanner;

public class Account {
	private String aname;
	private double balance;
	private String apwd;
	private  int aid;
	Scanner scanner = new Scanner(System.in);
	private static int id=0;
	public Account() {
		System.out.println("请输入用户名：");
		aname = scanner.next();
		while(true) {
			System.out.println("请输入密码：");
			apwd = scanner.next();
			System.out.println("请重新输入密码：");
			if (apwd.equals(scanner.next())) {
				
				break;
			}else {
				System.out.println("两次密码输入不一致，请重新输入");
			}
		}
		aid=id;
		id++;
		System.out.println("账户创建成功！您的ID为"+aid);
		
		
	}
	
	public String getName() {
		return aname;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getPwd() {
		return apwd;
	}
	
	public int getAid() {
		return aid;
	}
	
	public boolean isMoney(double money) {
		if (money <0) {
			System.out.println("bad money");
			return false;
		}
		return true;
	}
	
	public boolean checkPwd() {
		System.out.println("请输入用户ID为"+aid+"的密码：");
		for (int i = 0; i < 3; i++) {
			
			String string = scanner.next();
			if (apwd.equals(string)) {
				return true;
			}
			System.out.println("密码错误请重输：");
		}
		System.out.println("3次错误，输入结束");
		return false;
	}
	
	
	public void saveMoney(double money) {
		
		if ( isMoney(money)) {
			balance+=money;
			
		}
	}
	
	public boolean takeMoney(double money) {
		if (!isMoney(money) || !checkPwd()) {
			return false;
		}
		if (balance<money) {
			System.out.println("no enough money");
			return false;
		}
		balance-=money;
		return true;
	}
	
	public void updatePwd() {
		checkPwd();
		while(true) {
			System.out.println("请输入新密码：");
			apwd = scanner.next();
			System.out.println("请重新输入新密码：");
			if (apwd.equals(scanner.next())) {
				
				break;
			}else {
				System.out.println("两次密码输入不一致，请重新输入");
			}
			System.out.println("修改密码成功！");
		}
	}
	
	@Override
	public String toString() {
		String string = "用户名： "+ aname +" ^ 余款" +getBalance()+"^ ID: "+ aid;
		return string;
	}
	
	
	
	
	
}
