package com.skilldistillery.jets.entities;

public abstract class Jet {
	String type;
	String model;
	double speed;
	int range;
	long price;
	
	public abstract void fly();
	
	public Jet() {
		super();
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
	public String toString() {
		return "Aircraft Type: " + type + ", model: " + model + ", speed: " + speed + " MPH" + ", range: " + range + ", price: $" + price;
	}

	
}