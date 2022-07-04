package com.skilldistillery.jets.entities;

public class Fighter extends Jet implements StrikeSortie, SupportSortie {

	public Fighter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fighter(String type, String model, String tailNumber, double speed, int range, long price) {
		super(type, model, tailNumber, speed, range, price);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void strikeDelivered() {
		// TODO Auto-generated method stub
		System.out.println("FIGHTER " + getTailNumber() + " REPORT: Bombs away! Radar targets eliminated. The path is clear.\nFIGHTER " + getTailNumber() + " REPORT: Air superiority established. All enemy aircraft destroyed.");
	}

	@Override
	public void supportRendered() {
		// TODO Auto-generated method stub
		System.out.println("FIGHTER " + getTailNumber() + " REPORT: Providing escort for cargo aircraft.");
	}

	@Override
	public void launchSortie(boolean x) {
		// TODO Auto-generated method stub
		if (x == false) {
		supportRendered();
		} else {
		strikeDelivered();
		}
	}

}
