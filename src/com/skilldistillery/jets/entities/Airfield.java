package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import javax.jws.Oneway;

public class Airfield {
	// private List<Jet> fleet = new ArrayList<Jet>();
	private List<Jet> fleet = new ArrayList<Jet>();

	public Airfield() {

	}

	// airfieldPopulate method
	public List<Jet> airfieldPopulate() {
		// pre-populate an instantiated list with 5 aircraft that come from the csv file
		try (BufferedReader bufIn = new BufferedReader(new FileReader("Jets.txt"))) {
			String aircraft;
			while (((aircraft = bufIn.readLine()) != null)) {
				// .split()
				String[] eachAcft = aircraft.split(",");
				// set the parameters of the aircraft to their respective types and feed into
				// the fleet array
				String type = eachAcft[0];
				String make = eachAcft[1];
				double speed = Double.parseDouble(eachAcft[2]);
				int range = Integer.parseInt(eachAcft[3]);
				long price = Long.parseLong(eachAcft[4]);
				if (type.equals("Bomber")) {
					Bomber bomber = new Bomber(type, make, speed, range, price);
					fleet.add(bomber);
				} else if (type.equals("Fighter")) {
					Fighter fighter = new Fighter(type, make, speed, range, price);
					fleet.add(fighter);
				} else if (type.equals("ISR")) {
					ISR iSR = new ISR(type, make, speed, range, price);
					fleet.add(iSR);
				} else if (type.equals("Cargo")) {
					Cargo cargo = new Cargo(type, make, speed, range, price);
					fleet.add(cargo);
				} else if (type.equals("Tanker")) {
					Tanker tanker = new Tanker(type, make, speed, range, price);
					fleet.add(tanker);
				} else if (type.equals("JetBaseModel")) {
					JetBaseModel defaultAcft = new JetBaseModel(type, make, speed, range, price);
					fleet.add(defaultAcft);
				} else {
					System.out.println("Aircraft type not recognized.");
				}
			}

		} catch (IOException e) {
			System.err.println(e);

		}
		System.out.println(fleet);
		return fleet;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Current fleet of aircraft:").append(fleet).append(".");
		return builder.toString();
	}

}
