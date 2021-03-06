package com.skilldistillery.jets.entities;

public class Fighter extends Jet implements StrikeSortie, SupportSortie {

	public Fighter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fighter(String type, String model, String tailNumber, double speed, int range, long price) {
		super(type, model, tailNumber, tailNumber, speed, range, price);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void strikeDelivered() {
		// TODO Auto-generated method stub
		System.out.println(getPilot() + ", aircraft " + getTailNumber() + " checking in. \nFIGHTER REPORT: Bombs away! Radar targets eliminated. The path is clear!\nAir superiority also established. All enemy aircraft destroyed.\n");
	}

	@Override
	public void supportRendered() {
		// TODO Auto-generated method stub
		System.out.println(getPilot() + ", aircraft " + getTailNumber() + " checking in. \nFIGHTER REPORT: Providing escort for cargo aircraft.\n");
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
