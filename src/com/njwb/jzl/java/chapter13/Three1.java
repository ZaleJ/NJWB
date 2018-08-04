package com.njwb.jzl.java.chapter13;

public class Three1 {
	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>();
		queue.add(1);
		queue.add(9);
		queue.add(8);

		for (Integer integer : queue) {
			System.out.println(integer);
		}
	}

}
