package com.njwb.jzl.java.object.instrument;

public class Violin extends Instrument {

	public Violin() {
		setName("Violin");
	}
	@Override
	public void play() {
		System.out.println("violin play");
	}
	
}
