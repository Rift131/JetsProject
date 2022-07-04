package com.skilldistillery.jets.entities;

public class JetBaseModel extends Jet implements SupportSortie {

	public JetBaseModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JetBaseModel(String type, String model, String tailNumber, double speed, int range, long price) {
		super(type, model, tailNumber, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void supportRendered() {
		// TODO Auto-generated method stub
		System.out.println("Aircraft " + getTailNumber() + " has generally supported the sortie... in some general way that is generally appreciated by all, generally speaking.");
	}

	@Override
	public void launchSortie(boolean x) {
		// TODO Auto-generated method stub
		if (x == false) {
		supportRendered();
		}
	}

}
