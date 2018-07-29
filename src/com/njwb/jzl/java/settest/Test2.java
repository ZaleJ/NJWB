package com.njwb.jzl.java.settest;

import java.util.*;
public class Test2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyComByA com = new MyComByA();
        TreeMap<Company1, String> tm = new TreeMap<Company1, String>();
        Company1 c1 = new Company1("baidu",10010,"aaa",12);
        Company1 c2 = new Company1("baid",10010,"aaa",1);
//      tm.put(c1, "aaa");
//      tm.put(c2, "aaa");

        TreeSet<Company1> ts = new TreeSet<Company1>();
        ts.add(c1);
        ts.add(c2);
        System.out.println(ts);
    }

}
class MyComByA implements Comparator<Company1>
{
    @Override
    public int compare(Company1 c1, Company1 c2) {
        // TODO Auto-generated method stub
        int n = c1.num - c2.num;
        n = n==0?c1.Founder.compareTo(c2.Founder):n;
        n = n==0?c1.name.compareTo(c2.name):n;
        n = n==0?c1.no-c2.no:n;

        return n;
    }
}
class Company1 {
    String name;
    int num;
    String Founder;
    int no;


    public Company1(String name, int num, String founder, int no) {
        super();
        this.name = name;
        this.num = num;
        Founder = founder;
        this.no = no;
    }
//  public int compareTo(Company1 c){
//      int n = num - c.num;
//      
//      n = n==0?name.compareTo(c.name):n;
//      return n;
//  }
    public boolean equals(Company1 c){
        int n = num - c.num;
        n = n==0?name.compareTo(c.name):n;
        if(n==0)
        return true;
        else return false;
    }
    public String toString(){

        return "姓名："+name+"  num:"+num+"  "+no+"  "+Founder;
    }
}