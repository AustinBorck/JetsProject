package com.skilldistillery.jets.entities;

public class Passenger extends Jet{

	public Passenger() {
		super();
	}
	public Passenger(String type, String model, double speed, int range, long price) {
		
	}
	@Override
	public void fly() {
		double timeInFlight;
		timeInFlight = getRange() / getSpeed();
		System.out.println("CHUGGA CHUGGA CHUGGA");
		System.out.println("This " + getType() + " " + getModel() + " can fly for: " + timeInFlight + " hours.");
	}
	
	
}
