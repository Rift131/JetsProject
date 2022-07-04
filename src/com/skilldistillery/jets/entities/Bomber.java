package com.skilldistillery.jets.entities;

public class Bomber extends Jet implements Stealthy, StrikeSortie {

	public Bomber() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bomber(String type, String model, String tailNumber, double speed, int range, long price) {
		super(type, model, tailNumber, tailNumber, speed, range, price);
		// TODO Auto-generated constructor stub
	}
// Interface Implementation

	

	@Override
	public void undetectable() {
		// TODO Auto-generated method stub
		System.out.println("BOMBER " + getTailNumber() + " REPORT: Undetectable by enemy radar, entering enemy air space.");
	}

	@Override
	public void strikeDelivered() {
		// TODO Auto-generated method stub
		System.out.println("BOMBER " + getTailNumber() + " REPORT: Bombs on target, returning to base.");
	}


	@Override
	public void launchSortie(boolean x) {
		// TODO Auto-generated method stub
		if (x == true) {
		undetectable();
		strikeDelivered();
		}
	}
}


	

