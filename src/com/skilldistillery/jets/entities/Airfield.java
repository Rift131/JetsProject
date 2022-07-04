package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Airfield {
	// private List<Jet> fleet = new ArrayList<Jet>();
	private List<Jet> fleet = new ArrayList<Jet>();
	private String[] pilotPool = { "Scarecrow", "Father", "Two Dogs", "Igor", "FIIG", "Gucci", "Ghost", "Bling",
			"Crusher", "Elvis", "Spiderman", "Hacksaw" };

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
				String model = eachAcft[1];
				String tailNumber = eachAcft[2];
				double speed = Double.parseDouble(eachAcft[3]);
				int range = Integer.parseInt(eachAcft[4]);
				long price = Long.parseLong(eachAcft[5]);

				if (type.equals("Bomber")) {
					Bomber bomber = new Bomber(type, model, tailNumber, speed, range, price);
					bomber.setPilot(randomPilot());
					fleet.add(bomber);
				} else if (type.equals("Fighter")) {
					Fighter fighter = new Fighter(type, model, tailNumber, speed, range, price);
					fighter.setPilot(randomPilot());
					fleet.add(fighter);
				} else if (type.equals("ISR")) {
					ISR iSR = new ISR(type, model, tailNumber, speed, range, price);
					iSR.setPilot(randomPilot());
					fleet.add(iSR);
				} else if (type.equals("Cargo")) {
					Cargo cargo = new Cargo(type, model, tailNumber, speed, range, price);
					cargo.setPilot(randomPilot());
					fleet.add(cargo);
				} else if (type.equals("Tanker")) {
					Tanker tanker = new Tanker(type, model, tailNumber, speed, range, price);
					tanker.setPilot(this.randomPilot());
					fleet.add(tanker);
				} else if (type.equals("General Jet Aircraft")) {
					JetBaseModel defaultAcft = new JetBaseModel(type, model, tailNumber, speed, range, price);
					defaultAcft.setPilot(randomPilot());
					fleet.add(defaultAcft);
				} else {
					System.out.println("Aircraft type not recognized.");
				}
			}

		} catch (IOException e) {
			System.err.println(e);

		}
		return fleet;
	}

// fly method
	public void scrambleAllJets() {
		for (Jet aircraft : fleet) {
			aircraft.fly();
		}
	}

	public void scrambleSingleJet(String usersTailNumber) {
		for (Jet aircraft : fleet) {
			if (aircraft.getTailNumber().equals(usersTailNumber))
				aircraft.fly();
		}
	}

	public Jet viewFastestJet() {
		double greatestSpeed = fleet.get(0).getSpeed();
		Jet fastestAircraft = fleet.get(0);
		for (int i = 1; i < fleet.size(); i++) {
			if (fleet.get(i).getSpeed() > greatestSpeed) {
				greatestSpeed = fleet.get(i).getSpeed();
				fastestAircraft = fleet.get(i);
			}
		}
		return fastestAircraft;
	}

	public Jet viewLongestRangeJet() {
		int longestRange = fleet.get(0).getRange();
		Jet enduranceAircraft = fleet.get(0);
		for (int i = 1; i < fleet.size(); i++) {
			if (fleet.get(i).getRange() > longestRange) {
				longestRange = fleet.get(i).getRange();
				enduranceAircraft = fleet.get(i);
			}
		}
		return enduranceAircraft;
	}

	public void launchSupportSorties() {
		for (Jet supportAcft : fleet) {
			supportAcft.launchSortie(false);
		}
	}

	public void launchStrikeSorties() {
		for (Jet strikeAcft : fleet) {
			strikeAcft.launchSortie(true);
		}
	}

	public void acquisitionNewAircraft(String type, String model, String tailNumber, double speed, int range,
			long price) {
		if (type.equals("Bomber")) {
			Bomber bomber = new Bomber(type, model, tailNumber, speed, range, price);
			bomber.setPilot(this.randomPilot());
			fleet.add(bomber);
		} else if (type.equals("Fighter")) {
			Fighter fighter = new Fighter(type, model, tailNumber, speed, range, price);
			fighter.setPilot(this.randomPilot());
			randomPilot();
			fleet.add(fighter);
		} else if (type.equals("ISR")) {
			ISR iSR = new ISR(type, model, tailNumber, speed, range, price);
			iSR.setPilot(this.randomPilot());
			fleet.add(iSR);
		} else if (type.equals("Cargo")) {
			Cargo cargo = new Cargo(type, model, tailNumber, speed, range, price);
			cargo.setPilot(this.randomPilot());
			fleet.add(cargo);
		} else if (type.equals("Tanker")) {
			Tanker tanker = new Tanker(type, model, tailNumber, speed, range, price);
			tanker.setPilot(this.randomPilot());
			fleet.add(tanker);
		} else if (type.equals("General Jet Aircraft")) {
			JetBaseModel defaultAcft = new JetBaseModel(type, model, tailNumber, speed, range, price);
			defaultAcft.setPilot(this.randomPilot());
			fleet.add(defaultAcft);
		} else {
			System.out.println("Aircraft type not recognized.");
		}
		System.out.println("Aircraft acquired!");
	}

	public boolean tailNumberExists(String tNumber) {
		boolean validTail = false;
		for (Jet tailCheck : fleet) {
			if (tailCheck.getTailNumber().equals(tNumber)) {
				validTail = true;
				break;
			}
		}
		return validTail;
	}

	public void decomissionAcft(String tNumber) {
		Jet decomissionAcft = null;
		for (Jet aircraft : fleet) {
			if (aircraft.getTailNumber().equals(tNumber)) {
				decomissionAcft = aircraft;
			}
		}

		for (Iterator<Jet> iterator = fleet.iterator(); iterator.hasNext();) {
			Jet boneyardDelivery = iterator.next();
			if (boneyardDelivery.equals(decomissionAcft)) {
				System.out.println("Aircraft " + tNumber + " has been shipped to the boneyard.");
				iterator.remove();
			}
		}
	}

	public String randomPilot() {
		String pilot = "Deafult Pilot";
			// int set to a random number within the range (12) of the pilot name array size
			int max = 11;
			int min = 1;
			int range = max - min + 1;
			int randomPilot = (int) (Math.random() * range) + min;
			pilot = pilotPool[randomPilot];
			// aircraft.add pilot name array at random number
		
		return pilot;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		int listNumber = 0;
		for (Jet aircraft : fleet) {
			builder.append(listNumber + 1).append(". ").append(aircraft).append("\n");
					;
			listNumber++;
		}
		return builder.toString();
	}

}