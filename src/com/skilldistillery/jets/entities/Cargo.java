package com.skilldistillery.jets.entities;

public class Cargo extends Jet {

	public Cargo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cargo(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void undetectable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void strikeDelivered() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supportRendered() {
		// TODO Auto-generated method stub
		System.out.println("CARGO REPORT: Tools, Equipment and ADVON team loaded. Deploying to FOB.");
	}

	
	// override the fly method of jets & sysout relative message to the jet details
	// and the amount of time the jet can fly until it runs out of fuel (based on
	// speed and range)

}
