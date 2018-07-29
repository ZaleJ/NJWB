package com.njwb.jzl.java.settest;

public class SetComparable implements Comparable<SetComparable>{
	String string = "";
	
	public SetComparable() {
		// TODO Auto-generated constructor stub
	}
	
	public SetComparable(String string) {
		this.string = string;
	}
	
	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		if (this.string.equals(((SetComparable)arg0).string)) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return string;
	}

	@Override
	public int compareTo(SetComparable arg0) {
		// TODO Auto-generated method stub
		String myString = string;
		String hisString = arg0.getString();
		int myLength = string.length();
		int hisLength = arg0.getString().length();
		int minLiength = Math.min(myLength, hisLength);
		
		for(int i = 0; i < minLiength; i++) {
			if (myString.charAt(i) < hisString.charAt(i)) {
				return -1;
			}else {
				return 1;
			}
		}
		return 0;
	}
	
	
}
