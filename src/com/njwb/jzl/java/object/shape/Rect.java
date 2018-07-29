package com.njwb.jzl.java.object.shape;

public class Rect extends Shape{
	private double length;
	private double width;
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setA(double length) {
		this.length = length;
	}
	
	public void setB(double width) {
		this.width = width;
	}
	
	
	@Override
	public double getArea() {
		
		return width*length;
	}
	
}
