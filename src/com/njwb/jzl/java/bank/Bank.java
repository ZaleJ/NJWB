package com.njwb.jzl.java.bank;

import java.util.ArrayList;
import java.util.Scanner;


public class Bank {
	private static ArrayList<Account> users = new ArrayList<Account>();
	
	public Bank() {
		
	}
	
	public void AddNewAccount() {
		Account account = new Account();
		users.add(account);
	}
	
	public void AddExistAccount(Account account) {
		users.add(account);
	}
	
	
	public void showAllAccountInfo() {
		for(Account tmp:users){
            System.out.println(tmp);
        }
	}
	
	public boolean isInBankAccount(int aid) {
		for(Account tmp:users){
            if (tmp.getAid()==aid) {
				return true;
			}
        }
		System.out.println("account not found");
		return false;
	}
	
	public int AccountPosition(int aid) {
		if (isInBankAccount(aid)) {
			for(int i = 0;i < users.size(); i ++){
	            if (users.get(i).getAid()==aid) {
					return i;
				}
	        }
		}
		return -1;
	}
	
	public boolean saveAccountMoney(int aid, double money) {
		if (!isInBankAccount(aid)) {
			return false;
		}
		users.get(AccountPosition(aid)).saveMoney(money);
		return true;
		
	}
	
	public boolean getMoney(int aid, double money) {
		if (!isInBankAccount(aid)) {
			return false;
		}
		if (users.get(AccountPosition(aid)).takeMoney(money)) {
			return true;
		}
		return false;
	}
	
	
	public boolean transportMoney(int takeid, int getid, double money) {
		if (isInBankAccount(takeid) && isInBankAccount(getid) && users.get(AccountPosition(takeid)).takeMoney(money)) {
			users.get(AccountPosition(getid)).saveMoney(money);
			return true;
		}
		return false;
	}
	
	
	public boolean updatePwd() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please input your user ID:");
		int aid = scanner.nextInt();
		if (isInBankAccount(aid)) {
			users.get(AccountPosition(aid)).updatePwd();
			return true;
		}
		return false;
	}
	
	public boolean Login() {
		String username = "admin";
		String password = "admin";
		Scanner scanner = new Scanner(System.in);
		System.out.println("------欢迎访问世界上最不安全的银行系统---------");
		while(true) {
			System.out.println("请输入用户名：");
			String strNam = scanner.next();
			System.out.println("请输入密码：");
			String strPwd = scanner.next();
			if (username.equals(strNam) && password.equals(strPwd)) {
				return true;
			}
			
			System.out.println("用户名或密码错误，请重新输入");
		}
		
		
		
	}
	
	
	
	public void checkAccount() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户ID：");
		int aid = scanner.nextInt();
		if (isInBankAccount(aid)) {
			System.out.println(users.get(AccountPosition(aid)));
		}
	}
	
	
	
	
	public void doUse() {
		Login();
		while(true) {
			System.out.println("--------------------------------");
			System.out.println("0. 显示所有账户");
			System.out.println("1. 添加账户");
			System.out.println("2. 存钱");
			System.out.println("3. 取钱");
			System.out.println("4. 转账");
			System.out.println("5. 修改密码");
			System.out.println("6. 查看账户信息");
			System.out.println("999. 退出");
			Scanner scanner = new Scanner(System.in);
			int select = scanner.nextInt();
			switch (select) {
			case 0:
				showAllAccountInfo();
				break;
			case 1:
				AddNewAccount();
				break;
			case 2:{
				System.out.println("请输入用户id");
				int aid = scanner.nextInt();
				System.out.println("请输入存入金额：");
				double money = scanner.nextDouble();
				saveAccountMoney(aid, money);
				break;
			}
			case 3:
			{
				System.out.println("请输入用户id");
				int aid = scanner.nextInt();
				System.out.println("请输入存入金额：");
				double money = scanner.nextDouble();
				getMoney(aid, money);
				break;
			}
			case 4:
			{
				System.out.println("请输入转出用户ID：");
				int takeid = scanner.nextInt();
				System.out.println("请输入转入用户ID：");
				int getid = scanner.nextInt();
				System.out.println("请输入金额：");
				double money = scanner.nextDouble();
				transportMoney(takeid, getid, money);
				break;
			}
			case 5:
			{
				updatePwd();
				break;
			}
			case 6:
			{
				checkAccount();
				
			}
			case 999:
			{
				return;
			}
			default:
				break;
			}
		}
	}
	
	
	
}
