package com.skilldistillery.jets.entities;

public class ISR extends Jet{

	public ISR() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ISR(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	// override the fly method of jets & sysout relative message to the jet details and the amount of time the jet can fly until it runs out of fuel (based on speed and range)
}
