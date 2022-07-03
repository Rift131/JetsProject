package com.skilldistillery.jets.entities;

public class ISR extends Jet {

	public ISR() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ISR(String type, String model, String tailNumber, double speed, int range, long price) {
		super(type, model, tailNumber, speed, range, price);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void supportRendered() {
		// TODO Auto-generated method stub
		System.out.println("ISR REPORT: Ground threats detected and streamed to all aircraft.");
	}

	@Override
	public void undetectable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void strikeDelivered() {
		// TODO Auto-generated method stub
		
	}

	// override the fly method of jets & sysout relative message to the jet details and the amount of time the jet can fly until it runs out of fuel (based on speed and range)
}
