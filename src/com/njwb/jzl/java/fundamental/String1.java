package com.njwb.jzl.java.fundamental;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String string = ""+1;
//		String string2 = 1+"";
//		String string3 = "1";
//		System.out.println(string.equals(string3));
		
		
		String string = new String("123");
		String string2 = new String("123");
		System.out.println(string==string2);
		int i = 1;
		System.out.println(++i);
		
		 i =1;
				 int j = 2;
		int  k = i++*++j - --i*j--;
		System.out.println(i+" "+j+" "+k);
		i = 1; j = 2;
		System.out.println(i+""+(++i));
		
		
		//生成4位随机验证码
		System.out.println((int)'A');
		System.out.println((int)'Z');
		System.out.println((int)'a');
		System.out.println((int)'z');
		System.out.println((int)'0');
		System.out.println((int)'9');
	}

}
