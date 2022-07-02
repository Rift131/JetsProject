package com.skilldistillery.jets.entities;

public class Bomber extends Jet implements WeaponsLoadOut {

	public Bomber() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bomber(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void weaponStatus() {
		// TODO Auto-generated method stub
		System.out.println("Bombs loaded.");
	}

	
	
	// override the fly method of jets & sysout relative message to the jet details and the amount of time the jet can fly until it runs out of fuel (based on speed and range)}

}