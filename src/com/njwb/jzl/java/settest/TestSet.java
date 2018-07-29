package com.njwb.jzl.java.settest;

import java.util.Comparator;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<SetComparable> tsSetComparables = new TreeSet<SetComparable>();
		tsSetComparables.add(new SetComparable("1"));
		tsSetComparables.add(new SetComparable("2"));
		
		for (SetComparable setComparable : tsSetComparables) {
			System.out.println(setComparable);
		}
	}

}



class MyComparator implements Comparator<SetComparable> {
	 
	
	@Override
	public int compare(SetComparable o1, SetComparable o2) {
		SetComparable p1 = o1;
		SetComparable p2 = o2;
		
		
		String string1= p1.getString();
		String string2= p2.getString();
		
			int length = p1.getString().length() < p2.getString().length() ? p1.getString().length() : p2.getString().length();
			
			for (int i = 0; i < length; i++) {
				if (string1.charAt(i) < string2.charAt(i)) {
					return -1;
				}else if (string1.charAt(i) > string2.charAt(i)) {
					return 1;
				}
			}
			return 0;
		
		
	}


}