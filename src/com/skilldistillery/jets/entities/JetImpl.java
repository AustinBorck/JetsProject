package com.skilldistillery.jets.entities;

public class JetImpl extends Jet{
	AirField fleet = new AirField();
	public JetImpl() {
		
	}

	public JetImpl(String type, String model, double speed, int range, long price) {
		super();
		this.type = type;
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	@Override
	public void fly() {
		double timeInFlight;
		timeInFlight = getRange() / getSpeed();
		System.out.println("This " + getType() + ", " + getModel() + " can fly for: " + timeInFlight + " hours.");
	}

}
