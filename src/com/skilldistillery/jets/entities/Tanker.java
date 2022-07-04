package com.skilldistillery.jets.entities;

public class Tanker extends Jet implements SupportSortie{

	public Tanker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tanker(String type, String model, String tailNumber, double speed, int range, long price) {
		super(type, model, tailNumber, tailNumber, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void supportRendered() {
		// TODO Auto-generated method stub
		System.out.println(getPilot() + ", aircraft " + getTailNumber() + " checking in. \nTANKER REPORT: On the track. Bomber and Fighter Aircraft aerial refuel INW.\n");
	}

	@Override
	public void launchSortie(boolean x) {
		// TODO Auto-generated method stub
		if (x == false) {
		supportRendered();
		}
	}

	

	// override the fly method of jets & sysout relative message to the jet details and the amount of time the jet can fly until it runs out of fuel (based on speed and range)
}
