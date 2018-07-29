package com.njwb.jzl.java.object.instrument;

public abstract class Instrument {
	public String name;
    public void setName(String name) {
       this.name = name;
    }
    public abstract void play();
}
