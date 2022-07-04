package com.skilldistillery.jets.entities;

public class Cargo extends Jet implements SupportSortie{

	public Cargo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cargo(String type, String model, String tailNumber, double speed, int range, long price) {
		super(type, model, tailNumber, tailNumber, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void supportRendered() {
		// TODO Auto-generated method stub
		System.out.println("CARGO AIRCRAFT " + getTailNumber() + " REPORT: Tools, Equipment and ADVON team loaded. Deploying to FOB.");
	}

	@Override
	public void launchSortie(boolean x) {
		// TODO Auto-generated method stub
		if (x == false) {
		supportRendered();
		}
	}

	
	// override the fly method of jets & sysout relative message to the jet details
	// and the amount of time the jet can fly until it runs out of fuel (based on
	// speed and range)

}
