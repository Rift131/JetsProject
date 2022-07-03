package com.skilldistillery.jets.entities;

public class Fighter extends Jet {

	public Fighter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fighter(String type, String model, String tailNumber, double speed, int range, long price) {
		super(type, model, tailNumber, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void undetectable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void strikeDelivered() {
		// TODO Auto-generated method stub
		System.out.println("FIGHTER REPORT: Bombs away! Radar targets eliminated. The path is clear.\nFIGHTER REPORT: Air superiority established. All enemy aircraft destroyed.");
	}

	@Override
	public void supportRendered() {
		// TODO Auto-generated method stub
		System.out.println("FIGHTER REPORT: On patrol. Standing by for on-demand ATG support or bomber escort.");
	}

	

	// override the fly method of jets & sysout relative message to the jet details and the amount of time the jet can fly until it runs out of fuel (based on speed and range)

}
