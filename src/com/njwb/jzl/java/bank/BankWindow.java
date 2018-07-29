package com.njwb.jzl.java.bank;


public class BankWindow {
	private static Bank bank = new Bank();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			bank.doUse();
		}
	}

}
