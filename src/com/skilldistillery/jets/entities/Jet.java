package com.skilldistillery.jets.entities;

import java.util.Objects;

public abstract class Jet {
// follow UML for the fields and methods
	//with 5 prepopulated aircraft, the current count would be 5
	private static int COUNT = 4;
	private String type;
	private String model;
	private double speed;
	private int range;
	private long price;
	
	public Jet() {
		
	}
	
	public Jet(String type, String model, double speed, int range, long price) {
		this.type = type;
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	
	public void fly() {
		// standard sysout for when an aircraft flies
	}
	
	public double getSpeedInMach(double rawSpeed) {
		double mach = rawSpeed;
		return mach;
	}

	
	//****STANDARD METHODS****

	public static int getCOUNT() {
		return COUNT;
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
		return Objects.hash(model, price, range, speed, type);
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
				&& Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jet [type=").append(type).append(", model=").append(model).append(", speed=").append(speed)
				.append(", range=").append(range).append(", price=").append(price).append("]");
		return builder.toString();
	}
	
	
	
}
