package com.skilldistillery.jets.entities;

public class UFO extends Jet implements WarpSpeed{
	public UFO() {
		super();
	}
	public UFO(String type, String model, double speed, int range, long price) {
		
	}
	@Override
	public void fly() {
		double timeInFlight;
		timeInFlight = getRange() / getSpeed();
		System.out.println("This " + getType() + " " + getModel() + "can fly for: " + timeInFlight + " hours.");
	}
	
	
}
