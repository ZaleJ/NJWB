package com.njwb.jzl.java.chapter13;

import java.util.LinkedList;

public class Queue<E> extends LinkedList<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public boolean add(E arg0) {
		// TODO Auto-generated method stub
//		return super.add(arg0);
		super.addFirst(arg0);
		return true;
	}
	
	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
//		return super.remove(arg0);
		super.removeLast();
		return true;
	}
	
	@Override
	public E get(int arg0) {
		// TODO Auto-generated method stub
		return super.get(arg0);
	}
	
}

class TestQueue{
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
