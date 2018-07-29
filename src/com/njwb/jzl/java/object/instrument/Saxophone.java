package com.njwb.jzl.java.object.instrument;

public class Saxophone extends Instrument{
	public Saxophone() {
		setName("Saxophone");
	}
	@Override
	public void play() {
		System.out.println("Saxophone play");
	}
}
