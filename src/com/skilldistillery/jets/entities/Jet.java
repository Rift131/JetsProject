package com.skilldistillery.jets.entities;

import java.text.DecimalFormat;
import java.util.Objects;

public abstract class Jet implements LaunchSortie {
// follow UML for the fields and methods
	//with 5 prepopulated aircraft, the current count would be 5
	private static int COUNT = 4;
	private String type;
	private String model;
	private String pilot;
	protected String tailNumber;
	private double speed;
	private int range;
	private long price;
	
	private final DecimalFormat df = new DecimalFormat("0.00");
	private final DecimalFormat money = new DecimalFormat("$#,###0.00");

	
	
	public Jet() {
		
	}
	
	public Jet(String type, String model, String tailNumber, String pilot, double speed, int range, long price) {
		this.type = type;
		this.model = model;
		this.tailNumber = tailNumber;
		this.pilot = pilot;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	
	public void fly() {
		// standard sysout of flying message, range for when an aircraft flies
		double sortieDuration = (range / speed) * 60;
		
		System.out.println(pilot + " checking in! Flying a " + model + " model, tail number " + tailNumber + ". I'm maintaining a mach speed of " + getSpeedInMach(speed) + " with a range of " + range + " miles. I can fly for a duration of " + (Math.round(sortieDuration)) + " minutes at this speed.");
	}
	
	public String getSpeedInMach(double rawSpeed) {
		double mach = rawSpeed * .00130332;
		String result = df.format(mach);
		return result;
	}

	
	//****STANDARD METHODS****

	public static int getCOUNT() {
		return COUNT;
	}

	public String getPilot() {
		return pilot;
	}

	public void setPilot(String pilot) {
		this.pilot = pilot;
	}

	public static void setCOUNT(int cOUNT) {
		COUNT = cOUNT;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getTailNumber() {
		return tailNumber;
	}
	
	public void setTailNumber(String tailNumber) {
		this.tailNumber = tailNumber;
	}
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(model, price, range, speed, tailNumber, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Jet other = (Jet) obj;
		return Objects.equals(model, other.model) && price == other.price && range == other.range
				&& Double.doubleToLongBits(speed) == Double.doubleToLongBits(other.speed)
				&& Objects.equals(tailNumber, other.tailNumber) && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Type: ").append(type).append(", Model: ").append(model).append(", Tail Number: ").append(tailNumber).append(",\nSpeed (MPH): ").append(speed).append(", Mach: ").append(getSpeedInMach(speed)).append(", Range: ").append(range).append(", Price: ").append(money.format(getPrice())).append(", Pilot Assigned: ").append(getPilot());
		return builder.toString();
	}
}